package mvc_school_connDB;

/*
CREATE TABLE classlist (
classCode INT PRIMARY key,
className VARCHAR(50) NOT null
);
*/
public class ClassListDTO {
	private int classCode;
	private String className;
	
	// getter setter
	public int getClassCode() {
		return classCode;
	}
	public void setClassCode(int classCode) {
		this.classCode = classCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
