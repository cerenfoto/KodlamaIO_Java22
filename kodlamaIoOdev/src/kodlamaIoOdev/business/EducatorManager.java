package kodlamaIoOdev.business;

import kodlamaIoOdev.core.logging.Logger;
import kodlamaIoOdev.dataAccessLayer.EducatorBaseDao;
import kodlamaIoOdev.entities.Educator;

public class EducatorManager {

	private EducatorBaseDao educatordao;
	private Logger[] loggers;

	public EducatorManager(EducatorBaseDao educatordao, Logger[] loggers) {
		super();
		this.educatordao = educatordao;
		this.loggers = loggers;
	}

	public void add(Educator educator) throws Exception {

		if (educator.getName().isEmpty() && educator.getLastName().isEmpty()) {
			throw new Exception("Eğitmen adı soyadı boş geçilemez");
		}

		educatordao.add(educator);

		for (Logger logger : loggers) {
			logger.log(educator.getName() + " " + educator.getLastName());
		}

	}

}
