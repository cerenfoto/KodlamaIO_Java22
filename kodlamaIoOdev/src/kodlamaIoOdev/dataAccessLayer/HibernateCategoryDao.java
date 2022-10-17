package kodlamaIoOdev.dataAccessLayer;

import kodlamaIoOdev.entities.Category;

public class HibernateCategoryDao implements CategoryBaseDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile kategori veritabanına eklendi.");

	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile kategori veritabanından silindi.");

	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile kategori veritabanında güncellendi.");

	}

}
