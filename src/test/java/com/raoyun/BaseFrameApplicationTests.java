package com.raoyun;

import com.raoyun.entity.User;
import com.raoyun.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaseFrameApplicationTests {

//    @Autowired
//    DataSource dataSource;
//
//    @Test
//    void contextLoads() throws SQLException {
//        System.out.println(dataSource.getConnection());
//    }

    @Autowired
    UserMapper userMapper;

    @Test
    void testInsert(){
        User user = new User();
        user.setName("夏一帆");
        user.setPassword("123456");
        user.setEmail("123@qq.com");
        userMapper.insert(user);
    }

}
