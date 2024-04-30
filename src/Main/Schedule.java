package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Schedule {
    private String monEarly;
    private String monLate;
    private String tueEarly;
    private String tueLate;
    private String wedEarly;
    private String wedLate;
    private String thursEarly;
    private String thursLate;
    private String friEarly;
    private String friLate;
    private String satEarly;
    private String satLate;

    public Schedule(){
        try{
            loadSchedule();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
       
    }
    public String getMonEarly() {
        return monEarly;
    }

    public String getMonLate() {
        return monLate;
    }

    public String getTueEarly() {
        return tueEarly;
    }

    public String getTueLate() {
        return tueLate;
    }

    public String getWedEarly() {
        return wedEarly;
    }

    public String getWedLate() {
        return wedLate;
    }

    public String getThursEarly() {
        return thursEarly;
    }

    public String getThursLate() {
        return thursLate;
    }

    public String getFriEarly() {
        return friEarly;
    }

    public String getFriLate() {
        return friLate;
    }

    public String getSatEarly() {
        return satEarly;
    }

    public String getSatLate() {
        return satLate;
    }

    public void setMonEarly(String monEarly) {
        this.monEarly = monEarly;
    }

    public void setMonLate(String monLate) {
        this.monLate = monLate;
    }

    public void setTueEarly(String tueEarly) {
        this.tueEarly = tueEarly;
    }

    public void setTueLate(String tueLate) {
        this.tueLate = tueLate;
    }

    public void setWedEarly(String wedEarly) {
        this.wedEarly = wedEarly;
    }

    public void setWedLate(String wedLate) {
        this.wedLate = wedLate;
    }

    public void setThursEarly(String thursEarly) {
        this.thursEarly = thursEarly;
    }

    public void setThursLate(String thursLate) {
        this.thursLate = thursLate;
    }

    public void setFriEarly(String friEarly) {
        this.friEarly = friEarly;
    }

    public void setFriLate(String friLate) {
        this.friLate = friLate;
    }

    public void setSatEarly(String satEarly) {
        this.satEarly = satEarly;
    }

    public void setSatLate(String satLate) {
        this.satLate = satLate;
    }
    public void saveSchedule()throws Exception{
        File file = new File("Schedule.txt");
        FileWriter writer = null;
        try{
            writer = new FileWriter("Schedule.txt");
            writer.write(this.monEarly);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.monLate);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.tueEarly);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.tueLate);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.wedEarly);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.wedLate);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.thursEarly);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.thursLate);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.friEarly);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.friLate);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.satEarly);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(this.satLate);
            writer.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
        writer.close();
    }
    }
    public void loadSchedule() throws Exception{
        File file = new File("Schedule.txt");
        FileReader reader = null;
        BufferedReader br = null;
        try{
            reader = new FileReader("Schedule.txt");
            br = new BufferedReader(new FileReader(file));
            this.monEarly = br.readLine();
            this.monLate = br.readLine();
            this.tueEarly = br.readLine();
            this.tueLate = br.readLine();
            this.wedEarly = br.readLine();
            this.wedLate = br.readLine();
            this.thursEarly = br.readLine();
            this.thursLate = br.readLine();
            this.friEarly = br.readLine();
            this.friLate = br.readLine();
            this.satEarly = br.readLine();
            this.satLate = br.readLine();
            br.close();
            reader.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            br.close();
            reader.close();
        }
    }
}
