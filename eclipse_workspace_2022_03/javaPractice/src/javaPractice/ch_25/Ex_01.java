package javaPractice.ch_25;

import java.util.ArrayList;
import java.util.List;

/* BordDao ��ü�� getBoardList() �޼ҵ带 ȣ���ϸ� List<Board> Ÿ���� �÷����� ����
 * main() �޼ҵ� ����ÿ� �Ʒ��� ���� ��µ� �� �ֵ��� BoardDao�� getBoardList() �޼ҵ� �ۼ�
 * */
class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
}

class BoardDao {
	List<Board> boardList;
	
	public BoardDao() { // BoarDao��ü ���� -> boardŸ���� list �����ǵ���
		this.boardList= new ArrayList<Board>();
		boardList.add(new Board("����1", "����1"));
		boardList.add(new Board("����2", "����2"));
		boardList.add(new Board("����3", "����3"));
	}

	public List<Board> getBoardList(){
		return boardList;
	}
}

public class Ex_01 {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
