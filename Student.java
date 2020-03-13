package final_exam_final;

public class Student extends Person {
	private String schoolName;
	Student(String name,String schoolName,double nbOfSleepHours) {
		super(name, nbOfSleepHours);
		this.schoolName = schoolName;
		
	}
	@Override
	void showSleepQuality() {
		if(getNbOfSleepHours() < 7) {
			System.out.println(getName()+" needs more sleep");
		}else if(getNbOfSleepHours() > 7 && getNbOfSleepHours() < 9) {
			System.out.println(getName()+" has enough sleep");
		}else {
			System.out.println(getName()+" is probably sleeping too much...");
		}
	}
	@Override
	public String toString() {
		return "Student: [ name:" +getName()+", school:" + schoolName + "]";
	}

	
	
}
