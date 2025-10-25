//Ibrahim Irshaid 1231870 lab section 11 lecture section 6
package Project;
import java.util.*;
public class PatientBase implements Comparable<PatientBase>,Billable {

	@Override
	public double calculateBill() {
		return 0;
	}
	private String patientId;
	private String name;
	private int age;
	private String medicalHistory;
	private Department department;
	private ArrayList<HospitalService> services = new ArrayList<>();
	public PatientBase(String patientId, String name, int age, String medicalHistory, Department department) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.medicalHistory = medicalHistory;
		this.department = department;
	}
	public PatientBase() {}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public ArrayList<HospitalService> getServices() {
		return services;
	}
	public void setServices(ArrayList<HospitalService> services) {
		this.services = services;
	}
	@Override
	public String toString() {
		return "PatientBase patientId: " + patientId + ", name: " + name + ", age: " + age + ", medicalHistory: "
				+ medicalHistory + ", department: " + department.getName() + ", services: " + services ;
	}
	@Override
	public int compareTo(PatientBase o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
