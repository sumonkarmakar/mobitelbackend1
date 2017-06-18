package com.mobitel.mobitelbackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.mobitelbackend.dao.SupplierDAO;
import com.mobitel.mobitelbackend.model.Supplier;

public class SupplierTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.mobitel.mobitelbackend");

		context.refresh();
		// Insert a Supplier Object
		SupplierDAO supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		
		// Insertion test case
		Supplier supplier = new Supplier();
		
		supplier.setSupname("Loreal");
		supplier.setAddress("France");
		
		supplierDAO.insertUpdateSupplier(supplier);
		System.out.println("Supplier Inserted");
	}

}
