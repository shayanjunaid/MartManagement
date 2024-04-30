package Main;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Products {
    private String productName;
    private String productManufacturer;
    private String productCompany;
    private int inStock;
    private int productId;
    private int price;
    private String type;
    private int unitsSold;
    public static ArrayList<String> nameList = new ArrayList();
    public static ArrayList<Integer> inStockList = new ArrayList();
    public static ArrayList<Integer> priceList = new ArrayList();
    public static ArrayList<String> typeList = new ArrayList();
    
    EstablishConnection con = new EstablishConnection();
    Connection con_obj = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet res = null;

    public Products(String productName, String productManufacturer, String productCompany, int inStock, int productId, int price, String type) {
        con_obj = con.EstablishConnection();
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        this.productCompany = productCompany;
        this.inStock = inStock;
        this.productId = productId;
        this.price = price;
        this.type = type;
    }
    
    public Products(){
        con_obj = con.EstablishConnection();
        this.productName = null;
        this.productManufacturer = null;
        this.productCompany = null;
        this.inStock = 0;
        this.productId = 0;
        this.price = 0;
        this.type = null;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public int getInStock() {
        return inStock;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public boolean addProduct(int prodid, String prodname, String prodtype, String prodcompany, String prodmanuf, int prodstock, int prodprice){
        String add = "insert into productDB(productName,manufacturer,brand,price,inStock,type,productId,unitsSold) values ('"+prodname+"','"+prodmanuf+"','"+prodcompany+"','"+prodprice+"','"+prodstock+"','"+prodtype+"','"+prodid+"','"+0+"')";
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
    
    public boolean remProd(String prodname, int prodid){
        String remove = "delete from productDB where productName = '"+prodname+"' and productId = '"+prodid+"'";
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
    public void changeProductPrice(String prodname, int prodid, int newprodprice){
        String update = "update productDB SET price = '"+newprodprice+"' where productName = '"+prodname+"' and productId = '"+prodid+"'";
        try{
            pstmt = con_obj.prepareStatement(update);
            pstmt.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void changeProductStock(String prodname, int prodid, int newprodstock){
        String fetch = "select * from productDB where productName = '"+prodname+"' and productId = '"+prodid+"'";
        String update = "update productDB SET inStock = '"+newprodstock+"' where productName = '"+prodname+"' and productId = '"+prodid+"'";
        int currentStock = 0;
        int price = 0;
        try{
            pstmt = con_obj.prepareStatement(fetch);
            res = pstmt.executeQuery();
            while(res.next()){
            currentStock = Integer.parseInt(res.getString("inStock"));
            price = Integer.parseInt(res.getString("price"));
            }
            if (currentStock < newprodstock) {
                int outflow = (newprodstock-currentStock)*price;
                Finances f = new Finances();
                f.updateoutflow(outflow);
            }
            res = null;
            pstmt = con_obj.prepareStatement(update);
            pstmt.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void loadProducts(){
        String fetch = "select * from productDB";
        try{
            pstmt = con_obj.prepareStatement(fetch);
            res = pstmt.executeQuery();
            while(res.next()){
                nameList.add(res.getString("productName"));
                inStockList.add(Integer.parseInt(res.getString("inStock")));
                priceList.add(Integer.parseInt(res.getString("Price")));
                typeList.add(res.getString("type"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void loadNameFilter(String prodName){
        String fetch = "select * from productDB where productName = '"+prodName+"'";
        try{
            pstmt = con_obj.prepareStatement(fetch);
            res = pstmt.executeQuery();
            while(res.next()){
                nameList.add(res.getString("productName"));
                inStockList.add(Integer.parseInt(res.getString("inStock")));
                priceList.add(Integer.parseInt(res.getString("Price")));
                typeList.add(res.getString("type"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void updUnitsSold(String prodName, int justsold){
        String fetch = "select * from productDB where productName = '"+prodName+"'";
        try{
            pstmt = con_obj.prepareStatement(fetch);
            res = pstmt.executeQuery();
            int sold = 0;
            while(res.next()){
                sold = Integer.parseInt(res.getString("unitsSold"))+justsold;
            }
            String update = "update productDB SET unitsSold = '"+sold+"' where productName = '"+prodName+"'";
            pstmt = con_obj.prepareStatement(update);
            pstmt.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void updStock(String prodName, int justsold){
        String fetch = "select * from productDB where productName = '"+prodName+"'";
        try{
            pstmt = con_obj.prepareStatement(fetch);
            res = pstmt.executeQuery();
            int sold = 0;
            while(res.next()){
                sold = Integer.parseInt(res.getString("inStock"))-justsold;
            }
            String update = "update productDB SET inStock = '"+sold+"' where productName = '"+prodName+"'";
            pstmt = con_obj.prepareStatement(update);
            pstmt.execute();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public static void clearArrays(){
        nameList.clear();
        priceList.clear();
        inStockList.clear();
        typeList.clear();
    }
}
