//Ibrahim Irshaid 1231870 lab section 11 lecture section 6
package Project;
import java.util.*;
//TODO check comparable
public class Doctor implements Comparable<Doctor> {
	private String doctorId;
	private String name;
	private String speacialty;
	private String degree;
	private double baseSalary;
	private double overTimeHours;
	private double overTimeRate;
	private Department department;
	
	public Doctor(String doctorId, String name, String speacialty, String degree, double baseSalary,
			double overTimeHours, double overTimeRate, Department department) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.speacialty = speacialty;
		this.degree = degree;
		this.baseSalary = baseSalary;
		this.overTimeHours = overTimeHours;
		this.overTimeRate = overTimeRate;
		this.department = department;
	}
	
	public Doctor() {}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeacialty() {
		return speacialty;
	}

	public void setSpeacialty(String speacialty) {
		this.speacialty = speacialty;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(double overTimeHours) {
		this.overTimeHours = overTimeHours;
	}

	public double getOverTimeRate() {
		return overTimeRate;
	}

	public void setOverTimeRate(double overTimeRate) {
		this.overTimeRate = overTimeRate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public double calculateSalary() {//calculates salary based on the degree of the doctor 
		if(degree.toLowerCase().compareTo("bachelor") == 0)//converting to lower case to count for miss inputting a capital letter
			return 1.1*baseSalary + calculateOvertimePay();
		else if(degree.toLowerCase().compareTo("master") == 0)
			return 1.2*baseSalary + calculateOvertimePay();
		else if(degree.toLowerCase().compareTo("phd") == 0)
			return 1.3*baseSalary + calculateOvertimePay();
		else {
			System.out.println("Degree is invalid\n");//counts for the case of an invalid degree input
			return -1;
		}
	}
	public double calculateOvertimePay() {
		return overTimeHours*overTimeRate; 
	}

	@Override
	public String toString() {
		return "Doctor [doctorId: " + doctorId + ", name: " + name + ", speacialty: " + speacialty + ", degree: " + degree
				+ ", baseSalary: " + baseSalary + ", overTimeHours: " + overTimeHours + ", overTimeRate: " + overTimeRate
				+ ", department: " + department.getName() + "]";
	}

	@Override
	public int compareTo(Doctor o) {// to compare between doctors based on their salaries
		double test = calculateSalary() - o.calculateSalary();
			if(test < 0)
				return -1;
			else if(test > 0)
				return 1;
			else
				return 0;
	}
	
}
