package source;

import java.io.Serializable;

public class InternationalStudent extends Student implements Serializable {
    private boolean hasPass;
    private String type;
    
    public InternationalStudent(String name, String adminNumber, 
            String course, Module[] modulesTaken, boolean hasPass) {
        super(name, adminNumber, course, modulesTaken);
        this.type = "International Student";
        this.hasPass = hasPass;
    }

    public boolean getHasPass() {
        return hasPass;
    }

    public void setHasPass(boolean hasPass) {
        this.hasPass = hasPass;
    }  

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
