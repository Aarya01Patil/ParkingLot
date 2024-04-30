package com.aarya.parkinglot.models;

public class Operator extends BaseModel{
    private String Name;
    private int EmployeeId;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }
}
