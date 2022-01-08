
public class attendance {
     String Regd;
String Name;
String Fathername;
String Clas;
String Sec;
String month;
String year;
String Tdays;
String Tattendence;
String Tabsent; 
String Tleaves;

    public attendance(String Regd, String Name, String Fathername, String Clas, String Sec,String month,String year, String Tdays, String Tattendence, String Tabsent, String Tleaves) {
        this.Regd = Regd;
        this.Name = Name;
        this.Fathername = Fathername;
        this.Clas = Clas;
        this.Sec = Sec;
         this.month = month;
          this.year = year;
        this.Tdays = Tdays;
        this.Tattendence = Tattendence;
        this.Tabsent = Tabsent;
        this.Tleaves = Tleaves;
    }

    attendance(String a, String b, String c, String d, String e, String f, String g, String h, String i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRegd() {
        return Regd;
    }

    public String getClas() {
        return Clas;
    }

    public String getTleaves() {
        return Tleaves;
    }

    public String getTdays() {
        return Tdays;
    }

    public String getTattendence() {
        return Tattendence;
    }

    public String getTabsent() {
        return Tabsent;
    }

    public String getSec() {
        return Sec;
    }

    public String getName() {
        return Name;
    }

    public String getFathername() {
        return Fathername;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

}
