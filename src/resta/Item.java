package resta;

public class Item implements Itemformat {
    private String name;
    private double price;
    
    public Item (){
    }
    public Item (String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        return  getName() + "\t " + getPrice();
    }
}

