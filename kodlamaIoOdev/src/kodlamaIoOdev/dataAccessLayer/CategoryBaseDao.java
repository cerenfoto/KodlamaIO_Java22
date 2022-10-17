package kodlamaIoOdev.dataAccessLayer;

import kodlamaIoOdev.entities.Category;

public interface CategoryBaseDao {
	void add(Category category);

	void delete(Category category);

	void update(Category category);

}
