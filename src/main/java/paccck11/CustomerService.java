package paccck11;

import pacck11.InMemoryDatabase;
import pack11.CustomerDto;

public class CustomerService {

	public CustomerDto getCustomerById(Integer id) {
		return InMemoryDatabase.customerList.get(id);

	}

}
