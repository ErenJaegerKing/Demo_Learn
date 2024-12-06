package com.example.securitytest;

import com.example.securitytest.domain.User;
import com.example.securitytest.mapper.MenuMapper;
import com.example.securitytest.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
class SecurityTestApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    MenuMapper menuMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "123456"; // 原始密码
        String encodedPassword = encoder.encode(rawPassword); // 编码后的密码

        System.out.println("Encoded password: " + encodedPassword);

        System.out.println(encoder.matches("123456","$2a$10$2YVUQIPhqgkV4fUNQ6fYWemxmXVMfLfVvcvr4QjqI.2dp3MIn4JB2"));

    }

    @Test
    void get() {
        List<String> list = menuMapper.selectPermsByUserId(Long.valueOf("14787164048663"));
        System.out.println(list);
    }
}
