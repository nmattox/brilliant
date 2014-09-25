import javax.swing.*;

import java.awt.BasicStroke; 
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.geom.Line2D; 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;


public class App {

	private static int counter;
	
	private JFrame frame;
	private JPanel panel;
	private GriddedPanel gp;
	private ArrayList<Integer> longestPaths;
	
	public static void main(String[] args)
	{
		App a = new App();
		
		//a.stringPermute("goat");
		//System.out.println(counter);
		//System.out.println(a.problem());
		//a.droidUnlockProblem();
	
		//a.maxNumOfPlanes();
		
		/*
		try {
			a.shiftySort();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//System.out.println("answer = "+a.primaryPalindrom());
		try {
			a.lastThreeDigsOfTickets();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public App()
	{
		longestPaths = new ArrayList<Integer>();
		//System.out.println(problem());
	}
	
	public void initializeCounter()
	{
		counter = 0;
	}
	
	public boolean grassTravel(int[][] problem)
	{
		
		return false;
		
	}
	
	/*
	 * BEFIN PERMUTE PROBLEM
	 */
	
	public void stringPermute(String s)
	{
		char[] stringArr = s.toCharArray();
		String sb = new String("");
		int[] usedChars = new int[stringArr.length];
		for(int i = 0; i < usedChars.length; i++)
		{
			usedChars[i] = 0;
		}
		permuteRecurse(stringArr, sb, usedChars);
	}
	
	public void permuteRecurse(char[] strChars, String currString, int[] usedChars)
	{
		
		if(currString.length() == strChars.length)
		{
			counter++;
			System.out.println(currString);
			return;
		}
		else
		{
			for(int i = 0; i < strChars.length; i++)
			{
				if(usedChars[i] == 0)
				{
					usedChars[i] =1;
					permuteRecurse(strChars, currString+strChars[i], usedChars);
					usedChars[i] = 0;
				}
			}
		}
	}
	
	/*
	 * END PERMUTE PROBLEM
	 */
	
	/*
	 * BEGIN CURIOUS GEORGE PROBLEM 
	 */
	
	public int problem()
	{
		
		int[][] master = new int[299][299];
		int x = 0;
		int y = 0;
		while(x<299)
		{
			while(y<1000)
			{	
				if( (getSumOfDigs(x)+getSumOfDigs(y))>19 )
				{
					break;
				}
				else
				{
					master[x][y] = getSumOfDigs(x)+getSumOfDigs(y);
					//System.out.println("("+x+", "+y+") = "+master[x][y]);

					y++;
				}
			}
			y = 0;
			x++;
		}	
		int finalCount = 0;
		for(int i = 0; i < master.length; i++)
		{
			StringBuilder sb = new StringBuilder();
			sb.append("x = "+i+" |  ");
			for(int c = 0; c < master[i].length; c++)
			{
				sb.append(master[i][c]);
				sb.append(" - ");
				//System.out.println("("+i+", "+c+") = "+master[i][c]);
				if(master[i][c] != 0)
				{
					finalCount++;
				}
			}
			System.out.println(sb);
		}
		

		return (finalCount*4)+1;
	}
	
	/*
	 * END CURIOUS GEORGE PROBLEM
	 */
	
	/*
	 * BEGIN DROID PROBLEM
	 */
	
	public void droidUnlockProblem()
	{
		int[][] probArray = new int[9][2];
		StringBuilder b1 = new StringBuilder();
		StringBuilder b2 = new StringBuilder();
		StringBuilder b3 = new StringBuilder();

		probArray[0][0]= 0;
		probArray[0][1] = 0;
		probArray[1][0]= 1;
		probArray[1][1] = 0;
		probArray[2][0]= 2;
		probArray[2][1] = 0;
		
		probArray[3][0]= 0;
		probArray[3][1] = 1;
		probArray[4][0]= 1;
		probArray[4][1] = 1;
		probArray[5][0]= 2;
		probArray[5][1] = 1;
		
		probArray[6][0]= 0;
		probArray[6][1] = 2;
		probArray[7][0]= 1;
		probArray[7][1] = 2;
		probArray[8][0]= 2;
		probArray[8][1] = 2;

		for(int i = 0; i < 3; i++)
		{
			b1.append("(");
			b1.append(probArray[i][0]);
			b1.append(", ");
			b1.append(probArray[i][1]);
			b1.append(") ");
		}
		System.out.println(b1);
		for(int i = 3; i < 6; i++)
		{
			b2.append("(");
			b2.append(probArray[i][0]);
			b2.append(", ");
			b2.append(probArray[i][1]);
			b2.append(") ");
		}
		System.out.println(b2);
		for(int i = 6; i < 9; i++)
		{
			b3.append("(");
			b3.append(probArray[i][0]);
			b3.append(", ");
			b3.append(probArray[i][1]);
			b3.append(") ");
		}
		System.out.println(b3);
		
		/*
		 * For each square
		 * 		go through each VALID next move 
		 * 			recursiveFunc(square, dist sum)
		 * 
		 * recursiveFunc()
		 * 		if no valid next move, 
		 */
	}
	
	public void findPath(int[][] prob, double distSum, int sqNum, int[] visitedSqs) throws IOException
	{
		
	}
	
	/*
	 * END DROID PROBLEM
	 */
	
	/*
	 * Begin max num of plane prob
	 */
	
	public int maxNumOfPlanes()
	{
		StringBuilder sb1 = new StringBuilder();
		
		Integer[] timeInMins = new Integer[24];
		timeInMins[0] = (23*60)+40;
		timeInMins[1] = (22*60)+15;
		timeInMins[2] = (11*60)+9;
		timeInMins[3] = (6*60)+6;
		timeInMins[4] = (0*60)+9;
		timeInMins[5] = (22*60)+22;
		timeInMins[6] = (17*60)+8;
		timeInMins[7] = (14*60)+9;
		timeInMins[8] = (7*60)+59;
		timeInMins[9] = (8*60)+8;
		timeInMins[10] = (5*60)+0;
		timeInMins[11] = (19*60)+54;
		timeInMins[12] = (13*60)+40;
		timeInMins[13] = (12*60)+15;
		timeInMins[14] = (12*60)+9;
		timeInMins[15] = (9*60)+6;
		timeInMins[16] = (1*60)+9;
		timeInMins[17] = (12*60)+22;
		timeInMins[18] = (7*60)+8;
		timeInMins[19] = (14*60)+9;
		timeInMins[20] = (17*60)+59;
		timeInMins[21] = (18*60)+8;
		timeInMins[22] = (15*60)+0;
		timeInMins[23] = (9*60)+54;
		for(int i = 0; i < timeInMins.length; i++)
		{
			StringBuilder strB = new StringBuilder();
			for(int c = 0; c < timeInMins[i]; c++)
			{
				strB.append(" ");
			}
			strB.append("--------------------");
			System.out.println(strB);
		}
		return 0;
	}
	
	/*
	 * End max num of plane prob
	 */
	
	/*
	 * Begin Shifty Sort Prob
	 */
	
	public void shiftySort() throws IOException
	{
		FileReader fr = new FileReader("input.txt");
		BufferedReader txtReader = new BufferedReader(fr);
		String line; 
		while((line = txtReader.readLine())!=null)
		{
			System.out.println(line);
		}
	}
	
	/*
	 * END shifty sort prob
	 */
	
	/*
	 * Begin Primary Palindrome Problem - SOLVED
	 */
	
	public int primaryPalindrom()
	{
		int n = 1;
		int a = 1; 
		int countToThirteen = 0;
		while(true)
		{
			if(countToThirteen == 13)
			{
				break;
			}
			if(getNumOfDigs(a) != n)
			{
				// clear the number that's SUPPOSED TO BE 13, increment n and perform checks 
				countToThirteen = 0;
				n++;
			}
			if(isPalindrome(a) && isPrime(a) && (isPrime(a+getSumOfDigs(a))))
			{
				countToThirteen++;
			}
			a++;
		}
		return n;
	}
	
	/*
	 * End primary palindrome problem 
	 */
	
	/*
	 * Begin Rubik's Cube Prob
	 */
	
	public void rubikCubeProb()
	{
		
	}
	
	/*
	 * END Rubik's cube prob
	 */
	
	/*
	 * Begin distinct shapes with unit square prob
	 */
	
	public void numOfDistinctSquaresWrap()
	{
		/*
		 * input: current square, sides blocked, squares remaining
		 * recurse on placing a remaining square on each remaining side, decrement number of squares for recurse 
		 * if number of remaining squares is 0, return <- increment counter each time we finish 
		 */
		
	}
	
	/*
	 * End distinct shapes with unit square prob 
	 */
	
	/*
	 * Begin Round robin popularity problem
	 */
	
	public void lastThreeDigsOfTickets() throws IOException
	{
		FileReader fr = new FileReader("popularity_scores.txt");
		BufferedReader txtReader = new BufferedReader(fr);
		String line; 
		HashMap playerScore = new HashMap();
		int playerNum = 0;
		while((line = txtReader.readLine())!=null)
		{
			playerScore.put(playerNum, line);//TODO: need to convert line to interger 
			playerNum++;
		}
	}
	
	/*
	 * END Last 3 digits of round robin popularity 
	 */
	
	/*
	 * BELOW: helper funcitons 
	 */
	
	public int getSumOfDigs(int num)
	{
		int sum = 0;
		String temp = Integer.toString(num);
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    newGuess[i] = temp.charAt(i) - '0';
		}
		for(int i = 0; i < newGuess.length; i++)
		{
			sum += newGuess[i];
		}
		return sum;
		/*for three digits 
		int first = num/100;
		int second = (num-(first*100))/10;
		int third = num - ((100*first)+(10*second));
		return(first+second+third);
		*/
	}
	
