
public class Board {

	private Square[][] squares;
	
	public Board() {
		for (byte i = 0 ; i < 10 ; i++) {
			for (byte j = 0 ; j < 10 ; j++) {
				squares[i][j] = new Square(i,j);
			}
		}
	}
	
	public 

}
