package org.kulkarni.amogh.firstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PatientRepository {
	List<Cerner> patients = new ArrayList<>();
	Connection con = null;
	
	public PatientRepository() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/patient","root","root");
		String SQL="select * from patient";
		Statement st11=con.createStatement();
		ResultSet rs=st11.executeQuery(SQL);
		while(rs.next()) {
			Cerner a=new Cerner();
			a.setPatientNumber(rs.getInt(1));
			a.setPatientName(rs.getString(2));
			patients.add(a);
		}
		

		Cerner patient1 = new Cerner();
		
		}
		catch(Exception e) {
			System.out.println("Connection Problem "+e);
		}
		
		
		
		//patients.add(patient2);
	}
	
	public List<Cerner> getPatients(){
		
		return patients;
		
	}
	
	public Cerner getPatient(int id) {
		
		
		
		for(Cerner c : patients)
		{
			if(c.getPatientNumber()==id)
				return c;
		}
		
		return null;
		
	}

	public void create(Cerner c1) {
		// TODO Auto-generated method stub
		patients.add(c1);	
	}
	

}
