package springbootTest.com.example.boot.service;

import springbootTest.com.example.boot.domain.Customer;

public interface CustomerService {

	
	
	/**
	 * 保存客户信息
	 * @param customer
	 * @return
	 */
	public boolean addCustomer(Customer customerName);
	
	/**
	 * 通过客户名称查客户info
	 * @param customerName
	 * @return
	 */
	Customer getCustomerByName(String customerName);
}
