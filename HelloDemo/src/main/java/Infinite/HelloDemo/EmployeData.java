package Infinite.HelloDemo;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@ManagedBean
@SessionScoped
@Entity
@Table(name="employdetails")
public class EmployeData {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int empId;

	@Column(name="firstname")
	private String empfirstname;

	@Column(name="lastname")
	private String emplastname;

	@Column(name="phonenumber")
	private int empphonenumber;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpfirstname() {
		return empfirstname;
	}

	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}

	public String getEmplastname() {
		return emplastname;
	}

	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}

	public int getEmpphonenumber() {
		return empphonenumber;
	}

	public void setEmpphonenumber(int empphonenumber) {
		this.empphonenumber = empphonenumber;
	}

	@Override
	public String toString() {
		return "EmployeData [empId=" + empId + ", empfirstname=" + empfirstname + ", emplastname=" + emplastname
				+ ", empphonenumber=" + empphonenumber + "]";
	}

	public EmployeData(int empId, String empfirstname, String emplastname, int empphonenumber) {
		this.empId = empId;
		this.empfirstname = empfirstname;
		this.emplastname = emplastname;
		this.empphonenumber = empphonenumber;
	}

	public EmployeData() {

	}


}

