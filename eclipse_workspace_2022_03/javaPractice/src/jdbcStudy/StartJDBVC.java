package jdbcStudy;
/* JDBC�� �̿��ϴ� ���α׷� �ۼ� ����
 * 1. ����ϰ��� �ϴ� RDBMS���� �����ϴ� JDBC ����̹��� ��ġ.
 * 2. JDBC ����̹��� �ε�.
 * ����̹��� �ε��� ������ Ŭ������ ���� ���ε��� �����ϴ� Class Ŭ������ static �޼�����
 * forName() �޼��带 ���.
 * 3. DBMS�� ������ ����;
 * jsva.sql ��Ű���� �����ϴ� Connection ��ü�� ���
 * 4. SQL�� ����.
 * select ������ ������ ������ java.sql ��Ű���� �����ϴ� Statement ��ü�� ResultSet ��ü�� ���.
 * Statement ��ü�� SQL ������ ���� ���̰� ResultSet�� select ������ ������ ����� �ٷ�� ���� ��ü.
 * */
public class StartJDBVC {
	// ����̹� Ŭ������ �ε�
	public static void loadDriver() {
		try {
			// org.mariadb.jdbc.Driver Ŭ������ �޸𸮿� �ε�
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Driver Load Success!");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		loadDriver();
	}

}
