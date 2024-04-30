package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Finances {
    private int income;
    private int outflow;
    public Finances(){
        this.income = 0;
        this.outflow = 0;
    }
    public void updateoutflow(int d)throws Exception{
        loadVariables();
        this.outflow -= d;
        updateFile();
    }
    public void updateincome(int d)throws Exception{
        loadVariables();
        this.income += d;
        updateFile();
    }
    public void updateFile() throws Exception{
        File file = new File("Finances.txt");
        FileWriter writer = null;
        try{
            writer = new FileWriter("Finances.txt");
            writer.write("" + this.income);
            writer.write(System.getProperty( "line.separator" ));
            writer.write("" + this.outflow);
            writer.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
        writer.close();
    }
    }
    public void loadVariables() throws Exception{
        File file = new File("Finances.txt");
        FileReader reader = null;
        BufferedReader br = null;
        try{
            reader = new FileReader("Finances.txt");
            br = new BufferedReader(new FileReader(file));
            this.income = Integer.parseInt(br.readLine());
            this.outflow = Integer.parseInt(br.readLine());
            br.close();
            reader.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            br.close();
            reader.close();
        }
    }

    public int getIncome() {
        return this.income;
    }

    public int getOutflow() {
        return this.outflow;
    }
    
}
