/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;


public class teacherInfo {
    
    String ID,title,fname,lname,fullname,initial,dob,nic,gender,contact,email,filename ;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
                                                                     //title,fname,lname,fullname,initial,dob,nic,gender,contact,email,image 
    teacherInfo(String ID,String title, String fname, String lname, String fullname, String initial, String dob, String nic, String gender, String contact, String email, String filename) {
        //To change body of generated methods, choose Tools | Templates.
        //title,fname,lname,fullname,initial,dob,nic,gender,contact,email,image 
         this.ID = ID;
         this.title = title;
        this.fname = fname;
        this.lname = lname;
        this.fullname = fullname;
         this.initial = initial;
        this.dob = dob;
        this.nic = nic;
        this.gender = gender;
         this.contact = contact;
        this.email = email;
        this.filename = filename;
       
        
        
        
        
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    }

    
    

