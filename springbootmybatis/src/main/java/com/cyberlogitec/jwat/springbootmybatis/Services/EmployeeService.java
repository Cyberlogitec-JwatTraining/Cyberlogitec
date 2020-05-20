package com.cyberlogitec.jwat.springbootmybatis.Services;

import com.cyberlogitec.jwat.springbootmybatis.Entities.EmployeeInfo;
import com.cyberlogitec.jwat.springbootmybatis.Mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public EmployeeInfo getEmployeeFromId(int id){
        return employeeMapper.getEmployeeFromId(id);
    }

    public List<EmployeeInfo> getEmployeeHasSalaryGreaterThan(int salary){
        return employeeMapper.getEmployeeHasSalaryGreaterThan(salary);
    }

    public List<EmployeeInfo> getEmployeeHasLastName(String lastName){
        return employeeMapper.getEmployeeHasLastName(lastName);
    }

    public List<EmployeeInfo> getEmployeeHasName(String firstName,String lastName){
        return employeeMapper.getEmployeeHasName(firstName,lastName);
    }
}
