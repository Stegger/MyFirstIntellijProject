package Controllers;

import Models.StringExercises;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class StringExerrciseController {
    public Button btnPushMe;
    public TextField txtInput;
    public TextArea txtOutput;

    private StringExercises stringExercises;

    public StringExerrciseController() {
        this.stringExercises = new StringExercises();
    }

    public void onButtonClicked(ActionEvent actionEvent) {
        String userInput = txtInput.getText();

        String output = stringExercises.getMultipleLines(userInput);

        txtOutput.setText(output);
    }
}
