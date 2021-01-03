package com.baidu;

import com.pojo.User;
import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    User mapSelect(Map<String,Object> map);
}
