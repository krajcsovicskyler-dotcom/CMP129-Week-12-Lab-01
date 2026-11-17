import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.GridPane;

public class CalculatorApp extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TextField display = new TextField();
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);
        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button four = new Button("4");
        Button five = new Button("5");
        Button six = new Button("6");
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9");
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply = new Button("X");
        Button divide = new Button("/");


        GridPane grind = new GridPane();
        primaryStage.setTitle("Calculator App");
        Scene scene = new Scene(300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
