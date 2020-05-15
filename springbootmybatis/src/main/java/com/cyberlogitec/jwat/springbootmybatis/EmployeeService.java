package com.cyberlogitec.jwat.springbootmybatis;

import com.cyberlogitec.jwat.springbootmybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public EmployeeInfo getEmployeeFromId(int id){
        return employeeMapper.getEmployeeFromId(id);
    }
}
