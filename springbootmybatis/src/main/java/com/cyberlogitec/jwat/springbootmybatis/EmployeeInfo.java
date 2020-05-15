package com.cyberlogitec.jwat.springbootmybatis;

public class EmployeeInfo {
    int id;
    String fName;
    String lName;

    public EmployeeInfo(int id,String fName,String lName){
        this.id=id;
        this.fName=fName;
        this.lName=lName;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