	public double getDist(int startX, int startY, int endX, int endY)
	{
		double distX = Math.abs(startX-endX);
		double distY = Math.abs(startY-endY);
		return(Math.sqrt((distX*distX)+(distY*distY)));
	}
	
	public ArrayList<Integer> sortArray(ArrayList<Integer> arr)
	{
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		Integer minInd = -1;
		while(true)
		{
			if(arr.size() == 0)
			{
				break;
			}
			else
			{
				for(int i = 0; i < arr.size(); i++)
				{
	
					if(arr.get(i)<arr.get(minInd))
					{
						minInd = i;
					}
					
				}
			}
			
			sorted.add(arr.get(minInd));
			arr.remove(minInd);
		}
		return sorted;
	}
	
	public boolean isPrime(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean isPalindrome(int n)
	{
		String temp = Integer.toString(n);
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    newGuess[i] = temp.charAt(i) - '0';
		}
		for(int i = 0; i < newGuess.length/2; i++)
		{
			if(newGuess[i] != newGuess[newGuess.length-1-i])
			{
				return false;
			}
		}
		return true;
	}
	
	public int getNumOfDigs(int n)
	{
		String temp = Integer.toString(n);
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    newGuess[i] = temp.charAt(i) - '0';
		}
		return newGuess.length;
	}
	
}



