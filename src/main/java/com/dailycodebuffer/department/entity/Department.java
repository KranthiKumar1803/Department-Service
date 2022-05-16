package com.dailycodebuffer.department.entity;

import com.fasterxml.jackson.core.JsonFactory;
import org.hibernate.annotations.GeneratorType;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Department extends JsonFactory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentAdress;
    private String departmentCode;


    public Department() {
    }

    public Department(Long departmentId, String departmentName, String departmentAdress, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAdress = departmentAdress;
        this.departmentCode = departmentCode;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAdress() {
        return departmentAdress;
    }

    public void setDepartmentAdress(String departmentAdress) {
        this.departmentAdress = departmentAdress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAdress='" + departmentAdress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
