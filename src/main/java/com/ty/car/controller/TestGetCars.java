package com.ty.car.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.car.dto.Car;

public class TestGetCars {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT c from Car c WHERE c.brand=?1 AND c.type=?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, "maruti");
		query.setParameter(2, "hatch back");

		List<Car> cars = query.getResultList();
		if (cars.size() > 0) {

			for (Car car : cars) {
				System.out.println("Id is :" + car.getId());
				System.out.println("Name is :" + car.getName());
				System.out.println("Brand is :" + car.getBrand());
				System.out.println("Type is :" + car.getType());
				System.out.println("Cost is :" + car.getCost());
				System.out.println("------------");
			}

		} else {
			System.out.println("Car not found");
		}
		
		
	}
}
