package Example.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Example.Entity.Employee;
import Example.repository.EmployeeRepository;

		//actual logic 
		@Service

public class EmployeeService {
			//Dependency injection
			@Autowired
			private EmployeeRepository employeeRepository;
			
			public Employee createEmployee(Employee employee) {
				
				//insert into table
				employeeRepository.save(employee);
				
				return employee;
			}
			public Employee findEmployeeById(Integer id) {
				 
				return employeeRepository.findById(id).orElse(null);
			}
		}

