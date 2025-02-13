package Example.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Example.Entity.Employee;
import Example.Service.EmployeeService;

//request accept forward
		@RestController

public class EmployeeController {
			@Autowired
			private EmployeeService empolyeeService;
					
			@PostMapping("/employee")
			public Employee createEmployee(@RequestBody Employee employee) {
				
				return empolyeeService.createEmployee(employee);
			}

			@GetMapping("/employee")
			public Employee findEmployee(@RequestParam Integer id) {
				
				return empolyeeService.findEmployeeById(id);
			}	
}
