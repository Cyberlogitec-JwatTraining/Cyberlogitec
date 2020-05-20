package com.cyberlogitec.jwat.springbootmybatis.Mappers;

import com.cyberlogitec.jwat.springbootmybatis.Entities.EmployeeInfo;

import java.util.List;


public interface EmployeeMapper {
    public EmployeeInfo getEmployeeFromId(int id);
    public List<EmployeeInfo> getEmployeeHasSalaryGreaterThan(int minSalary);
    public List<EmployeeInfo> getEmployeeHasName(String firstName ,String lastName);
    public List<EmployeeInfo> getEmployeeHasLastName(String lastName);
}
