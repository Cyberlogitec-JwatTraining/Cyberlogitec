package com.cyberlogitec.jwat.springbootmybatis.mapper;

import com.cyberlogitec.jwat.springbootmybatis.EmployeeInfo;
import org.springframework.stereotype.Component;


public interface EmployeeMapper {
    EmployeeInfo getEmployeeFromId(int id);
}
