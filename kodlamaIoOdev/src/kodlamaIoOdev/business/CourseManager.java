package kodlamaIoOdev.business;

import kodlamaIoOdev.core.logging.Logger;
import kodlamaIoOdev.dataAccessLayer.CourseBaseDao;
import kodlamaIoOdev.entities.Course;

public class CourseManager {

	private CourseBaseDao courseBaseDao;
	private Logger[] loggers;

	public CourseManager(CourseBaseDao courseBaseDao, Logger[] loggers) {
		super();
		this.courseBaseDao = courseBaseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		if (course.getCourseFee() < 0) {
			throw new Exception("Kursun ücreti 0'dan büyük olmalıdır.");
		}

		courseBaseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}

	}

}
