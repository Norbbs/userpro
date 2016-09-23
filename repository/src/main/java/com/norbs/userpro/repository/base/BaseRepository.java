package com.norbs.userpro.repository.base;

import com.norbs.userpro.entity.base.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Norbs on 21/09/2016.
 */
public abstract class BaseRepository<T extends BaseEntity>  implements Repository<T> {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public void add(T entity) {
        this.entityManager.persist(entity);
    }
}