package source;

import java.io.Serializable;

public class LocalStudent extends Student implements Serializable{

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    private String type;
    
    public LocalStudent(String name, String adminNumber, 
            String course, Module[] modulesTaken){
        super(name, adminNumber, course, modulesTaken);
        this.type = "Local Student";
    }
}
