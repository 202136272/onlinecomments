package com.kabaso.onlinecomments.factories;

import com.kabaso.onlinecomments.domain.Role;

/**
 * Created by hashcode on 2016/03/18.
 */
public interface RoleFactory {
    Role createRole(String name, String description);
}
