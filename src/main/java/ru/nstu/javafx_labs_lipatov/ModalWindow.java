package ru.nstu.javafx_labs_lipatov;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ModalWindow {
    @FXML
    private Button btnOk;
    @FXML
    private Button btnCancel;
    @FXML
    private TextArea mainText;
    public Controller parentController;
    public void setText(String stat){
        mainText.setText(stat);
    }

    @FXML
    void btnOkClick(){
        Habitat.getInstance().stopGeneration();
        Stage stage = (Stage)btnOk.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnCancelClick(){
        Habitat.getInstance().unPauseGeneration();
        parentController.getButtonStop().setDisable(false);
        parentController.getButtonStart().setDisable(true);
        Stage stage = (Stage)btnOk.getScene().getWindow();
        stage.close();
    }
}
