package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Doctor extends Staff {
    private String Speciality;
    private String Ward_No;
    public Doctor(int _docid,String _FirstName, String _MiddleName, String _LastName, String _Speciality, String _Ward_No) throws ParseException{
        Doctor Daktari = new Doctor(1001,"Tom","Med","Tibu","General Practitioner","General Ward");
        Staff_id = _docid;
        Speciality = _Speciality;
        Ward_No = _Ward_No;
        First_Name = _FirstName;
        Middle_Name = _MiddleName;
        Last_Name = _LastName;
        Employment_Date = setDateofEmployment();
    }
    public Date setDateofEmployment() throws ParseException{
        System.out.println("Enter date of employment in the format dd-MM-yy");
        Scanner doescanner = new Scanner(System.in);
        doescanner.reset();
        String empdate = doescanner.nextLine();
        Employment_Date = new SimpleDateFormat("dd-MM-yyyy").parse(empdate);
        return Employment_Date; 
    }
    interface serviceAppointment{
        public void treatPatient();
        public void giveprescription();
    }

}
