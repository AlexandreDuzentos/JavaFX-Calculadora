package gui;




import gui.util.Alerts;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController  {


 Double data = 0.0;
 Double ans=0.0;
    int operation = 0;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button mult;

    @FXML
    private Button one;

    @FXML
    private TextField display;


    @FXML
    private Button seven;


    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button div;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    private Button clear;
    
    @FXML
    private Button restdiv;
    @FXML
    private Button sen;
    @FXML
    private Button cos;
    
    
    @FXML
    public void handleButtonAction(ActionEvent event) {
    	try {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == plus) {
        	  data = Double.parseDouble(display.getText());  
        	  display.setText("+");
        	  operation = 1; //Addition
        } else if (event.getSource() == minus) {
        	data = Double.parseDouble(display.getText());
        	display.setText("");
            operation = 2; //Substraction   
        } else if (event.getSource() == mult) {
        	 data = Double.parseDouble(display.getText());
             display.setText("");
             operation = 3; //Mul
        } else if (event.getSource() == div) {
        	data = Double.parseDouble(display.getText());
            display.setText("");
            operation = 4; //Division
        } else if(event.getSource() == clear) {
        	display.setText("");	
        } else if(event.getSource() == restdiv){
        	data=Double.parseDouble(display.getText());
        	display.setText("");
        	operation=5;
        }else if (event.getSource() == equals) {
            Double secondOperand = Double.parseDouble(display.getText());
            if(operation == 1) {
            	ans=data + secondOperand;
            	display.setText(String.valueOf(ans));
            }else if(operation == 2) {
            	ans=data - secondOperand;
            	display.setText(String.valueOf(ans));
            }else if(operation == 3) {
            	ans=data * secondOperand;
            	display.setText(String.valueOf(ans));
            }else if(operation == 4) {
            	ans = data / secondOperand;
            	display.setText(String.valueOf(ans));
            }else if(operation == 5){
               ans = data % secondOperand;
              display.setText(String.valueOf(ans));
              
            /*
            switch (operation) {
                case 1: //Addition
                     ans = data - secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 2: //Subtraction
                     ans = data - secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 3: //Mul
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 4: //Div
                    ans = data / secondOperand;
                    display.setText(String.valueOf(ans));
                    break;      
                case 5: //divrest
                	 ans=data % secondOperand;
                	display.setText(String.valueOf(ans));
                	break;
            }
            */
            }
        }
    }
  catch(NumberFormatException e) {
	  Alerts.showAlert("Error", "parse error", e.getMessage(), AlertType.ERROR);
	  }
  }
    /*
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constraints.setTextFieldDouble(display);
		Constraints.setTextFieldInteger(display);
		Constraints.setTextFieldMaxLength(display,500);	
	}
	*/




}
	
	

