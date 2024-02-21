package source;

import java.io.*;

public class Student implements Serializable {
    private String name;
    private String adminNumber;
    private String course;
    private Module[] modulesTaken;   
    
    public Student(String name, String adminNumber, 
            String course, Module[] modulesTaken){
        this.name = name;
        this.adminNumber = adminNumber;
        this.course = course;
        this.modulesTaken = modulesTaken;
    }
    
    public Student(){
        
    }
    
    public String getName() {
        return name;
    }
    
    public String getadminNumber() {
        return adminNumber;
    }
    
    public String getCourse() {
        return course;
    }
    
    public Module getModule(int index) {
        return modulesTaken[index];
    }
    public Module[] getModulesTaken() {
        return modulesTaken;
    }

    public void setModulesTaken(Module[] modulesTaken) {
        this.modulesTaken = modulesTaken;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAdminNumber(String adminNumber) {
        this.adminNumber = adminNumber;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public String displayStudentInfo() {
        String msg = "Course\tAdmin#\tName\n" + course + "\t"
                      + adminNumber + "\t" + name + "\n\nModules Taken:\n";
        msg += displayModulesTaken();
        return msg;
    }
    
    public String displayModulesTaken() {
        String msg = "";
        for (int i = 0; i < modulesTaken.length; i++) {
            msg += (i+1) + ". " + modulesTaken[i].displayModuleInfo() + "\n";
        }
        return msg;
    }
    
    public double computeGPA () {
        double GPA, gradePoints, totalPoints = 0, totalCreditUnits = 0;
        for (int i = 0; i < modulesTaken.length; i++) {
            if (modulesTaken[i].getMark() >= 80)
                gradePoints = 4;
            else if (modulesTaken[i].getMark() >= 70)
                gradePoints = 3;
            else if (modulesTaken[i].getMark() >= 60)
                gradePoints = 2;
            else if (modulesTaken[i].getMark() >= 50)
                gradePoints = 1;
            else
                gradePoints = 0;
            totalPoints += gradePoints * modulesTaken[i].getCreditUnits();
            totalCreditUnits += modulesTaken[i].getCreditUnits();
        }
        GPA = totalPoints / totalCreditUnits; 
        return GPA;
    }
    public String getType(){
        return "";
    }
    
    public void setType(){
        
    }
}
