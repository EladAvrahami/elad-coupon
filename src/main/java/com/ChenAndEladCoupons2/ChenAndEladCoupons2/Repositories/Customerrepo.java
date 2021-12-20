package com.ChenAndEladCoupons2.ChenAndEladCoupons2.Repositories;

import com.ChenAndEladCoupons2.ChenAndEladCoupons2.Beans.Company;
import com.ChenAndEladCoupons2.ChenAndEladCoupons2.Beans.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * an interface that connects by smart dialect to the Customer Table in the DB
 */
public interface Customerrepo extends JpaRepository<Customer,Integer> {

    Customer findByEmailAndPassword(String email, String password);
    boolean deleteById(int id);
    Customer findCustomerById(int id);
    Customer findByFirstName(String name);
    Customer findByEmail ( String email);
    Customer getOneById(int customerID);
}
