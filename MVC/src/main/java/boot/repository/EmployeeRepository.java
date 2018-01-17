package boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import boot.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	boolean findEmployeeByName(String username);

}
