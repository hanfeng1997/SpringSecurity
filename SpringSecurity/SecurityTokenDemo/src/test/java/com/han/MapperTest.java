package com.han;

import com.han.entity.User;
import com.han.mapper.MenuMapper;
import com.han.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MenuMapper mapper;

    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void testBCryptPasswordEncoder(){
        String encode = passwordEncoder.encode("1234");
        String encode2 = passwordEncoder.encode("1234");

        System.out.println(encode);
        System.out.println(encode2);

        // $2a$10$ASbZ.DgRupOjmpFUBtSHru9y5Qa/dFyik2utfKWihBQV3VDMMNfBm
        boolean res = passwordEncoder.matches("1234", "$2a$10$ASbZ.DgRupOjmpFUBtSHru9y5Qa/dFyik2utfKWihBQV3VDMMNfBm");
        System.out.println(res);
    }

    @Test
    public void testSelectPermsByUserId(){
        List<String> strings = mapper.selectPermsByUserId(2L);
        System.out.println(strings);
    }
}
