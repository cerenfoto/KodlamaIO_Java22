package kodlamaIoOdev.dataAccessLayer;

import kodlamaIoOdev.entities.Category;

public class JdbcCategoryDao implements CategoryBaseDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile kategori veritabanına eklendi.");

	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBC ile kategori veritabanından silindi.");

	}

	@Override
	public void update(Category category) {
		System.out.println("JDBC ile kategori veritabanında güncellendi.");

	}

}
