//Ibrahim Irshaid 1231870 lab section 11 lecture section 6
package Project;
import java.util.ArrayList;
//TODO calcBill method
public class EmergencyPatient extends PatientBase {
	
	private double emergencyFee;
	
	public EmergencyPatient(String patientId, String name, int age, String medicalHistory, Department department, double emergencyFee) {
		super(patientId, name, age, medicalHistory, department);
		this.emergencyFee = emergencyFee;
	}

	public EmergencyPatient() {}

	public double getEmergencyFee() {
		return emergencyFee;
	}

	public void setEmergencyFee(double emergencyFee) {
		this.emergencyFee = emergencyFee;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", Emergency Fee: "+ emergencyFee;
	}
	
	@Override
	public double calculateBill() {// calculates the bill for the emergency patient based on his emergency fee, his hospital services and the tax rate
		double totalServiceCost = 0;
		for(int i=0 ;i<super.getServices().size() ;i++)//loop to calculate the total service cost
		{
			totalServiceCost += super.getServices().get(i).getServiceCost();
		}
		return (emergencyFee + totalServiceCost)*(1+TAX_RATE);
		
	}
	@Override
	public int compareTo(PatientBase o) {// to compare between patients based on their bill amount
		double test = 0.0;
		test = calculateBill() - o.calculateBill();
		if(test < 0)//returns -1 if patient o's bill is less than the bill of the patient in comparison with
			return -1;
		else if (test > 0)//returns 1 if patient o's bill is greater than the bill of the patient in comparison with
			return 1;
		else 
			return 0;//returns 0 if patient o's bill equals the bill of the patient in comparison with
	}
}
