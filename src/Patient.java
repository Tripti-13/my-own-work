

public class Patient {
    private String patientName;
    private int patientAge;
    private String doa;
    private String disease;
    private Information information;
    private Payment payment;
    //parameterized constructor
    public Patient(String patientName, int patientAge,String doa,String disease,Information information,Payment payment){
        this.patientName=patientName;
        this.patientAge=patientAge;
        this.doa=doa;
        this.disease=disease;
        this.information=information;
        this.payment=payment;
    }
    public void patientDetails(){
        System.out.println("Patient's name: "+patientName);
        System.out.println("Patient's age: "+patientAge);
        System.out.println("Date of Arrival: "+doa);
        System.out.println("Disease: "+disease);
        //Information class attributes
        System.out.println("Block Number: "+information.getBlockNo());
        System.out.println("Floor Number: "+information.getFloorNo());
        System.out.println("Room Number: "+information.getRoomNo());
        System.out.println("Bed Number: "+information.getBedNo());
        //Payment class attributes
        System.out.println("Registration Fees "+payment.getRegFees());
        System.out.println("Admission Fees "+payment.getAdmissionFees());
        System.out.println("Balance Amount: "+payment.getBalanceAmount());
    }

    public static void main(String[] args) {
        Information information=new Information(4,12,35,80);
        Payment payment=new Payment(1000,60000,45000);
        Patient patient=new Patient("Me",28,"09-09-2020","Malaria",information,payment);
        patient.patientDetails();
    }

}
class Information{
    private int blockNo;
    private int floorNo;
    private int roomNo;
    private int bedNo;

    //parameterized constructor
    public Information(int blockNo,int floorNo,int roomNo,int bedNo){
        this.blockNo=blockNo;
        this.floorNo=floorNo;
        this.roomNo=roomNo;
        this.bedNo=bedNo;
    }
    public int getBlockNo(){
        return blockNo;
    }
    public int getFloorNo(){
        return floorNo;
    }
    public int getRoomNo(){
        return roomNo;
    }
    public int getBedNo(){
        return bedNo;
    }

}
class Payment{
    private double regFees;
    private double admissionFees;
    private double balanceAmount;

    //parameterized constructor
    public Payment(double regFees,double admissionFees,double balanceAmount){
        this.regFees=regFees;
        this.admissionFees=admissionFees;
        this.balanceAmount=balanceAmount;
    }
    public double getRegFees(){
        return regFees;
    }
    public double getAdmissionFees(){
        return admissionFees;
    }
    public double getBalanceAmount(){
        return balanceAmount;
    }
}
