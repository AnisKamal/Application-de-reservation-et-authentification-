package com.reservation.genericdao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;


public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

	@PersistenceContext
	protected EntityManager em;

    private Class<T> type;

    public GenericDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public long countAll(final Map<String, Object> params) {

        final StringBuffer queryString = new StringBuffer(
                "SELECT count(o) from ");

        queryString.append(type.getSimpleName()).append(" o ");
       // queryString.append(this.getQueryClauses(params, null));

        final Query query = this.em.createQuery(queryString.toString());

        return (Long) query.getSingleResult();
    }

    @Override
    public T create(final T t) {
    	this.em.persist(t);
        return t;
    }

    @Override
    public void delete(final PK id) {
        this.em.remove(this.em.getReference(type, id));
    }

    @Override
    public T find(final PK id) {
        return (T) this.em.find(type, id);
    }

    @Override
    public T update(final T t) {
        return this.em.merge(t);    
    }

}
