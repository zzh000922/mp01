package com.atguigu.mp;

import com.atguigu.mp.bean.Employee;
import com.atguigu.mp.mapper.EmployeeMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    @Test
    public void testARYpdate(){
        Employee employee = new Employee();
        employee.setLastName("宋红康");
        employee.setEmail("shk@atguigu.com");
        employee.setGender(1);
        employee.setAge(36);
        employee.setId(11);
        boolean b = employee.updateById();
        System.out.println(b?"成功":"失败");
    }

    @Test
    public void testARSelect(){
        Employee employee = new Employee();
//        employee.setId(11);
//        employee = employee.selectById(11);
//        System.out.println(employee);
//        List<Employee> employees = employee.selectAll();
//        employees.forEach(System.out::println);
//        List<Employee> employees = employee.selectList(new QueryWrapper<Employee>().like("last_name", "宋红康"));
//        employees.forEach(System.out::println);
        Integer integer = employee.selectCount(new QueryWrapper<Employee>().eq("gender", 0));
        System.out.println("数量： "+integer);
    }

    @Test
    public void testARDelete(){
        Employee employee = new Employee();
        //employee.setId(9);
//        boolean b = employee.deleteById(9);
//        System.out.println(b?"成功":"失败");
        boolean b = employee.delete(new QueryWrapper<Employee>().like("last_name", "MP"));
        System.out.println(b?"成功":"失败");
    }

}
