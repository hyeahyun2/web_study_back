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
		System.out.println("Oracle DB�� ����");
	}
	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB���� ����");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB�� ����");
	}
}
class MySqlDate implements DataAccessObject {
	@Override
	public void insert() {
		System.out.println("Mysql DB�� ����");
	}
	@Override
	public void select() {
		System.out.println("Mysql DB���� �˻�");
	}
	@Override
	public void update() {
		System.out.println("Mysql DB���� ����");
	}
	@Override
	public void delete() {
		System.out.println("Mysql DB�� ����");
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
