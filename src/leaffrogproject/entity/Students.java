package leaffrogproject.entity;

public class Students {

    int stdID;
    String Fname, Lname, email, contact;

    public Students() {

    }

    public Students(int stdID, String Fname, String Lname, String email, String Contact) {
        this.stdID = stdID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.email = email;
        this.contact = Contact;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Students{" + "stdID=" + stdID + ", Fname=" + Fname + ", Lname=" + Lname + ", email=" + email + ", contact=" + contact + '}';
    }
    
}
