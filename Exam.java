package com.qa.exercises;

public class Exam {
	
	//originally put together with this class called into results.
	//several redundant sections
	int physic;
	int chemist;
	int biology;

	
	public String output(int phys, int chem, int bio) {
		
		this.physic = phys;
		this.chemist = chem;
		this.biology = bio;
	
		
		String grades = "Your Physics grade is: "+ phys +",\nYour Chemistry grade is: "+ chem +", \nand your Biology grade is: "+ bio +".";
		
		return grades;
	}
	
	
	public String grade(int phys, int chem, int bio){
		
		this.physic = phys;
		this.chemist = chem;
		this.biology = bio;
		
		double total = phys+chem+bio;
		double percent = (total*100)/450;
		
		String overall = "The grade total is: "+ total + " and the percentage earned is: " + String.format("%.2f", percent) + "%.";
		
		return overall;
		
	}
	
	

}
