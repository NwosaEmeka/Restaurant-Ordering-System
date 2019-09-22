package resta;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

class DescriptionPane extends BorderPane {
	  /** Label for displaying an image and a title */
	  private Label lblTitle = new Label();

	  /** Text area for displaying text */
	  private TextArea taDescription = new TextArea();
	  
	  public DescriptionPane() {
	    
	    lblTitle.setPrefSize(200,  100);
	    
	    // Set the font in the label and the text field
	    lblTitle.setFont(new Font("SansSerif", 16));
	    taDescription.setFont(new Font("Serif", 14));
	    
	    taDescription.setWrapText(true);
	    taDescription.setEditable(false);

	    // Create a scroll pane to hold the text area
	    ScrollPane scrollPane = new ScrollPane(taDescription);

	    // Place label and scroll pane in the border pane
	    setLeft(lblTitle);
	    setCenter(scrollPane);
	    setPadding(new Insets(5, 5, 5, 5));
	  }
	  
	  /** Set the title */
	  public void setTitle(String title) {
	    lblTitle.setText(title);
	  }

	  
	  /** Set the text description */
	  public void setDescription(String text) {
	    taDescription.setText(text);
	  }
	}
