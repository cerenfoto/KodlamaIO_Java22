package kodlamaIoOdev.dataAccessLayer;

import kodlamaIoOdev.entities.Course;

public class HibernateCourseDao implements CourseBaseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile kurs veritabanına eklendi.");

	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile kurs veritabanından silindi.");

	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile kurs veritabanında güncellendi.");

	}

}
