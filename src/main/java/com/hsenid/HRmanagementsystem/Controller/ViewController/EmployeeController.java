package com.hsenid.HRmanagementsystem.Controller.ViewController;

import com.hsenid.HRmanagementsystem.Model.Department;
import com.hsenid.HRmanagementsystem.Model.Employee;
import com.hsenid.HRmanagementsystem.Model.Fraction;
import com.hsenid.HRmanagementsystem.Model.Sbu;
import com.hsenid.HRmanagementsystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes({"sbus", "departments", "fractions"})
public class EmployeeController {
    @Autowired
    private EmployeeServiceView employeeServiceView;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private SbuService sbuService;
    @Autowired
    private FractionService fractionService;


    @GetMapping("employees")
    public String getAllEmployees(ModelMap model) {
        List<Employee> employees = employeeServiceView.getAllEmployees();
        model.addAttribute("employees", employees);
        return  "list_employees";
    }

    @GetMapping("employee/add")
    public String getAddEmployee(@ModelAttribute("employee") Employee employee) {
        return "add-employee";
    }

    @PostMapping("employee/add")
    public String addNewEmployee(@Valid @ModelAttribute("employee") Employee employee,
                                 BindingResult result) {

        if(result.hasErrors()) {
            return "add-employee";
        }
        employeeServiceView.saveEmployee(employee);
        return "redirect:/employees";
    }

    @GetMapping("/employee/delete/{id}")
    public String deleteEmployeeByID(@PathVariable Integer id) {
        employeeServiceView.deleteEmployee(id);
        return "redirect:/employees";
    }

    @GetMapping("employee/view/{id}")
    public String viewUserEmployee(ModelMap model,@PathVariable Integer id) {
        Employee emp = employeeServiceView.getEmployeeByIdCrud(id);
        model.addAttribute("employee", emp);
        return "view-employee";
    }

    @GetMapping("employee/edit/{id}")
    public String getEditEmployee(@PathVariable Integer id, ModelMap model) {
        Employee emp = employeeServiceView.getEmployeeByIdCrud(id);
        model.addAttribute("employee", emp);
        model.addAttribute("edit", true);
        return  "add-employee";
    }

    @PostMapping("employee/edit/{id}")
    public String updateEmployee(@Valid @ModelAttribute("employee") Employee employee,
                                 @PathVariable Integer id,
                                 BindingResult result,
                                 ModelMap model) {
        if(result.hasErrors()) {
            return "add-employee";
        }

        employeeServiceView.updateEmployeeCrud(id, employee);
        return "redirect:/employees";

    }

    @ModelAttribute("departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @ModelAttribute("sbus")
    public List<Sbu> getAllSbus() {
        return sbuService.getAllSbus();
    }

    @ModelAttribute("fractions")
    public List<Fraction> getAllFrctions() {
        return fractionService.getAllFractions();
    }

}
