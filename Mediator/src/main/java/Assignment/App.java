package Assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.MouseWheelEvent;
import java.io.IOException;

public class App extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Mediator mediator = new Mediator();

        createClientWindow("Client 1", mediator);
        createClientWindow("Client 2", mediator);
        createClientWindow("Client 3", mediator);

    }

    private void createClientWindow(String username, Mediator mediator) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/chat.fxml"));
        Parent root = fxmlLoader.load();
        ClientController controller = fxmlLoader.getController();
        controller.setUserName(username);
        controller.setMediator(mediator);

        mediator.registerClient(controller);
        Stage stage = new Stage();
        stage.setTitle(username);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
