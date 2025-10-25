//Ibrahim Irshaid 1231870 lab section 11 lecture section 6
package Project;
import java.util.*;
public class Driver {
//TODO sort doctors , sort patients
	public static void main(String[] args) {
		Department[] departments = {
				new Department("011", "Emergency"),
				new Department("403", "Cardiology"),
				new Department("354", "Neurology")
		};
		ArrayList<PatientBase> patients = new ArrayList<>();
		patients.add(new EmergencyPatient("023", "Ahmad", 18, "Diabetes",departments[0],220.85 ));
		patients.add(new EmergencyPatient("034", "Mohammed", 20, "Cholesterol",departments[1],589.99));
		patients.add(new LongTermPatient("1287", "Saleem", 48, "ADHD",departments[2],470,30.0));
		
		ArrayList<Doctor> doctors = new ArrayList<>();
		doctors.add(new Doctor("242", "Farouq", "Neurologist", "Master", 1500.0, 2.5, 100.0, departments[2]));
		doctors.add(new Doctor("289", "Omar", "Cardiologist", "PhD", 1300.0, 7.3, 150.0, departments[1]));
		
		ArrayList<HospitalService> services = new ArrayList<>();
		services.add(new HospitalService("Stent Planting", 400.0, patients.get(1)));
		services.add(new HospitalService("Lab Tests", 159.99, patients.get(1)));
		services.add(new HospitalService("Neural Treatment", 200.0, patients.get(0)));
		services.add(new HospitalService("X-Ray", 20.5, patients.get(0)));
		
		generateBill(patients.get(2));
		System.out.println("\nList of Doctors Sorted Ascendingly Based on thier Salaries:\n");
		sortDoctorsBySalary(doctors);
		System.out.println("\nList of Patients Sorted Ascendingly Based on thier Bill Amount:\n");
		sortPatientsByBill(patients);
		System.out.println("\nTotal Bills: "+ calculateTotalpatientsBill(patients));
	
	}
	
	public static void sortDoctorsBySalary (ArrayList<Doctor> doctors) {
		doctors.sort(null);// uses the compare to method to sort the doctors based on their salaries (it will sort them in ascending order due to the algorithm used in the compare to method)
		doctors.forEach(doctor -> System.out.printf("%-12s %s %-14s %s %.2f\n",doctor.getName(),"|", doctor.getDepartment().getName(),"|", doctor.calculateSalary()));//prints the sorted doctors in a well formated form
	}
	
	public static void sortPatientsByBill(ArrayList<PatientBase> patients) {
		patients.sort(null);// uses the compare to method to sort the patients base on their bill amount(it will sort them in ascending order due to the algorithm used in the compare to method)
		patients.forEach(patient -> System.out.printf("%-12s %s %d\n" , patient.getName() ,"|", patient.getAge() ));//prints the sorted patients in a well formated form
	}
	
	public static double calculateTotalpatientsBill (ArrayList<PatientBase> patients) {
		double total =0;
		for(int i=0; i<patients.size(); i++)
		{
			total += patients.get(i).calculateBill();
		}
		return total;
	}
	public static void generateBill(PatientBase x) {
		System.out.println("Patient Number ("+x.getPatientId() +") Bill:\n"+"Patient's Name: "+x.getName()+"\nPatient's ID: "+x.getPatientId()+"\nTotal Bill Amount: "+x.calculateBill()+"$");
	}
}	
	
