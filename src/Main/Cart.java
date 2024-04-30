package Main;

import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Cart{
    private static String customerName;
    private static String customerContact;
    private static String employeeName;
    private static ArrayList<String> productNames = new ArrayList();
    private static ArrayList<String> productTypes = new ArrayList();
    private static ArrayList<Integer> productQuantity = new ArrayList();
    private static ArrayList<Integer> productPrice = new ArrayList();
    private static int orderTotal;
    private static String paymentMethod;

    public String getCustomerName() {
        return customerName;
    }

    public static String getPaymentMethod() {
        return paymentMethod;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public ArrayList<String> getProductNames() {
        return productNames;
    }

    public ArrayList<String> getProductTypes() {
        return productTypes;
    }

    public ArrayList<Integer> getProductQuantity() {
        return productQuantity;
    }

    public ArrayList<Integer> getProductPrice() {
        return productPrice;
    }

    public int getOrderTotal() {
        return orderTotal;
    }

    public void setCustomerName(String customerName) {
        Cart.customerName = customerName;
    }

    public void setCustomerContact(String customerContact) {
        Cart.customerContact = customerContact;
    }

    public void setEmployeeName(String employeeName) {
        Cart.employeeName = employeeName;
    }

    public static void setPaymentMethod(String paymentMethod) {
        Cart.paymentMethod = paymentMethod;
    }
    
    public void setProductNames(ArrayList<String> productNames) {
        Cart.productNames = productNames;
    }

    public void setProductTypes(ArrayList<String> productTypes) {
        Cart.productTypes = productTypes;
    }

    public void setProductQuantity(ArrayList<Integer> productQuantity) {
        Cart.productQuantity = productQuantity;
    }

    public void setProductPrice(ArrayList<Integer> productPrice) {
        Cart.productPrice = productPrice;
    }

    public void setOrderTotal(int orderTotal) {
        Cart.orderTotal = orderTotal;
    }
    
    public void addProductNames(String p){
        productNames.add(p);
    }
    public void addProductTypes(String p){
        productTypes.add(p);
    }
    public void addProductQuantity(int p){
        productQuantity.add(p);
    }
    public void addProductPrice(int p){
        productPrice.add(p);
    }
    
    public void printRecipt() throws Exception{
        File file = new File("orderHistory.txt");
        FileWriter writer = null;
        try{
            writer = new FileWriter("orderHistory.txt", true);
            writer.append(System.getProperty( "line.separator" ));
            writer.append("************************************");
            writer.append(System.getProperty( "line.separator" ));
            writer.append(System.getProperty( "line.separator" ));
            writer.append("-----------------------------------");
            writer.append(System.getProperty( "line.separator" ));
            writer.append("Name: " + customerName + "     Contact: " + customerContact);
            writer.append(System.getProperty( "line.separator" ));
            writer.append("Order completed by: " + employeeName);
            writer.append(System.getProperty( "line.separator" ));
            writer.append("-----------------------------------");
            writer.append(System.getProperty( "line.separator" ));
            writer.append("Item            Quantity   Price   ");
            writer.append(System.getProperty( "line.separator" ));
            for (int i = 0; i < productNames.size(); i++) {
                writer.append(productNames.get(i) + "  " + productQuantity.get(i) + "  " + productPrice.get(i));
                writer.append(System.getProperty( "line.separator" ));
            }
            writer.append("-----------------------------------");
            writer.append(System.getProperty( "line.separator" ));
            writer.append("Grand Total = " + orderTotal);
            writer.append(System.getProperty( "line.separator" ));
            writer.append(System.getProperty( "line.separator" ));
            writer.append(System.getProperty( "line.separator" ));
            writer.append("************************************");
            writer.append(System.getProperty( "line.separator" ));
            writer.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            writer.close();
        }
    }
    public void printCurrentOrder()throws Exception{
        File file = new File("currentOrder.txt");
        FileWriter writer = null;
        try{
            writer = new FileWriter("currentOrder.txt");
            writer.write(System.getProperty( "line.separator" ));
            writer.write("************************************");
            writer.write(System.getProperty( "line.separator" ));
            writer.write(System.getProperty( "line.separator" ));
            writer.write("-----------------------------------");
            writer.write(System.getProperty( "line.separator" ));
            writer.write("Name: " + customerName + "     Contact: " + customerContact);
            writer.write(System.getProperty( "line.separator" ));
            writer.write("Order completed by: " + employeeName);
            writer.write(System.getProperty( "line.separator" ));
            writer.write("-----------------------------------");
            writer.write(System.getProperty( "line.separator" ));
            writer.write("Item            Quantity   Price   ");
            writer.write(System.getProperty( "line.separator" ));
            for (int i = 0; i < productNames.size(); i++) {
                writer.write(productNames.get(i) + "  " + productQuantity.get(i) + "  " + productPrice.get(i));
                writer.write(System.getProperty( "line.separator" ));
            }
            writer.write("-----------------------------------");
            writer.write(System.getProperty( "line.separator" ));
            writer.write("Grand Total = " + orderTotal);
            writer.write(System.getProperty( "line.separator" ));
            writer.write(System.getProperty( "line.separator" ));
            writer.write(System.getProperty( "line.separator" ));
            writer.write("************************************");
            writer.write(System.getProperty( "line.separator" ));
            writer.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            writer.close();
        }
    }
}
