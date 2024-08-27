package com.lidis.springboot.thymeleafdemo.controller;

import com.lidis.springboot.thymeleafdemo.entity.Employee;
import com.lidis.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/list")
    public String listEmployees(Model theModel){

        // get the employees from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "/employees/list-employees";

    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        Employee theEmployee = new Employee();

        theModel.addAttribute("employee", theEmployee);

        return "employees/employee-form";

    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee")Employee theEmployee){

        // save the employee
        employeeService.save(theEmployee);

        // use a redirct to prevent duplicate submissions
        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId")int theId, Model theModel){

        // get the employee from the service
        Employee theEmployee = employeeService.findById(theId);

        // set employee as a model attribute to pre-populate the form
        theModel.addAttribute("employee", theEmployee);

        // send over to our form
        return "employees/employee-form";
        
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId")int theId){

        employeeService.deleteById(theId);


        return "redirect:/employees/list";

    }
}
