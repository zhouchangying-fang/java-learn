package com.baidu;

import com.pojo.User;
import com.util.Mybatis;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = Mybatis.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        //getUserList
        List<User> userList = userDao.getUserList();
        for (User user:userList){
            System.out.println(user);
        }

        //getUserById
        User user = userDao.getUserById(2);
        System.out.println(user);

        //addUser
        int id =userDao.addUser(new User("heini",18));
        System.out.println(id);

        //updateUser
        int uid = userDao.updateUser(new User(1,"heini1",22));
        System.out.println(uid);

        //deleteUser
        int did = userDao.deleteUser(3);
        System.out.println(did);

        //mapSelect
        Map map = new HashMap<String,Object>();
        map.put("name","heini");
        map.put("age",21);
        User user1 = userDao.mapSelect(map);
        System.out.println(user);

        sqlSession.close();
    }
}
