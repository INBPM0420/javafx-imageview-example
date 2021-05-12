package imageview;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageViewApplication extends Application {

    @Override
    public void start(Stage stage) {
//        Image image = new Image("http://cr.openjdk.java.net/~jeff/Duke/png/Hips.png");
        Image image = new Image(getClass().getResourceAsStream("/Hips.png"));

        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setFitHeight(400);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);

        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        Scene scene = new Scene(root, 400, 600);
        stage.setTitle("ImageView Example");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}
