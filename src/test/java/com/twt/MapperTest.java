package com.twt;

import com.twt.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    UserMapper userMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    void testGetUserRoles(){
        System.out.println(userMapper.getUserRoles(1L));
    }

    @Test
    void testEncoder(){
        System.out.println(passwordEncoder.encode("twtsuif"));
    }
}
