package kodlamaIoOdev.dataAccessLayer;

import kodlamaIoOdev.entities.Educator;

public class JdbcEducatorDao implements EducatorBaseDao {

	@Override
	public void add(Educator educator) {
		System.out.println("JDBC ile eğitmen veritabanına eklendi.");

	}

	@Override
	public void delete(Educator educator) {
		System.out.println("JDBC ile eğitmen veritabanından silindi.");

	}

	@Override
	public void update(Educator educator) {
		System.out.println("JDBC ile eğitmen veritabanında güncellendi.");

	}

}
