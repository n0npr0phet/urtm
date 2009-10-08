/**
 * 
 */
package com.gregorypruden.urtm;

/**
 * @author gregory
 *
 */
public class UncleRiccosTimeMachine {

	/**
	 * 
	 */
	public UncleRiccosTimeMachine() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		header();
		setHighLow(true);
	}
	/**
	 * header - prints the console output at the top of the program.
	 */
	public static void header()
	{
		System.out.println();
		System.out.println("Uncle Rocco's Time Machine.");
	}
	
	
	private static Boolean highLow = false;
	/**
	 * Set highlow property.
	 * @param value
	 */
	public static void setHighLow(Boolean value)
	{
		highLow = value;
	}
	public static Boolean getHighLow()
	{
		return highLow;
	}
}
