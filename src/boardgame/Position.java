package boardgame;

public class Position {

	private int row;
	private int column;
	
	public Position() {
	}

	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override  //indica para o compilador que está sobrescrevendo um método
	public String toString() {
		return "row: " + row  + ", column: " + column;
	}
}
