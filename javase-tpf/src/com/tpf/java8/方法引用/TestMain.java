package com.tpf.java8.方法引用;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  Test.java,v 1.0, 2020/8/27-11:02 tianpengfei Exp $
 */
public class TestMain {

    public static void main(String[] args) {
        // mapper接口   int insertUser(User user);
        UserMapper userMapper;

        List<User> userList = new ArrayList<>();
//
//        userList.forEach(user -> userMapper.insertUser(user));
//
//        userList.forEach(userMapper::insertUser);
//
        User user = new User();
        List<String> list = new ArrayList<>();
        list.forEach(user::setName);
        list.forEach(user::aaa);

        list.forEach(name -> user.setName(name));

    }
}
