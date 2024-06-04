package kosa.oop2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OracleDao dao = new OracleDao();
		MysqlDao dao = new MysqlDao();
		Service service = new Service(dao);
		
		service.insertService();
	}

}
