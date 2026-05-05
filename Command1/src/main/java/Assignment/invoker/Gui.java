package Assignment.invoker;

// is the invoker class
// triggers command execution based on user input
//
import Assignment.commands.*;
import Assignment.receiver.Pixel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Gui extends Application {

    private Pixel pixel = new Pixel();
    private Rectangle[][] rectangles = new Rectangle[8][8];

    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();

        // Create grid
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rect = new Rectangle(40, 40);
                rect.setStroke(Color.BLACK);
                rectangles[i][j] = rect;
                gridPane.add(rect, j, i);
            }
        }

        Button generateBtn = new Button("Create Code");

        // creating commands
        Command up = new MoveUpCommand(pixel);
        Command down = new MoveDownCommand(pixel);
        Command left = new MoveLeftCommand(pixel);
        Command right = new MoveRightCommand(pixel);
        Command toggle = new DrawCommand(pixel);
        Command generate = new GenerateCommand(pixel);

        generateBtn.setOnAction(e -> generate.execute());

        VBox root = new VBox(gridPane, generateBtn);
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) up.execute();
            if (e.getCode() == KeyCode.DOWN) down.execute();
            if (e.getCode() == KeyCode.LEFT) left.execute();
            if (e.getCode() == KeyCode.RIGHT) right.execute();
            if (e.getCode() == KeyCode.SPACE) toggle.execute();

            updateView();
        });

        updateView();

        stage.setScene(scene);
        stage.setTitle("Pixel Art Editor");
        stage.show();
    }

    private void updateView() {
        int[][] grid = pixel.getGrid();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (grid[i][j] == 1) {
                    rectangles[i][j].setFill(Color.BLACK);
                } else {
                    rectangles[i][j].setFill(Color.WHITE);
                }

                if (i == pixel.getCursorY() && j == pixel.getCursorX()) {
                    rectangles[i][j].setStroke(Color.RED);
                    rectangles[i][j].setStrokeWidth(3);
                } else {
                    rectangles[i][j].setStroke(Color.BLACK);
                    rectangles[i][j].setStrokeWidth(1);
                }
            }
        }
    }
}
