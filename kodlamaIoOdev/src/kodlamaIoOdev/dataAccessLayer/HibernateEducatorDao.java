package kodlamaIoOdev.dataAccessLayer;

import kodlamaIoOdev.entities.Educator;

public class HibernateEducatorDao implements EducatorBaseDao {

	@Override
	public void add(Educator educator) {
		System.out.println("Hibernate ile eğitmen veritabanına eklendi.");

	}

	@Override
	public void delete(Educator educator) {
		System.out.println("Hibernate ile eğitmen veritabanından silindi.");

	}

	@Override
	public void update(Educator educator) {
		System.out.println("Hibernate ile eğitmen veritabanında güncellendi.");

	}

}
