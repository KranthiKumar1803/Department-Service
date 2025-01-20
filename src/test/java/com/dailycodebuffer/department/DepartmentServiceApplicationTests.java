/*
package com.dailycodebuffer.department;

import com.dailycodebuffer.department.controller.DepartmentController;
import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.BDDMockito.given;

import java.util.Date;

//@SpringBootTest
@RunWith(SpringRunner.class)
class DepartmentServiceApplicationTests {

	@Mock
	Department departmentMock;

	@Mock
	private DepartmentController departmentControllerMock;

	@Mock
	private DepartmentService departmentServiceMock;


//	@Test
//	void contextLoads() {
//	}

	@Test
	public void testDepartmentController(){
		//Arrange
		String successMessage = "Controller Test Passed ";
		departmentMock = new Department("101", "Law", "CRM", "Mock Address", new Date());
//		departmentMock.setDepartmentId("101");
//		departmentMock.setDepartmentName("Law");
//		departmentMock.setDepartmentCode("CRM");
//		departmentMock.setJoinedDate(new Date());
//		departmentMock.setDepartmentAdress("Mock Address");

		//Act
		//DepartmentController mockController = departmentControllerMock.saveDepartmentBody(departmentMock,ResponseEntity.accepted());
		//System.out.println("Collecting Department Details departmentMock : { }" + departmentMock);
		//Mockito.when(departmentServiceMock.save(departmentMock)).then(ResponseEntity.ok()));
		given(departmentServiceMock.save(departmentMock)).willAnswer(x ->
			ResponseEntity.status(HttpStatus.CREATED));
		Assertions.assertEquals(departmentMock,successMessage);
	}
}
*/
