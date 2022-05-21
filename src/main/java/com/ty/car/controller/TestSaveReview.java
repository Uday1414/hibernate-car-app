package com.ty.car.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.car.dto.Review;

public class TestSaveReview {
	 public static void main(String[] args) {
		
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 
		 Review review=new Review();
		 review.setSubject("WOrth of money");
		 review.setContent("very good product.very comfortable.");
		 review.setWriterName("Uday");
		 
		 entityTransaction.begin();
		 entityManager.persist(review);
		 entityTransaction.commit();
	}
}
