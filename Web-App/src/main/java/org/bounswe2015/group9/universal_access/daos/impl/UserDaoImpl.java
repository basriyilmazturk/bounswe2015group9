package org.bounswe2015.group9.universal_access.daos.impl;

import org.bounswe2015.group9.universal_access.daos.IUserDao;
import org.bounswe2015.group9.universal_access.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User, Long> implements IUserDao{
    @Override
    public User getUserByEmail(String email) {
        return super.readByProperty("email", email);
    }
    @Override
    public User getUserById(String id) {
        return super.readByProperty("id", id);
    }
//    @Override
//    public List<User> getAllUsers(){return super.getAll();}
}
