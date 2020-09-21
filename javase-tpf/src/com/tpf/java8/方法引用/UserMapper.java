package com.tpf.java8.方法引用;

/**
 * <p> </p >
 *
 * @author : tianpf
 * @version :  UserMapper.java,v 1.0, 2020/8/27-11:00 tianpengfei Exp $
 */
public interface UserMapper {

    User getUserByName(String name);

    int insertUser(User user);
}
