package com.qa.exercises;

public class Results {
	
	//both methods take int values and return strings
	public String output(int phys, int chem, int bio) {
		
		
		
		String grades = "Your Physics grade is: "+ phys +",\nYour Chemistry grade is: "+ chem +", \nand your Biology grade is: "+ bio +".";
		
		return grades;
	}
	
	public String grade(int phys, int chem, int bio){
		
		double total = phys+chem+bio;
		double percent = (total*100)/450;
		String overall = "The grade total is: "+ total + " and the percentage earned is: " + String.format("%.2f", percent) + "%.";
		
		return overall;
		
	}
	
	public static void main(String[] args) {
		
		Results result = new Results();
		
		//if phys = 90 of 150, chem = 75 of 150, bio = 69 of 150;
		System.out.println(result.output(90, 75, 82));
		System.out.println(result.grade(90, 75, 82));
		
		
		//NOTE: both methods could probably be reduced to single method		
	}

}
