package javaPractice.ch_23;
import java.util.ArrayList;

class CodingSol {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> select = new ArrayList<Integer>();
        for(int i=0; i<moves.length; i++){
            int movesNum = moves[i];
            for(int j=0; j<board.length; j++){
                if(board[j][movesNum-1] != 0){
                    select.add(board[j][movesNum-1]);
                    board[j][movesNum-1] = 0;
                    break;
                }
            }
//            System.out.println(select.size());
            if(i==0) continue;
            if(select.get(select.size()-1) == select.get(select.size()-2)){
        		answer += 2;
                select.remove(select.size()-1);
                select.remove(select.size()-1);
            }
        }
        return answer;
    }
}
public class CodingTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		
		CodingSol a = new CodingSol();
		try {
			System.out.println(a.solution(board, moves));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
