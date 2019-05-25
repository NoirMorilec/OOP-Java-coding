package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.concurrent.ThreadLocalRandom;

public class Controller {

    private int counter = 3;
    int number = ThreadLocalRandom.current().nextInt(0, 21);

    @FXML
    private Button button_guess;

    @FXML
    private TextField text_input;

    @FXML
    public void initialize(){

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Результат программы:");

        button_guess.setOnAction(event -> {
            if (Integer.parseInt(text_input.getText()) != 0){
                counter--;
                int new_input = Integer.valueOf(text_input.getText());
                if (new_input == number){
                    alert.setContentText("Вы выиграли!");
                    alert.show();
                    button_guess.setDisable(true);
                } else if (counter > 0)
                {
                    if (new_input > number)
                    {
                        alert.setContentText("Неверно! Задуманное число меньше введенного!");
                        alert.show();
                    }
                    else
                    {
                        alert.setContentText("Неверно! Задуманное число больше введенного!");
                        alert.show();
                    }
                }  else {
                    alert.setContentText("Неверно! Достигнуто максимальное число попыток.\nПравильный ответ: "+number);
                    alert.show();
                    button_guess.setDisable(true);
                }
            }
        });
    }

}
