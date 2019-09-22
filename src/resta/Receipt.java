package resta;

public class Receipt {
    private int receiptNo;
    private Customer customer;
    private java.util.Date dateCreated;
    
    public Receipt(){   
        dateCreated = new java.util.Date();
    }
    
    public Customer getCustomer(){
        return customer;
    }
    public int getReceiptNo(){
        return receiptNo;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public void setReceiptNo(int receiptNo){
        this.receiptNo = receiptNo;
    }
    public java.util.Date getDateCreated() {  
        return dateCreated;     
    } 
    
    public String toString(){
       return "Date:" + getDateCreated() +"\nReceipt No: " + getReceiptNo() +"\n"+ customer.toString();
        
    }

}