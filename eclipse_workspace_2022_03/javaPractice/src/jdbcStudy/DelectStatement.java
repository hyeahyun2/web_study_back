package jdbcStudy;

import java.sql.SQLException;
import java.util.Scanner;

// ������ ����
class DBDelete extends DBSelect {
	public void deleteUser() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ ������ ���̵� �Է��ϼ���: ");
		String userID = scanner.nextLine();
		
		String deleteSQL = "DELETE FROM tUser WHERE userID = '" + userID + "'";
		
		preparedStatement = conn.prepareStatement(deleteSQL); // ���� ���� �غ�
		int cnt = preparedStatement.executeUpdate(); // ������� ������ ���� ��ȯ
		
		if(cnt > 0) {
			System.out.println("���� ���� ������ : " + cnt);
			System.out.println("������ ������ �����߽��ϴ�.");
		}
		else {
			System.out.println("������ ������ �����߽��ϴ�.");
		}
		System.out.println();
		scanner.close();
	}
}
public class DelectStatement {
	public static void main(String[] args) throws SQLException {
		DBDelete myDB = new DBDelete();
		myDB.connectDB();
		myDB.getAllUser();
		myDB.deleteUser();
		myDB.getAllUser();
		myDB.closeDB();
	}
}
