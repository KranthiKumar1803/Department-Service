package com.dailycodebuffer.department;

import com.dailycodebuffer.department.controller.DepartmentController;
import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import com.dailycodebuffer.department.service.DepartmentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.net.http.HttpRequest;
import java.util.Date;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;

//@SpringBootTest
//@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class DepartmentServiceTest {

	@InjectMocks
	private DepartmentService departmentServiceMock;

	@Mock
	private DepartmentRepository departmentRepository;

	@BeforeEach
	public void setUp() {
		//MockitoAnnotations.openMocks(this);

		// Mock repository behavior
		Department mockDepartment = new Department("101", "Law", "CRM", "Mock Address", new Date());
		Mockito.when(departmentRepository.save(any(Department.class))).thenReturn(mockDepartment);

	}

	@Test
	public void testSaveDepartmentService() {
		//Arrange
		Department mockDepartment = new Department("101", "Law", "CRM", "Mock Address", new Date());
		//Mockito.when(departmentServiceMock.save(any())).thenReturn(mockDepartment);
		departmentServiceMock.save(mockDepartment);
		Mockito.verify(departmentRepository, Mockito.times(1)).save(any());

		// Assert
//		Assertions.assertNotNull(result);
//		Assertions.assertEquals(mockDepartment.getDepartmentId(), result.getDepartmentId());
//		Assertions.assertEquals(mockDepartment.getDepartmentName(), result.getDepartmentName());
//		//Assertions.assertEquals(mockDepartment.getDepartmentAddress(), result.getDepartmentAddress());

	}

	@Test
	public void testGetDepartmentById() throws Exception {
		Department mockDepartment = new Department("1", "Law", "CRM", "Mock Address", new Date());

		Mockito.when(departmentRepository.findById(any())).thenReturn(Optional.of(mockDepartment));
		departmentServiceMock.getByDepertmentId("1");
		Mockito.verify(departmentRepository,Mockito.times(1)).findById("1");
	}

	@Test
	public void testGetDepartmentByIdException() throws Exception {
		Department mockDepartment = new Department("1", "Law", "CRM", "Mock Address", new Date());
        try {
            departmentServiceMock.getByDepertmentId(" ");
        } catch (Exception e) {
            //throw new RuntimeException(e);
			Assertions.assertEquals("Record Not Found",e.getMessage());
        }

	}
}
