package com.ty.car.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.car.dto.User;

public class TestValidateUser {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT u from User u WHERE u.email=?1 AND u.password=?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, "uday@mail.com");
		query.setParameter(2, "uday@1414");

		List<User> users = query.getResultList();
		if (users.size() > 0) {

			User user = users.get(0);
			System.out.println("Id is :" + user.getId());
			System.out.println("Name is :" + user.getName());
			System.out.println("Email is :" + user.getEmail());
			System.out.println("Gender is :" + user.getGender());

		} else {
			System.out.println("Email or password is wrong");
		}
	}

}
