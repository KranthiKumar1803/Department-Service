package com.dailycodebuffer.department.controller;


import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@Slf4j
@RequestMapping("/departments")
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartmentBody(@RequestBody Department department){
        log.info("Post Mapping department  |{ }| ::" + department.toString());
        return departmentService.save(department);
    }

    @GetMapping("/departmentId/{id}")
    public Department findDepartmentByID(@PathVariable (value = "id") Long departmentId){
        log.info("Get Mapping save By DepartmentId |{ }| ::" + departmentId);
        return departmentService.getByDepertmentId(departmentId);
    }

}
