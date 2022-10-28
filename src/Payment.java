package src;

public class Payment extends Appointment {
    private int Payment_id;
    private String Payment_mtd;
    private int Amount;
    public Payment(int _paymentid,String _paymentmtd,int _paymentamt,int _appmtid){
        Payment_id = _paymentid;
        Payment_mtd = _paymentmtd;
        Amount = _paymentamt;
        Appointment_Id = _appmtid;
    }
}
