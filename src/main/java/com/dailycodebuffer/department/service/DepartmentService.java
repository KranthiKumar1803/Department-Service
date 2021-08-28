package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Slf4j
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department save(Department department) {
        log.info("DepartmentService is in Action ::" );
        return departmentRepository.save(department);
    }

    public Department getByDepertmentId(Long departmentId) {
        log.info("DepartmentService is in Action getByDepartmentId::" );
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
