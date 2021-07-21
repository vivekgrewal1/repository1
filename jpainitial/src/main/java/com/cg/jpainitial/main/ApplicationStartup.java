package com.cg.jpainitial.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpainitial.domain.UserDetail;

public class ApplicationStartup {
	public static void main(String[] args) {
	
	UserDetail userDetail = new UserDetail();
	userDetail.setId(101);
	userDetail.setName("Vivek");
	userDetail.setContact("9999999999");
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	entityManager.persist(userDetail);
	entityManager.getTransaction().commit();
	entityManager.close();
	entityManagerFactory.close();
	}
}
