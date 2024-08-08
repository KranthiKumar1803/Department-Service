package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Slf4j
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department save(Department department) {
        log.info("DepartmentService save is in Action ::" );
        return departmentRepository.save(department);
    }

    public Department getByDepertmentId(String departmentId) throws Exception {

        log.info("DepartmentService is in Action getByDepartmentId::");
        Optional<Department> depId = null;
        try {
            depId = departmentRepository.findById(departmentId);
            if (depId.isEmpty()) {
                throw new Exception("Record Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return depId.get();
    }

    public String getByDepartmentName(String departmentName) throws Exception {
        log.info("DepartmentService is in Action getBydepartmentName : " );
        try{
            Optional<Department> department = Optional.ofNullable(departmentRepository.findByDepartmentName(departmentName));
            if (department.isEmpty()){
                throw new Exception("Record not found with this Department Name Please recheck ");
            }
        }catch (Exception e){
            throw new RuntimeException("Record not found with this Department Name Please recheck :");
        }
        log.info("DepartmentService is in Action getBydepartmentName Executed Successfully " );
       return departmentName;
    }
}
