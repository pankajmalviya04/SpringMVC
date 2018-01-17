package boot.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueLoginAnnotationValidation.class)  
public @interface UniqueLoginAnnotation {
	
	String message() default "username is already taken";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
}
