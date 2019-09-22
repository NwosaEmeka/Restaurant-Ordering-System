package resta;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

public class Restaurant extends Application {
    
    // make stage, scene, textfield and button global variable to be used in many methods
     Stage thestage;
     Scene firstscene, secondscene;
     
     TextField tfFname = new TextField();
     TextField tfLname = new TextField();
     TextField tfPhone = new TextField();
     TextField tfHouseNo = new TextField();
     TextField tfStreet = new TextField();
     TextField tfCity = new TextField();
     TextField tfState = new TextField();
     TextField tfPostCode = new TextField();
     TextField tfBurger = new TextField();
     TextField tfRice = new TextField();
     TextField tfNasi = new TextField();
     TextField tfLemon = new TextField();
     TextField tfCoke = new TextField();
     TextField tfTehTarik = new TextField();
     TextArea txaReceipt = new TextArea();
     TextField tfSubTotal = new TextField();
     TextField tfTax = new TextField();
     TextField tfTotal= new TextField();
    
     Button btTotal = new Button ("Total");
     Button btReceipt = new Button ("Receipt");
     Button btReset1 = new Button ("Reset");
     Button btReset2 = new Button ("Reset");
     Button btExit1 = new Button ("Exit");
     Button btExit2 = new Button ("Exit");
     Button btReturn = new Button ("Back");
     Button btOrder = new Button ("Order");
     
     
    private String[] menutitle = {"Vegetarian Burger\nRM 5.50", "Chicken Rice\nRM 6.50", "Nasi Lemak\nRM 3.50", 
    	      "Lemon Iced Tea\nRM 2.00", "Coke\nRM 2.50", "Teh Tarik\nRM 2.00"};

    	  // Declare an array of strings for Item descriptions
   private String[] Menudescription = new String[6];

    	  // Declare and create a description pane
   private DescriptionPane descriptionPane = new DescriptionPane();

    	  // Create a combo box for selecting Item
   private ComboBox<String> cbo = new ComboBox<>();
   
   //Create a receipt and customer object
   Receipt r1 = new Receipt();
   Customer C1 = new Customer(); 
   
