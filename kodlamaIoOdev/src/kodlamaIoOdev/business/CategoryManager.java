package kodlamaIoOdev.business;

import kodlamaIoOdev.core.logging.Logger;
import kodlamaIoOdev.dataAccessLayer.CategoryBaseDao;
import kodlamaIoOdev.dataAccessLayer.HibernateCategoryDao;
import kodlamaIoOdev.entities.Category;

public class CategoryManager {

	private CategoryBaseDao categoryBaseDao;
	private Logger[] loggers;

	public CategoryManager(CategoryBaseDao categoryBaseDao, Logger[] loggers) {
		super();
		this.categoryBaseDao = categoryBaseDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {

		if (category.getCategoryName().isEmpty()) {
			throw new Exception("Kategori ismi boş geçilemez.");
		}

		categoryBaseDao = new HibernateCategoryDao();

		categoryBaseDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());

		}
	}

}
