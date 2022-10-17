package kodlamaIoOdev.dataAccessLayer;

import kodlamaIoOdev.entities.Course;

public interface CourseBaseDao {
	void add(Course course);

	void delete(Course course);

	void update(Course course);

}
