package com.example.demo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.demo.model.CustomerDAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.Customer;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		CustomerDAO customerDAO = new CustomerDAO();

		Customer daniel = new Customer();
		daniel.setId(1L);
		daniel.setName("daniel");
		daniel.setAge(41);

		customerDAO.saveCustomer(daniel);

		System.out.println("Client: "+customerDAO.showCustomer(1L).getName());

		customerDAO.deleteCustomer(1L);
	}

}
