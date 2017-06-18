package com.mobitel.mobitelbackend;
import java.util.List;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.mobitelbackend.dao.CategoryDAO;
import com.mobitel.mobitelbackend.dao.ProductDAO;
import com.mobitel.mobitelbackend.model.Category;
import com.mobitel.mobitelbackend.model.Product;
public class ProductTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.mobitelbackend");
		
		context.refresh();
		
		// Inserting a Category Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Insertion TestCase
		
		Product product=new Product();
		
		product.setProdname("Shampoo");
		product.setProdDesc("Loreal.");

		productDAO.insertUpdateProduct(product);		
		System.out.println("Product Inserted"); 
		
		//Retrieval TestCase
		
		/*Category category=categoryDAO.getCategory(1);
		System.out.println("Category Name:"+category.getCatname());
		System.out.println("Category Description:"+category.getCatdesc());*/
		
		//Deletion TestCase
		/*Category category=categoryDAO.getCategory(2);
		categoryDAO.deleteCategory(category);
		System.out.println("The Category Deleted");*/
		
		//Retrieving the Data
		
		/*List<Category> list=categoryDAO.getCategoryDetails();
		
		for(Category category:list)
		{
			System.out.println(category.getCatid()+":"+category.getCatname()+":"+category.getCatdesc());
		}*/
		
		//Update the Category
		//Category category=categoryDAO.getCategory(3);
	//	category.setCatname("WifiEnMobile");
		//categoryDAO.insertUpdateCategory(category);
		//System.out.println("The Category Updated");
		
	}


	
	
	
	
	
	}


