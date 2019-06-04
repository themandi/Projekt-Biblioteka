import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent fxml = FXMLLoader.load(getClass().getResource("app.fxml"));

        Scene scene = new Scene(fxml);

        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("background.jpg"));
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        primaryStage.show();



    }




    public static void main(String... args){
        launch(args);

    }
}