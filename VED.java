
public class VED {
     
String Aadhaar_no; 
String DOB;
String Employee_Name;
String FH_Name;
String Gender;
String Category;
String Email;
String contact;
String Address;
String Salary;
String Qualification;
String Designation;
String Keystrength;

    public VED(String Aadhaar_no,String DOB, String Employee_Name, String FH_Name, String Gender,String Category,String Email,String contact,String Address,String Salary,String Qualification, String Designation,String Keystrength) {
        this.Aadhaar_no = Aadhaar_no;
        this.DOB  = DOB;
        this.Employee_Name = Employee_Name;
        this.FH_Name = FH_Name;
         this.Gender = Gender;
        this.Category = Category;
        this.Email = Email;
         this.contact = contact;
          this.Address = Address;
           this.Salary = Salary;
            this.Qualification = Qualification;
             this.Designation = Designation;
              this.Keystrength = Keystrength;
               
    }



    public String getAadhaar_no() {
        return Aadhaar_no;
    }

    public String getEmployee_Name() {
        return Employee_Name;
    }

    public String getFH_Name() {
        return FH_Name;
    }

    public String getDOB() {
        return DOB;
    }

    public String getDesignation() {
        return Designation;
    }

    public String getSalary() {
        return Salary;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return Address;
    }

    public String getCategory() {
        return Category;
    }

    public String getContact() {
        return contact;
    }

    public String getGender() {
        return Gender;
    }

    public String getKeystrength() {
        return Keystrength;
    }

    public String getQualification() {
        return Qualification;
    }
    

}
    