package Main;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Employee {
    private int empId;
    private String empDesignation;
    private String empName;
    private String empContact;
    private String empPassword;
    private int empAccessLevel;
    private String empSalary;
    private int empOrders;
    static public Employee loggedInEmp = new Employee();
    static public Employee empInUse = new Employee();
    public static ArrayList<String> employeeNameList = new ArrayList();
    public static ArrayList<String> employeeDesigList = new ArrayList();
    public static ArrayList<Integer> employeeSalaryList = new ArrayList();
    public static ArrayList<String> cashierNameList = new ArrayList();
    
    EstablishConnection con = new EstablishConnection();
    Connection con_obj = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet res = null;

     public Employee(int empId, String empDesignation, String empName, String empContact, String empPassword, int empAccessLevel, String empSalary) {
        con_obj = con.EstablishConnection();
        this.empId = empId;
        this.empDesignation = empDesignation;
        this.empName = empName;
        this.empContact = empContact;
        this.empPassword = empPassword;
        this.empAccessLevel = empAccessLevel;
        this.empSalary = empSalary;
    }
     
    public Employee(){
        con_obj = con.EstablishConnection();
    }

    public String getEmpSalary() {
        return empSalary;
    }
     
    public int getEmpId() {
        return empId;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpContact() {
        return empContact;
    }
    
    public String getEmpPassword () {
        return empPassword;
    }

    public int getEmpAccessLevel() {
        return empAccessLevel;
    }

    public int getEmpOrders() {
        return empOrders;
    }

    
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpContact(String empContact) {
        this.empContact = empContact;
    }
    
    public void setEmpPassword (String empPassword) {
        this.empPassword = empPassword;
    }

    public void setEmpAccessLevel(int empAccessLevel) {
        this.empAccessLevel = empAccessLevel;
    }
    
    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public void setEmpOrders(int empOrders) {
        this.empOrders = empOrders;
    }
    
    
    
    public boolean LoginEmp(String empName, String empPassword){
        String loginString = "select * from employeeDB where empName = '"+empName+"' and empPassword = '"+empPassword+"'";
        boolean check;
        try{
            pstmt = con_obj.prepareStatement(loginString);
            res = pstmt.executeQuery();
            if(res.next()){
                check = true;
            }else{
                JOptionPane.showMessageDialog(null, "Invalid credentials");
                check = false;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            check = false;
        }
        return check;
    }
    public boolean addEmp(int empId, String empDesignation, String empName, String empContact, String empPassword, int empAccessLevel, String empSalary){
        String add = "insert into employeeDB(empName,empPassword,empSalary,empDesignation,empAccessLevel,empContact,empId,ordersMade) values ('"+empName+"','"+empPassword+"','"+empSalary+"','"+empDesignation+"','"+empAccessLevel+"','"+empContact+"','"+empId+"','"+0+"')";
        boolean check;
        try{
            stmt = con_obj.createStatement();
            int res = stmt.executeUpdate(add);
            if(res>0){
                check = true;
            }else{
                check = false;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            check = false;
        }
        return check;
    }
    public boolean remEmp(String empName, int empId){
        String remove = "delete from employeeDB where empName = '"+empName+"' and empId = '"+empId+"'";
        boolean check;
        try{
            stmt = con_obj.createStatement();
            int res = stmt.executeUpdate(remove);
            if(res>0){
                check = true;
            }else{
                check = false;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            check = false;
        }
        return check;
    }
    public void changeSalaryEmp(String empName, int empId, String newEmpSalary){
        String update = "update employeeDB SET empSalary = '"+newEmpSalary+"' where empName = '"+empName+"' and empId = '"+empId+"'";
        try{
            pstmt = con_obj.prepareStatement(update);
            pstmt.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void changeDesignationEmp(String empName, int empId, String newDesignation){
        String update = "update employeeDB SET empDesignation = '"+newDesignation+"' where empName = '"+empName+"' and empId = '"+empId+"'";
        try{
            pstmt = con_obj.prepareStatement(update);
            pstmt.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void changeNameEmp(String empName, int empId, String newName){
        String update = "update employeeDB SET empName = '"+newName+"' where empName = '"+empName+"' and empId = '"+empId+"'";
        try{
            pstmt = con_obj.prepareStatement(update);
            pstmt.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void changePasswordEmp(String empName, int empId, String newPassword){
        String update = "update employeeDB SET empPassword = '"+newPassword+"' where empName = '"+empName+"' and empId = '"+empId+"'";
        try{
            pstmt = con_obj.prepareStatement(update);
            pstmt.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void fetchEmp(String empName, String empPassword){
        String fetch = "select * from employeeDB where empName = '"+empName+"' and empPassword = '"+empPassword+"'";
        try{
            pstmt = con_obj.prepareStatement(fetch);
            res = pstmt.executeQuery();
            while(res.next()){
                loggedInEmp.setEmpName(res.getString("empName"));
                loggedInEmp.setEmpId(res.getInt("empId"));
                loggedInEmp.setEmpAccessLevel(res.getInt("empAccessLevel"));
                loggedInEmp.setEmpDesignation(res.getString("empDesignation"));
                loggedInEmp.setEmpSalary(res.getString("empSalary"));
                loggedInEmp.setEmpPassword(res.getString("empPassword"));
                loggedInEmp.setEmpContact(res.getString("empContact"));
                loggedInEmp.setEmpOrders(Integer.parseInt(res.getString("ordersMade")));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void fetchEmp(String empName, int empId){
        String fetch = "select * from employeeDB where empName = '"+empName+"' and empId = '"+empId+"'";
        try{
            pstmt = con_obj.prepareStatement(fetch);
            res = pstmt.executeQuery();
            while(res.next()){
                empInUse.setEmpName(res.getString("empName"));
                empInUse.setEmpId(res.getInt("empId"));
                empInUse.setEmpAccessLevel(res.getInt("empAccessLevel"));
                empInUse.setEmpDesignation(res.getString("empDesignation"));
                empInUse.setEmpSalary(res.getString("empSalary"));
                empInUse.setEmpPassword(res.getString("empPassword"));
                empInUse.setEmpContact(res.getString("empContact"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void empSalaryList(){
        String fetch = "select * from employeeDB";
        try{
            pstmt = con_obj.prepareStatement(fetch);
            res = pstmt.executeQuery();
            while(res.next()){
                employeeNameList.add(res.getString("empName"));
                employeeDesigList.add(res.getString("empDesignation"));
                employeeSalaryList.add(Integer.parseInt(res.getString("empSalary")));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void loadCashierNameLIst(){
        String search = "Cashier";
        String fetch = "select * from employeeDB where empDesignation = '"+search+"'";
        try{
            pstmt = con_obj.prepareStatement(fetch);
            res = pstmt.executeQuery();
            while(res.next()){
                cashierNameList.add(res.getString("empName"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void changeOrdersEmp(String empName, int neworderscompleted){
        String update = "update employeeDB SET ordersMade = '"+neworderscompleted+"' where empName = '"+empName+"'";
        try{
            pstmt = con_obj.prepareStatement(update);
            pstmt.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
