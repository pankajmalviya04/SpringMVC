package boot.repository;

public class EmployeeRepositoryImpl {
	
	public boolean findEmployeeByName(String usernmae)
	{		
		// right now I have hardcoded for functionality, I will connect with database in future.
		if(usernmae.equalsIgnoreCase("pankaj") || usernmae.equalsIgnoreCase("abc")) {
			return true;			
		}
		else {
			return false;
		}
	}

}
