package javaPractice.ch_17;
abstract class HttpServlet {
	public abstract void service();
}
class LoginServlet extends HttpServlet {
	public void service() {
		System.out.println("로그인 합니다.");
	}
}
class FileDownloadServlet extends HttpServlet {
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("파일 다운로드 합니다.");
	}
}
public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
