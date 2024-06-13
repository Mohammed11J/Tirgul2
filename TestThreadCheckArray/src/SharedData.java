	/**
	 * Description
	 *
	 * @author Mohammed Jaber
	 * @author null
	 * @version v1.0
	 */
public class SharedData 
{
	private int [] array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * Constructs a new SharedData object with the specified integer array and value
	 *
	 * @param array an array of integers
	 * @param b an integer that we want to check if the array contains a sub-array
	 * 		  that it's sum is equal to
	 */
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * Returns the winArray which is an array of boolean values
	 *
	 * @return array of boolean values indicating win states
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Sets the winArray to the specified array of boolean values
	 *
	 * @param winArray an array of boolean values to be stored
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Returns the array of integers stored in this SharedData object
	 *
	 * @return array of integers
	 */
	public int[] getArray() 
	{
		return array;
	}

	/**
	 * Returns the integer value of the variable b
	 *
	 * @return integer value of b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * Returns the boolean value of the variable flag
	 *
	 * @return boolean value of flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Sets the boolean value of the variable flag
	 *
	 * @param flag a boolean value of which we want this.flag to be set to
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
