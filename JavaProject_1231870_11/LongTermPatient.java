//Ibrahim Irshaid 1231870 lab section 11 lecture section 6
package Project;
import java.util.*;
//TODO calcCill method
public class LongTermPatient extends PatientBase {
	
	private int daysAdmitted;
	private double dailyRate;
	
	public LongTermPatient(String patientId, String name, int age, String medicalHistory, Department department, int daysAdmitted, double dailyRate) {
		super(patientId, name, age, medicalHistory, department);
		this.daysAdmitted = daysAdmitted;
		this.dailyRate = dailyRate;
		
	}

	public LongTermPatient() {}

	public int getDaysAdmitted() {
		return daysAdmitted;
	}

	public void setDaysAdmitted(int daysAdmitted) {
		this.daysAdmitted = daysAdmitted;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}
	
	@Override
	public double calculateBill() {// calculates the bill for the long term patient based on his days spent in the hospital, the daily rate, his hospital services and the tax rate

		double totalServiceCost = 0;
		for(int i=0 ;i<super.getServices().size() ;i++)//loop to calculate the total service cost
		{
			totalServiceCost += super.getServices().get(i).getServiceCost();
		}
		return (daysAdmitted*dailyRate + totalServiceCost)*(1+TAX_RATE);
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +", Days Admitted: "+ daysAdmitted + ", Daily Rate: " + dailyRate;
	}

	@Override
	public int compareTo(PatientBase o) {// to compare between patients based on their bill amount
		double test = calculateBill() - o.calculateBill();
		if(test < 0)//returns -1 if patient o's bill is less than the bill of the patient in comparison with
			return -1;
		else if (test > 0)//returns 1 if patient o's bill is greater than the bill of the patient in comparison with
			return 1;
		else 
			return 0;//returns 0 if patient o's bill equals the bill of the patient in comparison with
		
	}
	
}
