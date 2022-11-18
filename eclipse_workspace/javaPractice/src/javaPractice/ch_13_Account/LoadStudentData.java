package javaPractice.ch_13_Account;

public class LoadStudentData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRecord sr = new StudentRecord();
		sr.insertStudent("Ã¶¼ö", 1, 1, 90, 80, 90);
		sr.insertStudent("¿µ¼ö", 1, 2, 100, 70, 70);
		sr.insertStudent("¿µÈñ", 1, 3, 80, 70, 100);
		
		sr.printTotal();
	}
}
