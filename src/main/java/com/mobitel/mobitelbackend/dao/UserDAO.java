package com.mobitel.mobitelbackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mobitel.mobitelbackend.model.Supplier;
import com.mobitel.mobitelbackend.model.User;

public class UserDAO {
	@Autowired
	SessionFactory sessionFactory;

	public UserDAO(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void insertUpdateUser(User user){
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}
	
	public User getUser(int uid){
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class,uid);
		session.close();
		return user;
	}
	
	@Transactional
	public void deleteUser(User user){
		sessionFactory.getCurrentSession().delete(user);
	}
	
	public List<User> getUserDetails(){
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User");
		List<User> list = query.list();
		session.close();
		return list;
	}
}
