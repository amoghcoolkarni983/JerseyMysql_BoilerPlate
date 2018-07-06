package org.kulkarni.amogh.firstProject;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cerner { 
	private String PatientName;
	private int PatientNumber;
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public int getPatientNumber() {
		return PatientNumber;
	}
	public void setPatientNumber(int patientNumber) {
		PatientNumber = patientNumber;
	}
	@Override
	public String toString() {
		return "Cerner [PatientName=" + PatientName + ", PatientNumber=" + PatientNumber + "]";
	}
	
	
	

}
