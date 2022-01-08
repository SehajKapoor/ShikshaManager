/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class fee {
  String Regd;
String Name;
String Fathername;
String Clas;
String Sec;
String Submitdate;
String Monthlyfee;
String Othercharges; 
String Total;
String Amontpaid;
String Balance;

    public fee(String Regd, String Name, String Fathername, String Clas, String Sec, String Submitdate, String Monthlyfee, String Othercharges, String Total, String Amontpaid, String Balance) 
    {
        this.Regd = Regd;
        this.Name = Name;
        this.Fathername = Fathername;
        this.Clas = Clas;
        this.Sec = Sec;
        this.Submitdate = Submitdate;
        this.Monthlyfee = Monthlyfee;
        this.Othercharges = Othercharges;
        this.Total = Total;
        this.Amontpaid = Amontpaid;
        this.Balance = Balance;
    }

String getRegd()
{ return Regd;
}

    public String getName() {
        return Name;
    }

    public String getFathername() {
        return Fathername;
    }

    public String getClas() {
        return Clas;
    }

    public String getSec() {
        return Sec;
    }

    public String getSubmitdate() {
        return Submitdate;
    }

    public String getMonthlyfee() {
        return Monthlyfee;
    }

    public String getOthercharges() {
        return Othercharges;
    }

    public String getTotal() {
        return Total;
    }

    public String getAmontpaid() {
        return Amontpaid;
    }

    public String getBalance() {
        return Balance;
    }


        

}
