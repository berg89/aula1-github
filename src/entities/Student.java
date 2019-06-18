package entities;

public class Student
{

	private String name;
	private double firstGrade;
	private double secondGrade;
	private double thirdGrade;
	private double finalGrade;
	
	public double getFinalGrade()
	{
		finalGrade = firstGrade + secondGrade + thirdGrade; 
		return finalGrade;
	}
	
	private boolean isApproved()
	{
		if(finalGrade >= 60.0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private double getMissingPoints()
	{
		return 60.0 - finalGrade;
	}
	
	public String getFinalMsg()
	{
		if(isApproved())
		{
			return "PASS";
		}
		else
		{
			return "FAILED%n"
				+ "MISSING " + getMissingPoints() + " POINTS";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFirstGrade() {
		return firstGrade;
	}

	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}

	public double getSecondGrade() {
		return secondGrade;
	}

	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}

	public double getThirdGrade() {
		return thirdGrade;
	}

	public void setThirdGrade(double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}

	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
	}
	
}
