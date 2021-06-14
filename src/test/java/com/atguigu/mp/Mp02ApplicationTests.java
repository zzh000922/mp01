package com.atguigu.mp;

import com.atguigu.mp.bean.Employee;
import com.atguigu.mp.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Mp02ApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void testARInsert(){
        Employee employee = new Employee();
        employee.setLastName("宋红康");
        employee.setEmail("shk@atguigu.com");
        employee.setGender(1);
        boolean b = employee.insert();
        System.out.println(b?"成功":"失败");
    }


}
