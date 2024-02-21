package source;

import java.io.*;
import javax.swing.JOptionPane;

public class ReadWriteStudents {
    public Student[] getStudents(){
        Student[] students = new Student[10];
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("Students.txt"));
            String s;
            while((s = br.readLine())!= null){
                String[] temp = s.split(";");
                String course = temp[0];
                String admin = temp[1];
                String sname = temp[2];
                int mod = Integer.parseInt(temp[3]);
                Module[] modules = new Module[mod];
               //System.out.println("\n"+mod);
                int j = 0;
                int k = 4;
                while (j < modules.length){
                    while(k < modules.length * 4 + 1) {
                        String code = temp[k];
                        String mname = temp[++k];
                        int cu = Integer.parseInt(temp[++k]);
                        double mark = Double.parseDouble(temp[++k]);
                        modules[j] = new Module(mname, code,
                                cu, mark);
                        k++;
                        //System.out.println(modules[j].displayModuleInfo());
                        j++;
                    }
                }
                if (temp[temp.length-1].equals("Local Student")){
                    students[count++] = new LocalStudent(sname, admin, course, modules);
                } else {
                    boolean pass = Boolean.parseBoolean(temp[temp.length-1]);
                    students[count++] = new InternationalStudent(sname, admin, course, modules, pass);
                }    
            }
            br.close();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "I/O error");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return students;
    }
    
    public void saveStudents(Student[] s){
        File f  = new File("Students.dat");
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream(f));
            os.writeObject(s);
            os.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "I/O error");
        }
    }
}
