package resta;

public class Menu{
	   private Item item;
	   private int quantity;
	   
	   public Menu(Item item,int quantity){
	       this.item = item;
	       this.quantity = quantity;
	    }
	    public Item getItem(){
	        return item;
	    }
	    
	    public int getQuantity(){
	        return quantity;
	    }
	    
	    
	    public double getTotalPrice(){
	        double subT = item.getPrice() * getQuantity();
	        return subT;
	    }
	    
	    public String toString(){
	        return getItem() +"\t\t" + getQuantity() + "\t"+getTotalPrice();
	       
	       }
	}


