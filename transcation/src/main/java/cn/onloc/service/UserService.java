package cn.onloc.service;

import cn.onloc.bean.User;

public interface UserService {

    User getUserById(Integer id);

    User updateUserById(Integer id);

}
