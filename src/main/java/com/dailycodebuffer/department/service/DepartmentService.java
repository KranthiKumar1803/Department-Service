package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department save(Department department) {
        log.info("DepartmentService is in Action save()::" );
        return departmentRepository.save(department);
    }

    public Department getByDepertmentId(Long departmentId) {
        log.info("DepartmentService is in Action getByDepartmentId::" );
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public Department getDepartmentByName(String dName){
        log.info("Department service working on getDepartmentByName :: " +dName);
        return departmentRepository.findByDepartmentName(dName);

    }
   /* public Department savingErrors(String s){
        log.info("LOG INFO :: savingErrors :: ");

        return departmentRepository.saveErrors("Saving in the Error Loop ::");

    }*/
}
