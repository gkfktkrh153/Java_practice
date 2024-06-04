package kosa.oop2;

public class Service {
	private Dao dao;
	
	public Service() {
		
	}

	public Service(OracleDao dao) {
		super();
		this.dao = dao;
	}

	public Service(MysqlDao dao) {
		super();
		this.dao = dao;
	}

	public void insertService() {
		dao.insert();
	}
	
}
