package com.ust;

 class Patientinfo {
	private String name;
	private boolean covidvaccinated;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCovidvaccinated() {
		return covidvaccinated;
		
	}

	public void setCovidvaccinated(boolean covidvaccinated) {
		this.covidvaccinated = covidvaccinated;
		if (covidvaccinated==true) {
			System.out.println("Congrats! Its good");
		}
		else {
			System.out.println("Please get vaccinated");
		}
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
 }
	public class Patient {

	public static void main(String[] args) {
		Patientinfo p=new Patientinfo();
		p.setName("Sanju");
		p.setCovidvaccinated(false);
		p.setAge(22);
		System.out.println(p.getName()+" "+p.isCovidvaccinated()+" "+p.getAge());

	}

}
 
