package com.example;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;



public class mainController {

    @FXML
    private TextField finishField;

    @FXML
    private TextField placeField;

    @FXML
    ArrayList<Helyek> helyekList = new ArrayList<>();
    int actualHelyek = 0;

    @FXML
    private void initialize() {
      
        System.out.println("műkszik");          
        Solution sol = new Solution();
        helyekList = sol.fileToList();

        for(Helyek helyek: helyekList) {
            System.out.println(helyek.getFinish());            
        }
        showHelyek(0);
    }

    private void showHelyek(int index) {  
        Helyek helyek = helyekList.get(index);      
        this.finishField.setText(helyekList.get(index).getFinish());
        this.placeField.setText(helyek.getPlace().toString());
    }



    @FXML
    void onClickBackButton(ActionEvent event) {
        if(actualHelyek > helyekList.size()-1) {
            return;  
        }
        showHelyek(--actualHelyek);
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        System.exit(0);
        
    }

    @FXML
    void onClickNextButton(ActionEvent event) {
        if (actualHelyek > (helyekList.size()-2)) {
            return;
        }
        showHelyek(++actualHelyek);
    }

}


