package pacck11;

import java.util.HashMap;
import java.util.Map;

import pack11.CustomerDto;

public class InMemoryDatabase {

	public static Map<Integer, CustomerDto> customerList;

	static {

		customerList = new HashMap<Integer, CustomerDto>();

		CustomerDto cs1 = new CustomerDto();
		cs1.setId(100);
		cs1.setName("Abdul");
		cs1.setAddress("2276 penbury ct.# 204 woodbridge VA");
		cs1.setPhoNum("09090909");
		cs1.setMail("hdhdh@yahoo.com");
		customerList.put(100, cs1);

		CustomerDto cs2 = new CustomerDto();
		cs2.setId(500);
		cs2.setName("Abdul");
		cs2.setAddress("2276 penbury ct.# 204 woodbridge VA");
		cs2.setPhoNum("09090909");
		cs2.setMail("hdhdh@yahoo.com");
		customerList.put(500, cs2);

		CustomerDto cs3 = new CustomerDto();
		cs3.setId(300);
		cs3.setName("Abdul");
		cs3.setAddress("2276 penbury ct.# 204 woodbridge VA");
		cs3.setPhoNum("09090909");
		cs3.setMail("hdhdh@yahoo.com");
		customerList.put(300, cs3);

	}

}
