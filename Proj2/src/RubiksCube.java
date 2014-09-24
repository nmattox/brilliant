
public class RubiksCube {

	private char[][] front;
	private char[][] back;
	private char[][] left;
	private char[][] right;
	private char[][] top;
	private char[][] bottom;
	
	public RubiksCube()
	{
		front = new char[3][3];
		back = new char[3][3];
		left = new char[3][3];
		right = new char[3][3];
		top = new char[3][3];
		bottom = new char[3][3];
		for(int i = 0; i < 3; i++)
		{
			for(int c = 0; c < 3; c++)
			{
				front[i][c] = 'r';
				front[i][c] = 'b';
				front[i][c] = 'g';
				front[i][c] = 'y';
				front[i][c] = 'o';
				front[i][c] = 'w';
			}
		}
	}

	
	
}
