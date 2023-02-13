package com.example.mvp;

import com.example.mvp.util.Config;
import com.example.mvp.util.DataBase;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(new File("src/main/java/com/example/mvp/gui/MainForm.fxml").toURL());
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(Config.appName);
        stage.getIcons().add(new Image(getClass().getResource(Config.appIconPath).openStream()));
        stage.setScene(scene);
        stage.show();
        DataBase.initialize();
    }

    public static void main(String[] args) {
        launch();
    }
}