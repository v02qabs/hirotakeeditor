package hiro.editor;
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextArea;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("HBox Example");

        // ボタンを作成
        Button save_button = new Button("セーブ");
        Button open_button = new Button("オープン");

        Font font = new Font("vl-gochic", 12);
       save_button.setFont(font);
      	open_button.setFont(font);


        // HBoxを作成してボタンを追加
      HBox hbox = new HBox(10); // 10ピクセルのスペースを設定
        hbox.getChildren().addAll(save_button, open_button);

	TextArea area = new TextArea();
	area.setPrefHeight(100);
	area.setFont(font);


	//VBOX を設置
	VBox vbox = new VBox(10);
	vbox.getChildren().addAll(hbox, area);

        // シーンを作成
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);

        // ステージを表示
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
