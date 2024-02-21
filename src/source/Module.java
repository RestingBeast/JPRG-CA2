package source;

import java.io.Serializable;

public class Module implements Serializable{
    private String name;
    private String code;
    private int creditUnits;
    private double mark;
    
    public Module(String name, String code, int creditUnits, double mark){
        this.name = name;
        this.code = code;
        this.creditUnits = creditUnits;
        this.mark = mark;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCode() {
        return code;
    }
    
    public int getCreditUnits() {
        return creditUnits;
    }
    
    public double getMark() {
        return mark;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public void setCreditUnits(int creditUnits) {
        this.creditUnits = creditUnits;
    }
    
    public void setMark(double mark) {
        this.mark = mark;
    }
    
    public String displayModuleInfo() {
        return code + "/" + name + "/" + creditUnits + ":  " + mark;
    }
}