package final_exam_final;

public class Employee extends Person implements ITaxPayable{
	private double salary;
	Employee(String name, double nbOfSleepHours,double salary) {
		super(name, nbOfSleepHours);
		this.salary = salary;
	}
	@Override
	public double calculateNetSalary() {
		double netSalary;
		double tax;
		if(salary <= 200) {
			tax = (double) (salary * 0.05);
		}else {
			tax = (double) (salary * 0.1);
		}
		netSalary = salary - tax;
		return netSalary;
	}
	@Override
	void showSleepQuality() {
		System.out.println(getNbOfSleepHours());
		if(getNbOfSleepHours() < 5) {
			System.out.println(getName()+ "needs more sleep");
		} if(getNbOfSleepHours() < 5 && getNbOfSleepHours() >=8) {
			System.out.println(getName()+"has enough sleep");
		}else {
			System.out.println( getName()+ " is probably sleeping too much...");
		}
	}
	@Override
	public String toString() {
		return "Employee: [name: " + getName() + " , salary: " + salary + "]";
	}
	
}
