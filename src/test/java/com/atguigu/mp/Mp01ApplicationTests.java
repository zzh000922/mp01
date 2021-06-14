package com.atguigu.mp;

import com.atguigu.mp.bean.Employee;
import com.atguigu.mp.mapper.EmployeeMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.midi.Soundbank;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.Wrapper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.Condition;

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
    public void testQueryWrapperSelect(){
        Page<Employee> employeePage = employeeMapper.selectPage(new Page<Employee>(1, 2),
                new QueryWrapper<Employee>().between("age", 18, 50).eq("gender", 1).eq("last_name", "MP"));

    }


    //通用的删除操作
    @Test
    public void testCommonDelete(){
        int i = employeeMapper.deleteById(7);
        System.out.println(i);
    }

    //通用查询操作
    @Test
    public void testCommonQuery(){
        //1.通过id查询
//        Employee employee = employeeMapper.selectById(6);
//        System.out.println(employee);
        //2.通过多个列进行查询
//        QueryWrapper<Employee> wrapper = new QueryWrapper<>();
//        wrapper.eq("id",6);
//        wrapper.eq("last_name","玛利亚");
//        Employee employee = employeeMapper.selectOne(wrapper);
//        System.out.println(employee);
        //3.通过多个id查询
//        List<Employee> employees = employeeMapper.selectBatchIds(Arrays.asList(1, 2, 6, 7));
//        employees.forEach(System.out::println);
        //4.通过map封装条件查询
//        HashMap<String, Object> columnMap = new HashMap<>();
//        columnMap.put("last_name","玛利亚");
//        columnMap.put("gender",0);
//        List<Employee> employees = employeeMapper.selectByMap(columnMap);
//        employees.forEach(System.out::println);
        //5.分页查询
        Page<Employee> employeePage = employeeMapper.selectPage(new Page<>(2, 2), null);



    }

    //通用更新操作
    @Test
    public void testCommonUpdate(){
        Employee employee = new Employee();
        employee.setId(6);
        employee.setLastName("玛利亚");
        employee.setEmail("mly@atguigu.com");
        employee.setGender(0);
        //employee.setAge(33);
        int i = employeeMapper.updateById(employee);

        System.out.println("result: "+i);
    }

    //通用插入操作
    @Test
    public void testCommonInsert(){
        Employee employee = new Employee();
        employee.setAge(22);
        employee.setLastName("MP");
        employee.setEmail("mp@atguigu.com");
        employee.setGender(1);
        employee.setSalary(20000.0);
        int insert = employeeMapper.insert(employee);
        Integer id = employee.getId();
        System.out.println("Key: "+id);
        System.out.println("result: "+insert);
    }
}
