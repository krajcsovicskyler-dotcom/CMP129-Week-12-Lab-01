import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class CalculatorApp extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TextField display = new TextField("0");
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
        Button equals = new Button("=");
        Button clear = new Button("C");
        Button zero = new Button("0");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(10));
        grid.add(display, 3, 0);
        grid.add(seven, 0, 2);
        grid.add(eight, 1, 2);
        grid.add(nine, 2, 2);
        grid.add(divide, 3, 2);
        grid.add(four, 0, 3);
        grid.add(five, 1, 3);
        grid.add(six, 2, 3);
        grid.add(multiply, 3, 3);
        grid.add(one, 0, 4);
        grid.add(two, 1, 4);
        grid.add(three, 2, 4);
        grid.add(minus, 3, 4);
        grid.add(clear, 0, 5);
        grid.add(zero, 1, 5);
        grid.add(equals, 2, 5);
        grid.add(plus, 3, 5);
        primaryStage.setTitle("Calculator App");
        Scene scene = new Scene(grid, 300, 300); 
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
