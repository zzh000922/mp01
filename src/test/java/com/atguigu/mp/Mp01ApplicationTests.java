package com.atguigu.mp;

import com.atguigu.mp.bean.Employee;
import com.atguigu.mp.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.midi.Soundbank;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;

@SpringBootTest
class Mp01ApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    void contextLoads() throws SQLException {
        Connection connection = dataSource.getConnection();
    }
    @Test
    public void testCommonInsert(){
        Employee employee = new Employee();
        employee.setAge(22);
        employee.setLastName("MP");
        employee.setEmail("mp@atguigu.com");
        employee.setGender(1);
        int insert = employeeMapper.insert(employee);
        System.out.println(insert);
    }

}
