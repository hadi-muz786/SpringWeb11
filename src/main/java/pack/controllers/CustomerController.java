   package pack.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import paccck11.CustomerService;
import pack11.CustomerDto;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	private CustomerService customerService;

	@RequestMapping(value = "/{id}/details")
	public CustomerDto getCustomerByName(@PathVariable(value = "id") Integer customerId) {

		return customerService.getCustomerById(customerId);
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

}
