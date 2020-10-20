package com.liuxingyu.dao;


import com.liuxingyu.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class UserDAOTest {
    public static void main(String[] args) {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            UserDAO mapper = sqlSession.getMapper(UserDAO.class);
            List<User> users = mapper.queryAll();
            User user = mapper.queryById(7);
            User user1 = mapper.queryById(10);
            System.out.println(users);
            System.out.println(user1);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
