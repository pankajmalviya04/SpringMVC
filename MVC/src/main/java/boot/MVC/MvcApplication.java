package boot.MVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="boot.*")
public class MvcApplication {
	public static void main(String[] args) {
		SpringApplication.run(MvcApplication.class, args);
	}
}
