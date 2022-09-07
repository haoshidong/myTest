package com.hsd.plus;

import com.hsd.plus.entity.User;
import com.hsd.plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SuppressWarnings("all")
@SpringBootTest
class PlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserInsert(){
        //创建User对象
        User user = new User();
        user.setAge(20);
        user.setName("张三");
        user.setEmail("zhangsan@sina.com");

        //调用UserMapper的方法，也就是父接口BaseMapper中的提供的方法
        int rows = userMapper.insert(user);
        System.out.println("insert 的结果："+rows);
    }

}
