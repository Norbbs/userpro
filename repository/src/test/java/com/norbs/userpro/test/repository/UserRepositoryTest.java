package com.norbs.userpro.test.repository;

import com.norbs.userpro.entity.user.User;
import com.norbs.userpro.repository.base.Repository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Norbs on 23/09/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTest {

    @Autowired
    private Repository<User> userRepository;

    @Test
    public void testAdd1() {
        User user = new User();
        user.setEmail("norbbs@gmail.com");
        user.setPassword("norbbs");
        user.setFullName("Norberto Rodriguez");
        this.userRepository.add(user);
        Assert.assertTrue(user.getId() > 0);
    }
}