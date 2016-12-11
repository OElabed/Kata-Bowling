/**
 * 
 */
package com.kata.bowling;

/**
 * @author OELABED
 *
 */
public class BowlingApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if (args == null || args.length == 0)
    	{
    		System.out.println("Please specify a roll squence.");
    		
    		System.exit(1);
    	}else if (args.length > 0) {
    		
    		int score = BowlingCalculator.computeScore(args[0]);
    		
    		System.out.println("The score of "+args[0]+"  = "+ score);
    		
    	}

	}

}
