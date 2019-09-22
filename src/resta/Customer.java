package resta;

import java.util.ArrayList;
public class Customer extends Person {
	private String phoneNo;
	private Address address;
	private ArrayList<Menu> menu;
	
	public Customer (){
	menu = new ArrayList<Menu>();
	}
	public Customer (String firstName, String lastName,String phoneNo, Address address ){
	      
		super(firstName, lastName);	
		this.phoneNo = phoneNo;
		this.address = address;
		
	}
	public String getPhoneNo(){
		return phoneNo;
	}
	public Address getAddress(){
		return address;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}
	public void setAddress(Address address){
		this.address = address;
	}
	   //Adding item to customer's order using ArrayList
    public void add (Item item, int Quantity){
        Menu M = new Menu (item,Quantity);
        menu.add(M);
    }
       
        //Calculating sub total (adding total price of each item ordered)
    public double getSubTotal(){
        double totaldue = 0;
        for (Menu i : menu){
            totaldue+= i.getTotalPrice();
        }
        return totaldue;
    }
    //caculate tax
    public double getTax(){
	        
	        return getSubTotal()*0.06;
	       }
    //Total amount due (tax + sub total)
    public double getTotal(){
        return getSubTotal() + getTax();
    }
    
	
	public String toString(){
		String n = "Customer details\n" + super.toString() + "\nPhone No: " +phoneNo + "\n" +address
        +"\nName\t\tPrice\t\tQty\tTotal\n";
               for (Menu i : menu){
                   n = n+i.toString() +"\n";
                }
                n = n+String.format("\nSub total: RM%.2f\nTax: RM%.2f\nTotal Amount Due: RM%.2f",getSubTotal()
                ,getTax(),getTotal());
                return n;
	}

}