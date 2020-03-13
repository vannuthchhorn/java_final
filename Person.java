package final_exam_final;

public abstract class Person {
	private String name;
	private double nbOfSleepHours;
	Person(String name,double nbOfSleepHours){
		this.name = name;
		this.nbOfSleepHours = nbOfSleepHours;
	}
	
	String getName(){
		return name;
	}
	double getNbOfSleepHours(){
		return nbOfSleepHours;
		
	}
	 abstract void showSleepQuality();
}