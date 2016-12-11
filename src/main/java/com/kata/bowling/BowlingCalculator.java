package com.kata.bowling;

public class BowlingCalculator {

	public static int computeScore(String sequence) {


		String[] stringArray = sequence.replaceAll("-", "0").split("(?!^)");

		int totalScore = 0;
		int frameCount = 0;
		int singleCount = 0;



		for (int i = 0; i < stringArray.length; i++) {


			if (stringArray[i].toLowerCase().equals("x")) {
				int next = convertFromString(stringArray[i + 1], stringArray[i])
						+ convertFromString(stringArray[i + 2], stringArray[i + 1]);
				totalScore += 10 + next;

				frameCount++; 

				if (frameCount == 10) 
										
				{
					return totalScore;
				}

			}


			else if (stringArray[i].equals("/")) {

				int next = convertFromString(stringArray[i], stringArray[i - 1])
						+ convertFromString(stringArray[i + 1], stringArray[i]);
				totalScore += next;

				singleCount++; 

				if (singleCount % 2 == 0) {
					frameCount++;
				}

				if (frameCount == 10) {
					return totalScore;
				}

			}

		
			else {
				totalScore += Integer.parseInt(stringArray[i]);

				singleCount++;

				if (singleCount % 2 == 0) {
					frameCount++;
				}
				
				if (frameCount == 10) {
					return totalScore;
				}

			}

		}

		return totalScore;

	}

	public static int convertFromString(String val, String prev) {

		if (val.toLowerCase().equals("x")) {
			return 10;
		}

		else if (val.equals("/")) {
			return 10 - Integer.parseInt(prev);
		}

		else {
			return Integer.parseInt(val);
		}

	}

}
