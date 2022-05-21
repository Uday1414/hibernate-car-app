package com.ty.car.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.car.dto.Car;

public class TestSaveCar {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Car car=new Car();
		car.setName("maruti breeza");
		car.setBrand("maruti");
		car.setType("hatch back");
		car.setCost(3000000);
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		
		System.out.println("-------Done--------");
	}
}
