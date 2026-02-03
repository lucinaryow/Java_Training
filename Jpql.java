package M6_Activity5;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Jpql {

	static void findStudentNames(EntityManager em) {

		em.getTransaction().begin();

		String jpql = "Select s.name FROM Student s";
		TypedQuery<String> query = em.createQuery(jpql, String.class);
		List<String> studentEmails = query.getResultList();

		// print student name
		System.out.println("1st Query:");
		studentEmails.forEach(name -> System.out.println(name));

		em.getTransaction().commit();
	}

	static void countCoursesByStudentId(EntityManager em, Long id) {

		em.getTransaction().begin();

		String jpql = "SELECT COUNT(s) FROM Course c JOIN Student s ON s.id = :id";
		TypedQuery<Long> query = em.createQuery(jpql, Long.class);
		query.setParameter("id", id);

		Long courseCount = query.getSingleResult();
		System.out.println("Course Count by ID: " + courseCount);

		em.getTransaction().commit();

	}

	static void findStudentsByAgeGreaterThan(EntityManager em, int age) {
		em.getTransaction().begin();

		String jpql = "Select COUNT(s) FROM Student s WHERE age > ?1";
		TypedQuery<Long> query = em.createQuery(jpql, Long.class);
		query.setParameter(1, age);

		Long courseCount = query.getSingleResult();
		System.out.println("No of Students: " + courseCount);

		em.getTransaction().commit();
	}

}