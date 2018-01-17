package boot.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueLoginAnnotationValidation implements ConstraintValidator<UniqueLoginAnnotation, String>{

	
	
//	public UniqueLoginAnnotationValidation(EmployeeRepository employeeRepo) {		
//		this.employeeRepo = employeeRepo;
//	}

	@Override
	public void initialize(UniqueLoginAnnotation constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		System.out.println("=========isValid=========");
		if(username.equals("abc"))
		{
			System.out.println("=========isValid IF=========");
			return false;
			
		}
		else {
			System.out.println("=========isValid ELSE =========");
			return true;
		}
	}
	

}
