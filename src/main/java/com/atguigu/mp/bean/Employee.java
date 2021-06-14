package com.atguigu.mp.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@TableName(value = "tbl_employee")
public class Employee extends Model<Employee> {
    //@TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    //@TableField(value = "last_name")
    private String lastName;
    private Integer age;
    private Integer gender;
    private String email;

    @TableField(exist = false)
    private Double salary;
}