   //file 
   
   
  @Override 
  // Override the start method in the Application class
  public void start(Stage primaryStage) throws Exception {
	  
	 
      
      thestage = primaryStage;
      
    //Creating first pane for welcome message  
    VBox root2 = new VBox();
    root2.setPadding(new Insets(10));
    root2.setSpacing(5);
    root2.setAlignment(Pos.CENTER);
    root2.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))); 
    Label welcomelabel = new Label ("WELCOME TO RESTAURANT INTERNATIONAL");
    welcomelabel.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    root2.getChildren().add(welcomelabel);
      
    // Create the second pane for customer details 
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(5.5);
    pane.setVgap(5.5);
    pane.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    
 // Place nodes in the pane
    pane.add(new Label("First Name:"), 0, 0);
    pane.add(tfFname, 1, 0);
    pane.add(new Label("Last Name:"), 0, 1); 
    pane.add(tfLname, 1, 1);
    pane.add(new Label("Phone Number:"), 0, 2);
    pane.add(tfPhone, 1, 2);
    pane.add(new Label ("House No:"),0, 3);
    pane.add(tfHouseNo, 1, 3);
    pane.add(new Label ("Street:"),0, 4);
    pane.add(tfStreet, 1, 4);
    pane.add(new Label ("City:"),0, 5);
    pane.add(tfCity,1, 5);
    pane.add(new Label ("State:"),0, 6);
    pane.add(tfState,1 , 6);
    pane.add(new Label ("Post Code:"),0, 7);
    pane.add (tfPostCode,1 , 7); 
    
    //Create third pane for buttons
    HBox hbox = new HBox();
    hbox.setSpacing(30);
    hbox.setAlignment (Pos.CENTER);
    hbox.getChildren().addAll(btOrder,btExit1,btReset1);
    btOrder.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
    btExit1.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    btReset1.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    hbox.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    
    //Adding all panes together
    BorderPane mainpane0 = new BorderPane();
    mainpane0.setTop(root2);
    mainpane0.setCenter(pane);
    mainpane0.setBottom(hbox);
    
    
    
    /**************************************************************************
    Second scene starts here
    
     Creating the header*/
    DropShadow ds = new DropShadow();
    ds.setOffsetY(3.0f);
    ds.setColor(Color.color(0.4f, 0.4f, 0.4f));
    Text t = new Text();
    t.setEffect(ds);
    t.setCache(true);
    t.setX(10.0f);
    t.setY(270.0f);
    t.setFill(Color.BLACK);
    t.setText("INTERNATIONAL RESTAURANT SDN BHD");
    t.setFont(Font.font(null, FontWeight.BOLD, 32));
    
    HBox hbox1 = new HBox();
    hbox1.setAlignment (Pos.CENTER);
    hbox1.getChildren().add(t);
    hbox1.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    
    // Creating the restaurant logo
    
    
    //Setting the header
    
    
    
    
    // Create the pane for calculations to be added in second scene
    HBox hbox2 = new HBox();
    hbox2.setSpacing(30);
    hbox2.setAlignment (Pos.CENTER);
    
    //Adding all button to pane
    hbox2.getChildren().addAll(btTotal,btReceipt,btReset2,btExit2,btReturn);
    btTotal.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    btReceipt.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
    btReset2.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
    btExit2.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
    btReturn.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
    
    hbox2.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    
    
    //Create pane for receipt (second scene)
    VBox root = new VBox();
    root.setPadding(new Insets(10));
    root.setSpacing(5);
    root.setAlignment(Pos.CENTER);
    root.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    Label lbReceipt = new Label ("RECEIPT");
    lbReceipt.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));

    root.getChildren().addAll(lbReceipt,txaReceipt);
    txaReceipt.setEditable(false);
    
    
    // Create pane for menu (second scene)
    GridPane pane1 = new GridPane();
    pane1.setAlignment(Pos.CENTER);
    pane1.setPadding (new Insets(11.5,12.5,13.5,14.5));
    pane1.setHgap (5.5);
    pane1.setVgap(5.5);
    pane1.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    
    Label lbItem = new Label ("ITEM");
    pane1.add(lbItem, 0, 0);
    lbItem.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    Label lbQuantity = new Label("Quantity");
    pane1.add(lbQuantity, 1, 0);
    lbQuantity.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    pane1.add(new Label("Vegetarian Burger:"), 0, 1);
    pane1.add(tfBurger, 1, 1);
    tfBurger.setText("0");
    pane1.add(new Label("Chicken Rice:"), 0, 2); 
    pane1.add(tfRice, 1, 2);
    tfRice.setText("0");
    pane1.add(new Label("Nasi Lemak:"), 0, 3);
    pane1.add(tfNasi, 1, 3);
    tfNasi.setText("0");
    pane1.add(new Label ("Lemon Iced Tea:"),0, 4);
    pane1.add(tfLemon, 1, 4);
    tfLemon.setText("0");
    pane1.add(new Label ("Coke:"),0, 5);
    pane1.add(tfCoke,1, 5);
    tfCoke.setText("0");
    pane1.add(new Label ("Teh Tarik:"),0, 6);
    pane1.add(tfTehTarik,1 , 6);
    tfTehTarik.setText("0");
    
    //Menu label
    VBox root1 = new VBox();
    root1.setPadding(new Insets(10));
    root1.setSpacing(5);
    root1.setAlignment(Pos.CENTER);
    root1.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    Label menulabel = new Label ("MENU");
    menulabel.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    root1.getChildren().add(menulabel);
    
    BorderPane menupane = new BorderPane();
    menupane.setCenter(pane1);
    menupane.setTop(root1);
    
    menupane.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    
   
    //Create pane (second scene) Describing and showing content of the items
   
    Menudescription[0] = "Main ingredients:\nVegetables\ntextured vegetable protein\nlegumes\nnuts\nmushrooms or grains or seeds";
    Menudescription[1] = "Main ingredients:\nChicken\nRice\nChili Dipping Sauce & Ginger Garlic Sauce";
    Menudescription[2] = "Main ingredients:\nRice\nHot chile sauce\nFried anchovies\nFried peanut\nSliced cucumber or Tomato\nHard boiled egg";
    Menudescription[3] = "Main ingredients:\nLemons\nSugar\nFresh mint leaves\nTea bag\nLemon juice";
    Menudescription[4] = "Main Ingredients:\nCarbonated water\nSugar\nCaffeine\nPhosphoric acid\nCaramel color\nNatural flavoring";
    Menudescription[5] = "Main ingredients:\nTea dust\nHot water\nCondensed milk";
    

    // Set the first item (Burger) for display
    setDisplay(0);

    // Add combo box and description pane to the border pane
    BorderPane paneForComboBox = new BorderPane();
    Label label12 = new Label ("Select an Item: ");
    label12.setFont(Font.font("Courier", FontWeight.BOLD,15));
    
    paneForComboBox.setLeft(label12);
    paneForComboBox.setCenter(cbo);
    paneForComboBox.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    descriptionPane.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    cbo.setPrefWidth(200);
    cbo.setValue("Vegetarian Burger\nRM 5:50");
    
    ObservableList<String> items = 
      FXCollections.observableArrayList(menutitle);
    cbo.getItems().addAll(items); 
    
    // Creating pane for subtotal, tax and total
    GridPane gride = new GridPane();
    gride.setAlignment(Pos.CENTER_LEFT);
    gride.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    gride.setHgap(5.5);
    gride.setVgap(5.5);
    gride.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    
    Label lbSub = new Label("Sub Total");
    lbSub.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    Label lbTax = new Label("Tax (6%)");
    lbTax.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    Label lbTotal = new Label ("Total");
    lbTotal.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    
    
    gride.add(lbSub, 0, 0);
    gride.add(tfSubTotal, 1, 0);
    gride.add(lbTax, 0, 1);
    gride.add(tfTax, 1, 1);
    gride.add(lbTotal, 0, 2);
    gride.add(tfTotal, 1, 2);
    
    tfSubTotal.setEditable(false);
    tfTax.setEditable(false);
    tfTotal.setEditable(false);
    
    
    BorderPane pane2 = new BorderPane();
    pane2.setTop(paneForComboBox);
    pane2.setCenter(descriptionPane);
    pane2.setBottom(gride);
    pane2.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    
 // Display the selected item
    cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
    
 
   
    //Creating main pane for the second pane
    BorderPane mainpane = new BorderPane();
    
    mainpane.setBottom(hbox2);
    mainpane.setRight(root);
    mainpane.setLeft(menupane);
    mainpane.setCenter(pane2);
    
    // Setting the button action 
    btReset1.setOnAction(this::reset1btClick);
    btTotal.setOnAction(this::totalbtClick);
    btReceipt.setOnAction(this::receiptbtClick);
    btReset2.setOnAction(this::btReset2Click);
    
    //Using lambda expression
    
    btExit1.setOnAction((e) -> System.exit(0));
    
    btExit2.setOnAction((e) -> System.exit(0));
    
    btReturn.setOnAction((e) -> thestage.setScene(firstscene));
    
    btOrder.setOnAction((e) -> {
    	if (tfFname.getText().isEmpty() ||tfLname.getText().isEmpty()||tfPhone.getText().isEmpty()
    			||tfHouseNo.getText().isEmpty() ||tfCity.getText().isEmpty()||
    			tfState.getText().isEmpty() ||tfPostCode.getText().isEmpty()||tfStreet.getText().isEmpty()){
    		JOptionPane.showMessageDialog(null, "The fields can't be empty");
    	}
    	else	
    	thestage.setScene(secondscene);
    });
    
    
    //Combining both scene
    // Create two scenes and add the primary scene to stage
    firstscene = new Scene(mainpane0, 400,400);
    secondscene = new Scene (mainpane,1200,400);
    
    // How to show the stage
    thestage.setTitle("Restaurant International"); // Set the stage title
    thestage.setScene(firstscene); // Place the scene in the stage
    thestage.show(); // Display the stage
  }
  
 
  public static void main(String[] args) {
    launch(args);
  }
  
  // Method called when button is clicked
  
    //Display SubToal, Tax and Total
    private void totalbtClick(ActionEvent event){
    	
    	try{
    	int qunt1 = Integer.parseInt(tfBurger.getText());
        int qunt2 = Integer.parseInt(tfRice.getText());
        int qunt3 = Integer.parseInt(tfNasi.getText());
        int qunt4 = Integer.parseInt(tfLemon.getText());
        int qunt5 = Integer.parseInt(tfCoke.getText());
        int qunt6 = Integer.parseInt(tfTehTarik.getText());
  
       C1.add(new Item("Veg Burger", 5.50),qunt1);
       C1.add(new Item("Chicken Rice",6.50),qunt2);
       C1.add(new Item("Nasi Lemak", 3.50),qunt3);
       C1.add(new Item("Lemon Tea", 2.00),qunt4);
       C1.add(new Item("Coke          ", 2.00),qunt5);
       C1.add(new Item("Teh Tarik  ",  2.00),qunt6);
        
       tfSubTotal.setText(String.format("RM %.2f",C1.getSubTotal()));
        
       tfTax.setText(String.format("RM %.2f",C1.getTax()));
        
       tfTotal.setText(String.format("RM %.2f",C1.getTotal()));
    	}
    	catch (NumberFormatException ex){
    		JOptionPane.showMessageDialog(null,"Quantity must be an Integer!");
    	}
    	catch (InputMismatchException ex){
    		JOptionPane.showMessageDialog(null,"Quantity must be an Integer!");
    	}
    }
    
    // Display Receipt
    private void receiptbtClick(ActionEvent event)
    {
        //Creat object of address
        String houseNo = new String (tfHouseNo.getText());
        String street = new String (tfStreet.getText());
        String city = new String (tfCity.getText());
        String state = new String (tfState.getText());
        String post = new String(tfPostCode.getText());
        Address A1 = new Address(houseNo,street,city,state,post);
        
        //Creating object of customer
        String fname = new String (tfFname.getText());
        String lname = new String(tfLname.getText());
        String phone = new String (tfPhone.getText());
      
        C1.setFirstName(fname);
        C1.setLastName(lname);
        C1.setPhoneNo(phone);
        C1.setAddress(A1);
        //generate a random receipt number
        Random random = new Random();
        int x = random.nextInt(900) + 100;
       
        //setting the receipt
        r1.setCustomer(C1);
        r1.setReceiptNo(x);
        
        //Display the receipt
        txaReceipt.setText( r1.toString()+"\n\nThanks and Enjoy your meal");
    	
    	//Write into file
    	 
		 try {
			 
	     FileWriter file = new FileWriter("Receipt.txt", true);
		 PrintWriter output = new PrintWriter(new BufferedWriter (file)); 
		 output.println("Date: "+r1.getDateCreated());
		 output.println ("Receipt No: " +r1.getReceiptNo());
		 output.println(C1);
		 output.println("\n");
		 output.close();
		 }
		 catch (IOException ex){
			 JOptionPane.showMessageDialog(null, ex.getMessage());
		 }
    }        
    
    //Reset order
    private void btReset2Click(ActionEvent event)
    {
    	tfBurger.setText("0"); tfRice.setText("0");tfNasi.setText("0");tfLemon.setText("0");tfCoke.setText("0");tfTehTarik.setText("0");
    	tfFname.setText("0"); txaReceipt.setText("");tfSubTotal.setText("");tfTax.setText("");tfTotal.setText("");
    	tfFname.setText(""); tfLname.setText("");tfPhone.setText("");tfHouseNo.setText("");tfCity.setText("");
    	tfState.setText(""); tfPostCode.setText("");tfStreet.setText("");
      
    }
    // Reset Customer details
    private void reset1btClick(ActionEvent event)
    {
    	tfFname.setText(""); tfLname.setText("");tfPhone.setText("");tfHouseNo.setText("");tfCity.setText("");
    	tfState.setText(""); tfPostCode.setText("");tfStreet.setText("");  
    }
    
    
    //Display the Item
    public void setDisplay(int index) {
        descriptionPane.setTitle(menutitle[index]);
        descriptionPane.setDescription(Menudescription[index]);
      }
} 
