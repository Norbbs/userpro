package com.norbs.userpro.repository.base;

/**
 * Created by Norbs on 19/09/2016.
 */
public interface Repository<EntityClass> {

    void add(EntityClass entity);
}