package com.hsd.plus;

import com.hsd.plus.entity.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DeptARTest {

    @Test
    public void testARInsert(){
        //定义Dept的实体
        Dept dept = new Dept();
        dept.setName("销售部");
        dept.setMobile("010-12345678");
        dept.setManager(1);

        //调用实体对象自己的方法
        boolean flag = dept.insert();
        System.out.println("ar insert result:"+flag);
    }

}
