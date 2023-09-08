package day10.BookT;

public class DeoExample {
	public static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
public static void main(String[] args) {
	dbwork(new OracleDao());
	dbwork(new MySqlDeo());
}
}
