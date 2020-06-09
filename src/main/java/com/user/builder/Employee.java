package com.user.builder;

public class Employee {
    private int employeeId; // required
    private String firstName; // required
    private String lastName; // required
    private String email; // required
    private String adress; // optional
    private int age; // optional
    private String phone; // optional


    public Employee( int employeeId,String firstName,
                     String lastName,String email) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() { return adress; }

    public int getAge() { return age; }

    public String getPhone() { return phone; }
}
