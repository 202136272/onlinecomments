package com.kabaso.onlinecomments.factories;

import com.kabaso.onlinecomments.domain.Role;
import com.kabaso.onlinecomments.factories.Impl.RoleFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by hashcode on 2016/03/18.
 */
public class RoleTest {
    private RoleFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = RoleFactoryImpl.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        Role role = factory.createRole("ADMIN", "System Administrator");
        Assert.assertEquals(role.getDescription(),"System Administrator");
        Assert.assertEquals(role.getName(),"ADMIN");
        Assert.assertNotNull(role.getId());
    }


    @Test
    public void testRoleUpdate() throws Exception {
        Role role = factory.createRole("ADMIN", "System Administrator");
        Assert.assertEquals(role.getDescription(),"System Administrator");
        Assert.assertEquals(role.getName(),"ADMIN");
        Assert.assertNotNull(role.getId());

        // Updated Description

        Role updateRole = new Role.Builder()
                .copy(role)
                .description("Administrator")
                .build();

        Assert.assertEquals(updateRole.getDescription(),"Administrator");
        Assert.assertEquals(role.getName(),updateRole.getName());
        Assert.assertEquals(role.getId(),updateRole.getId());




    }
}
