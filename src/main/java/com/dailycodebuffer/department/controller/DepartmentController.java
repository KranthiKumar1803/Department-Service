package com.dailycodebuffer.department.controller;


import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Slf4j
@RequestMapping("/departments")
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Department> saveDepartmentBody(@RequestBody Department department){
        log.info("Post Mapping department  |{ }| ::" + department.toString());
        department.setJoinedDate(new Date());
        departmentService.save(department);
        return new ResponseEntity<>(department, HttpStatus.CREATED);

    }

    @GetMapping("/departmentId/{id}")
    public ResponseEntity<Department> findDepartmentByID(@PathVariable (value = "id", required = false) String departmentId){
        Department department = null;
        try {

            if (departmentId != null){
                log.info("Get Mapping save By DepartmentId |{ }| ::" + departmentId);
                department = departmentService.getByDepertmentId(departmentId);
            }

        } catch (Exception e) {
            log.error(e.getMessage());
            log.error(e.getLocalizedMessage());
           return new ResponseEntity<>(department,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @GetMapping("/departmentByName")
    public ResponseEntity<Department> findDepartmentByName(@RequestParam(required = false) String departmentName) throws Exception {
        Department department = null;
        log.info("Get Mapping By DepartmentName departmentName : { } |" + departmentName);
       try {
           if (departmentName != null && !departmentName.isEmpty()){
               log.info("Executing findDepartmentByName { } :" + departmentName);
              departmentService.getByDepartmentName(departmentName);
           }
       }catch (Exception e){
           return new ResponseEntity<>(department, HttpStatus.BAD_REQUEST);
       }

       return new ResponseEntity<>(department,HttpStatus.OK);
    }

}
