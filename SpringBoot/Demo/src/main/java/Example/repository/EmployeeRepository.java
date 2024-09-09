package Example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Example.Entity.Employee;

		//Database connectivity inbulit methods
		//bean class name and primary key data type

		@Repository
		public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
		} 