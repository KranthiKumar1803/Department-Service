package com.dailycodebuffer.department.controller;


import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;


@Slf4j
@RequestMapping("/departments")
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartmentBody(@RequestBody Department department){
        if (department != null){
            log.info("Post Mapping department  |{ }| ::" +  department.getDepartmentId(),
                                                            department.getDepartmentName(),
                                                            department.getDepartmentAdress(),
                                                            department.getDepartmentCode()
                            );

            return departmentService.save(department);
        }

        return null;

    }


    @GetMapping("/departmentId/{id}")
    public Department findDepartmentByID(@PathVariable (value = "id") Long departmentId){
        log.info("Get Mapping save By DepartmentId |{ }| ::" + departmentId);
        return departmentService.getByDepertmentId(departmentId);
    }

    /**
     * Learnt about @RequestParam which needs a mandatory required param for the rest controller to get the response from the server
     * It is set default to req = true but we can make it off by making it false. And we can make it to an optional default value too. reqparam ="Bob"
     * @param depName
     * @return
     * @throws Exception
     */

    @GetMapping("/departmentName/{depName}")
    public Department findByDepName(@PathVariable (value = "depName") String depName) {
        //just making a regular null check
       if (depName != null || !depName.isEmpty()){
           log.info("Get Mapping findByDepName |{ }| ::" + depName);
           return departmentService.getDepartmentByName(depName);

       }

        return null;
    }

}
