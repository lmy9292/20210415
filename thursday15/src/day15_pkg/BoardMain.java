package day15_pkg;

public class BoardMain {

	public static void main(String[] args) {
		
		Board b=new Board();
		
		b.boardWrite(1111,"포켓몬스터","지우","지구를 구해라");
		b.boardView();
		b.boardUpdate("디지몬","다시 구해라");
		b.boardView();
		
		
		
	}

}
