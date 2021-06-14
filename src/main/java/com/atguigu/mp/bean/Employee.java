package com.atguigu.mp.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tbl_employee")
public class Employee {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String lastName;
    private Integer age;
    private Integer gender;
    private String email;
}
