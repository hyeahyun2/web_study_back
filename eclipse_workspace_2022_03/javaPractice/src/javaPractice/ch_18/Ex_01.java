package javaPractice.ch_18;
interface DataAccessObject{
	void insert();
	void select();
	void update();
	void delete();
}
class OracleData implements DataAccessObject {
	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB에를 수정");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB에 삭제");
	}
}
class MySqlDate implements DataAccessObject {
	@Override
	public void insert() {
		System.out.println("Mysql DB에 삽입");
	}
	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색");
	}
	@Override
	public void update() {
		System.out.println("Mysql DB에를 수정");
	}
	@Override
	public void delete() {
		System.out.println("Mysql DB에 삭제");
	}
}

public class Ex_01 {
	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleData());
		dbWork(new MySqlDate());
	}
}
