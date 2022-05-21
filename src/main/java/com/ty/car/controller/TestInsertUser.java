package com.ty.car.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.car.dto.User;

public class TestInsertUser {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = new User();
		user.setName("bhaskar");
		user.setEmail("bk@mail.com");
		user.setPassword("bk@1414");
		user.setGender("male");

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}
}
