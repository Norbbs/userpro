package com.norbs.userpro.repository.user;

import com.norbs.userpro.domain.user.User;
import com.norbs.userpro.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Norbs on 21/09/2016.
 */
@Repository(value = "userRepository")
public class UserRepository extends BaseRepository<User> {

    @Override
    public void add(User user) {
        this.getEntityManager().persist(user);
    }
}