package kodlamaIoOdev;

import kodlamaIoOdev.business.CategoryManager;
import kodlamaIoOdev.business.CourseManager;
import kodlamaIoOdev.business.EducatorManager;
import kodlamaIoOdev.core.logging.DatabaseLogger;
import kodlamaIoOdev.core.logging.FileLogger;
import kodlamaIoOdev.core.logging.Logger;
import kodlamaIoOdev.core.logging.MailLogger;
import kodlamaIoOdev.dataAccessLayer.HibernateCategoryDao;
import kodlamaIoOdev.dataAccessLayer.HibernateEducatorDao;
import kodlamaIoOdev.dataAccessLayer.JdbcCourseDao;
import kodlamaIoOdev.entities.Category;
import kodlamaIoOdev.entities.Course;
import kodlamaIoOdev.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {

		Category category = new Category(1, "Programlama");
		Logger[] loggersCategory = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggersCategory);
		categoryManager.add(category);

		Course course = new Course(1, "Java Programlama", "Ceren Foto", 100);
		Logger[] loggersCourse = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggersCourse);
		courseManager.add(course);

		Educator educator = new Educator(1, "Ceren", "Foto");
		Logger[] loggersEducator = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(), loggersEducator);
		educatorManager.add(educator);

	}

}
