package Example.view;


import Example.model.UserData;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class GUI extends Application {

    private UserData userData = new UserData();

    @Override
    public void start(Stage primaryStage) throws Exception {
        // opens windows simultaneously
        openWindow("Window 1");
        openWindow("Window 2");
        openWindow("Window 3");
    }

    public void openWindow(String windowName) {
        Stage stage = new Stage();
        stage.setTitle(windowName);

        CheckBox checkBox = new ObservingCheckBox("Toggle me", userData);

        checkBox.setOnAction(event -> {
            System.out.println(windowName + " - Checkbox state: " + checkBox.isSelected());
            userData.setSelected(checkBox.isSelected());
        });

        VBox root = new VBox(checkBox);
        Scene scene = new Scene(root, 200, 100);
        stage.setScene(scene);
        stage.show();

        }


}
