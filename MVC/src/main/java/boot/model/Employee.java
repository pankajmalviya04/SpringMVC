package boot.model;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import boot.custom.UniqueLoginAnnotation;

public class Employee {
	
	private long id;	
	
	//Defined a custom annotation for unique username.
	@UniqueLoginAnnotation	
	private String username;
	
	
	@NotEmpty
	private String password;
	
	@Email
	private String email;
	
	@Min(18)
	private String age;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Employee() {
	}
	
}
