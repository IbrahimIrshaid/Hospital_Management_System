//Ibrahim Irshaid 1231870 lab section 11 lecture section 6
package Project;
import java.util.*;

public class Department {
	private String departmentId;
	private String name;
	private ArrayList<Doctor> doctors = new ArrayList<>();
	private ArrayList<PatientBase> patients = new ArrayList<>();
	
	public Department(String departmentId, String name) {
		super();
		this.departmentId = departmentId;
		this.name = name;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public ArrayList<PatientBase> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<PatientBase> patients) {
		this.patients = patients;
	}
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	public void addpatient(PatientBase patient) {
		patients.add(patient);
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", name=" + name + ", doctors=" + doctors + ", patients="
				+ patients + "]";
	}
	
}
