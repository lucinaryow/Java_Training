package M6_Activity5;

import jakarta.persistence.EntityManager;

public class App {

	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		try {
			Jpql.findStudentNames(em);
			Jpql.countCoursesByStudentId(em, 1L);
			Jpql.findStudentsByAgeGreaterThan(em, 25);
		} finally {
			EntityManagerUtil.getInstance().closeEntityManager(em);
			EntityManagerUtil.getInstance().shutdownFactory();
		}

	}

}