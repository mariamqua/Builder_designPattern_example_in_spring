package com.user.builder;

public class EmployeeBuilder {
    private int employeeId; // required
    private String firstName; // required
    private String lastName; // required
    private String email; // required
    private String adress; // optional
    private int age; // optional
    private String phone; // optional

    public Employee buildEmployee() {
        return new Employee(employeeId,firstName,lastName, email);
    }

    // Each setter returns EmployeBuilder object.
    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder setAdress(String adress) {
        this.adress = adress;
        return this;
    }
    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public EmployeeBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }


}
