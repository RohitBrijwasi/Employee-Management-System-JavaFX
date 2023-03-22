/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.sql.Date;

/**
 *
 * @author rohit
 */
public class employeeData {

    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNum;
    private String position;
    private String department;
    private String image;
    private Date date;
    private Double salary;

    public employeeData(Integer employeeId, String firstName, String lastName, String gender, String phoneNum, String position, String department, String image, Date date) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.position = position;
        this.department = department;
        this.image = image;
        this.date = date;
    }
    public employeeData(Integer employeeId, String firstName, String lastName,String position, String department,Double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }
    
    public Integer getEmployeeId() {
        return employeeId;
    }
        public String getFirstName() {
        return firstName;
    }
        public String getLastName() {
        return lastName;
    }
        public String getGender() {
        return gender;
    }
        public String getPhoneNum() {
        return phoneNum;
    }
        public String getPosition() {
        return position;
    }
        public String getDepartment() {
        return department;
    }
        public String getImage() {
        return image;
    }
        public Date getDate() {
        return date;
    }
        public Double getSalary() {
        return salary;
    }
}
