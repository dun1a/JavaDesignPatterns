package Assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        // creating mediator instance
        Mediator mediator = new Mediator();

        ClientController c1 = createClientWindow("Client 1", mediator);
        ClientController c2 = createClientWindow("Client 2", mediator);
        ClientController c3 = createClientWindow("Client 3", mediator);

        mediator.registerClient(c1);
        mediator.registerClient(c2);
        mediator.registerClient(c3);

        c1.chooseClient();
        c2.chooseClient();
        c3.chooseClient();

    }

    private ClientController createClientWindow(String username, Mediator mediator) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/chat.fxml"));
        Parent root = fxmlLoader.load();

        ClientController controller = fxmlLoader.getController();
        controller.setUserName(username);
        mediator.registerClient(controller); // registers client

        controller.setMediator(mediator); // sets mediator for client

        Stage stage = new Stage();
        stage.setTitle(username);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        return controller;
    }


}
