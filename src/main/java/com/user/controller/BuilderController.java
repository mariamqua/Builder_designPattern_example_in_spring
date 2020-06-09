package com.user.controller;

import com.user.builder.Employee;
import com.user.builder.EmployeeBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/builder")
public class BuilderController {

    @GetMapping("employee1")
    public Employee getEmployee1() {
        return new EmployeeBuilder()
                .setEmployeeId(1)
                .setEmail("john@gmail.com")
                .setFirstName("John")
                .setLastName("smith")
                .setAge(32)
                .buildEmployee();
    }

    @GetMapping("employee2")
    public Employee getEmployee2() {
        return new EmployeeBuilder()
                .setEmployeeId(2)
                .setFirstName("Jeff")
                .setLastName("Freeman")
                .setEmail("jeff@gmail.com")
                .setPhone("0652535352")
                .setAdress("Adress ...")
                .buildEmployee();
    }
}
