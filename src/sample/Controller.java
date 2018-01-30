package sample;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;

public class Controller {
    @FXML
    private Text msgText;

    @FXML
    private Text displayText;

    public int secCounter = 0;

    Timer timer = new Timer(); {

        @Override
                public void run(){
            secCounter++;
            displayText.setText("Seconds: " + secCounter);
        }
    };

    @Override
    public void initialize (URL location, ResourceBundle resources) {
        Timer timer = new Timer();
        timer.schedule(task, 1000L, 1000L);

    }


}
