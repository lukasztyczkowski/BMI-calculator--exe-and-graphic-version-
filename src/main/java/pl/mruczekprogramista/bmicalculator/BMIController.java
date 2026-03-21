package pl.mruczekprogramista.bmicalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController {
    @FXML
    private Label bmiValue;
    @FXML
    private TextField wage;

    @FXML
    private TextField height;

    @FXML
    private Label result;
    @FXML
    private void clearFields() {
        wage.clear();
        height.clear();
    }

    @FXML
    protected void calculateBmi() {

        try {
            double w = Double.parseDouble(wage.getText());
            double h = Double.parseDouble(height.getText()) / 100;

            double bmiValue  = w / (h * h);



            String category ="";



            if (bmiValue  < 18.5) {
                category=("Niedowaga ");
            } else if (bmiValue  >= 18.5 && bmiValue  < 25) {
                category=("Waga prawidłowa ");
            } else if (bmiValue  >= 25 && bmiValue  < 29.9) {
                category=("Nadwaga");
            }  else if (bmiValue  >= 30 ) {
                category=("Otyłość");
            }



            
            result.setText(String.format(
                    "BMI: %.2f (%s)",
                    bmiValue,
                    category));
            wage.clear();
            height.clear();








        } catch  (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Niepoprawne dane");
            alert.setContentText("Podaj poprawne liczby");
            alert.showAndWait();
        }



    }





}

