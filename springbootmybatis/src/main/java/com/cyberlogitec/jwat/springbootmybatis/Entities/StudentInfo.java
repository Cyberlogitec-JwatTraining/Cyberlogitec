package com.cyberlogitec.jwat.springbootmybatis.Entities;

public class StudentInfo {
    private String id;
    private String name;
    private String branch;
    private int percentage;
    private String phone;
    private String email;

    public StudentInfo(String id, String name, String branch, int percentage, String phone, String email) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.percentage = percentage;
        this.phone = phone;
        this.email = email;
    }

    public StudentInfo(String name, String branch, int percentage, String phone, String email) {
        this.name = name;
        this.branch = branch;
        this.percentage = percentage;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", percentage=" + percentage +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
