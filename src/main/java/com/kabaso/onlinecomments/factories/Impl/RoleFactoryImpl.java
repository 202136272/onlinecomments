package com.kabaso.onlinecomments.factories.Impl;

import com.kabaso.onlinecomments.domain.Role;
import com.kabaso.onlinecomments.factories.RoleFactory;

import java.util.UUID;

/**
 * Created by hashcode on 2016/03/18.
 */
public class RoleFactoryImpl implements RoleFactory{

    private static RoleFactoryImpl factory = null;

    private  RoleFactoryImpl() {
    }
    public static RoleFactoryImpl getInstance(){
        if(factory ==null)
            factory = new RoleFactoryImpl();
        return factory;
    }

    public Role createRole(String name, String description) {
        Role  role = new Role
                .Builder()
                .id(UUID.randomUUID().toString())
                .name(name)
                .description(description)
                .build();
        return role;
    }
}
