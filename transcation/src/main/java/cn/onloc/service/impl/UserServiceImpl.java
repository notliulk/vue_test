package cn.onloc.service.impl;

import cn.onloc.bean.User;
import cn.onloc.dao.UserDao;
import cn.onloc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {

        User user = userDao.getUserById(id);

        return user;
    }

    @Override
    public User updateUserById(Integer id) {
        User user = userDao.getUserById(id);

        return user;
    }
}
