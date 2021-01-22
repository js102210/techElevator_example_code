package com.techelevator;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;
    private String fullName;

    public int getEmployeeId() {
        return this.employeeId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFullName() {
        return this.fullName;
    }
    public String getDepartment() {
        return this.department;
    }

    public double getAnnualSalary() {
        return this.annualSalary;
    }


    public void setLastName(String lastName) {
        lastName = this.lastName;
    }
    public void setDepartment(String department) {
        department = this.department;
    }

    public Employee (int employeeId, String firstName, String lastName, double annualSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
        this.fullName = this.lastName + ", " + this.firstName;
    }

    public void raiseSalary(double percent) {
        this.annualSalary = this.annualSalary + (this.annualSalary * (percent/100));

    }




}
