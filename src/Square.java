
public class Square {
	private char Row;
	private byte Col;
	
	public Square(byte r, byte c) {
		if (c > 10) {
			throw new UnsupportedOperationException();
		}
		this.Col = c;
		switch (r) {
		case 0: Row = 'A';
			break;
		case 1: Row = 'B';
			break;
		case 2: Row = 'C';
		break;	
		case 3: Row = 'D';
		break;	
		case 4: Row = 'E';
		break;
		case 5: Row = 'F';
		break;
		case 6: Row = 'G';
		break;	
		case 7: Row = 'H';
		break;	
		case 8: Row = 'I';
		break;	
		case 9: Row = 'J';
		break;	
		default: throw new UnsupportedOperationException();
		}
	}
	
	public char getRow() {
		return Row;
	}
	
	public byte getCol() {
		return Col;
	}
	
	public String toString() {
		String s = "";
		s += Row;
		s += Col;
		return s;
	}
}
