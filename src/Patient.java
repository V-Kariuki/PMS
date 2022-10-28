package src;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
public class Patient{
    private int Patient_id;
    private String First_Name;
    private String Middle_Name;
    private String Last_Name;
    private String Home_Address;
    private String phone;
    private String Occupation;
    private Date Date_of_Birth;
    private int weight;
    private Date Appointment_Date;
    private String Gender;
    //private int Age;
    private String Kin_Name;
    private String Kin_phone;
    Date Registration_date;
    public Patient(int _patient_id, String _First_Name, String _Middle_Name,String _Last_Name,String _Gender, Date _reg_date) throws ParseException{
        Patient_id=_patient_id;
        First_Name=_First_Name;
        Middle_Name=_Middle_Name;
        Last_Name = _Last_Name;
        Gender = _Gender;
        Registration_date=_reg_date;
        Date_of_Birth = getDOB();
        //Age = getAge();
        Kin_Name = getKinname();
        Kin_phone = getKinphone();
        weight = getWeight();
    }
    public int getWeight(){
        System.out.println("Enter your weight");
        Scanner weightscanner = new Scanner(System.in);
        weightscanner.reset();
        weight = weightscanner.nextInt();
        return weight;
    }
    public String getKinname(){
        System.out.println("Enter yoour next of Kin's full names");
        Scanner scankinname = new Scanner(System.in);
        scankinname.reset();
        Kin_Name = scankinname.nextLine();
        scankinname.reset();
        return Kin_Name;
    }
    public String getKinphone(){
        System.out.println("Enter yoour next of Kin's phone contact");
        Scanner kinphonescanner = new Scanner(System.in);
        long numb = kinphonescanner.nextLong();
        Kin_phone = Long.toString(numb);
        return Kin_phone;
    }
    public Date getDOB() throws ParseException{
        System.out.println("Enter date of birth in the format dd-MM-yy");
        Scanner dobscanner = new Scanner(System.in);
        dobscanner.reset();
        String birthdate = dobscanner.nextLine();
        Date_of_Birth = new SimpleDateFormat("dd-MM-yyyy").parse(birthdate);
        return Date_of_Birth; 

    }
    public Date bookAppointment() throws ParseException{
        System.out.println("Enter date for appointment in the format dd-MM-yy");
        Scanner appscanner = new Scanner(System.in);
        appscanner.reset();
        String appdate = appscanner.nextLine();
        Appointment_Date = new SimpleDateFormat("dd-MM-yyyy").parse(appdate);
        return Appointment_Date; 

    }
    public void getAge(){
        /*Date currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(Calendar.getInstance().getTime());
        Age =Period.between(Date_of_Birth,currentDate).getYears();*/
        return;
    }
    public static void main(String[] args) throws ParseException {
        Date _reg_date=new Date();
        Patient Vincent = new Patient(100,"Vincent","Kariuki","Munene","Male",_reg_date);
        System.out.println(Vincent.Patient_id);
        System.out.println(Vincent.First_Name);
        System.out.println(Vincent.Middle_Name);
        System.out.println("DOR"+Vincent.Registration_date);
        System.out.println("DOB"+Vincent.Date_of_Birth);
        System.out.println(Vincent.weight+"KGs");
        System.out.println("Kname"+Vincent.Kin_Name);
        System.out.println("Kphone"+Vincent.Kin_phone);
    }
}