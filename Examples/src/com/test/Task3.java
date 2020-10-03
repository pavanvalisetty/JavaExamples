package com.test;

public class Task3 {

	private static int DominoLength = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] values = new int[] { 3, 4, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6 };
		    String result = IsDominoPyramidValid(values);
		    System.out.println(result);
		}

		public static String IsDominoPyramidValid(int[] values)
		{
		    int arrayLength = values.length;
		    String value=null;
		    int offset = 0;
		    int currentRow = 1; // Note: I'm using a 1-based value here as it helps the maths
		    boolean result = true;
		    while (result)
		    {
		        int currentRowLength = currentRow * DominoLength;

		        // Avoid checking final row: there is no row below it
		        if (offset + currentRowLength >= arrayLength)
		        {
		            break;
		        }

		        result = CheckValuesOnRowAgainstRowBelow(values, offset, currentRowLength);
		        offset += currentRowLength;
		        currentRow++;
		    }
		    if(result) {
		    	value= "YES";
		    	
		    }else {
		    	value= "NO";
		    }

		    return value;
		}

		private static boolean CheckValuesOnRowAgainstRowBelow(int[] values, int startOfCurrentRow, int currentRowLength)
		{
		    int startOfNextRow = startOfCurrentRow + currentRowLength;
		    int comparablePointOnNextRow = startOfNextRow + 1;
		    for (int i = 0; i < currentRowLength; i++)
		    {
		        if (values[startOfCurrentRow + i] != values[comparablePointOnNextRow + i])
		        {
		            return false;
		        }
		    }

		    return true;
		}

}
