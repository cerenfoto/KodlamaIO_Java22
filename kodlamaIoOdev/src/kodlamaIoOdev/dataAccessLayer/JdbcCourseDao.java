package kodlamaIoOdev.dataAccessLayer;

import kodlamaIoOdev.entities.Course;

public class JdbcCourseDao implements CourseBaseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile kurs veritabanına eklendi.");

	}

	@Override
	public void delete(Course course) {
		System.out.println("JDBC ile kurs veritabanından silindi.");

	}

	@Override
	public void update(Course course) {
		System.out.println("JDBC ile kurs veritabanında güncellendi.");

	}

}
