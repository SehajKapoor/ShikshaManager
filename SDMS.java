

public class SDMS {
     
String Regd_no;
String Student_Name;
String Father_Name;
String Father_occupation;
String ClassName;
String Section;
String DOB; 
String Aadhaar_no;
//SDMS(String Regd_no,String Student_Name,String Father_Name,String Father_occupation,String ClassName,String Section, String DOB,String Aadhaar_no)
//{
//    this.Regd_no
//}

    public SDMS(String Regd_no, String Student_Name, String Father_Name, String Father_occupation, String ClassName, String Section, String DOB, String Aadhaar_no) {
        this.Regd_no = Regd_no;
        this.Student_Name = Student_Name;
        this.Father_Name = Father_Name;
        this.Father_occupation = Father_occupation;
        this.ClassName = ClassName;
        this.Section = Section;
        this.DOB = DOB;
        this.Aadhaar_no = Aadhaar_no;
    }

    public String getRegd_no() {
        return Regd_no;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public String getFather_Name() {
        return Father_Name;
    }

    public String getFather_occupation() {
        return Father_occupation;
    }

    public String getClassName() {
        return ClassName;
    }

    public String getSection() {
        return Section;
    }

    public String getDOB() {
        return DOB;
    }
    public String getAadhaar_no() {
        return Aadhaar_no;
    }

   
}