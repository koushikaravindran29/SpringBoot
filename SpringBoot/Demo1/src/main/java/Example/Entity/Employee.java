package Example.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	//table create
	@Entity
	@Table(name="Emp")//table name specify
public class Employee {
	
			
			@Id//primary key
			@GeneratedValue(strategy = GenerationType.AUTO)//to generate primary key automatically
			private Integer id;
			private String name;
			private Integer age;
			@Column(name="dept")//if column name differs in table
			private String department;
			
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public Integer getAge() {
				return age;
			}
			public void setAge(Integer age) {
				this.age = age;
			}
			public String getDepartment() {
				return department;
			}
			public void setDepartment(String department) {
				this.department = department;
			}
			
		}

