/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgameprofx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author top1st
 */
public class GenAnswer extends Application {

    public GenAnswer() {
        
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        
        GameData gameData = GameData.getInstance();
        
        
        Label true_answer = new Label("THE ANSWER IS HERE");
        true_answer.setTranslateX(-10);
        true_answer.setTranslateY(-50);
        
        Label trueValue = new Label(gameData.getTrueAnswer());
        trueValue.setFont(new Font(30));
        trueValue.setTranslateX(0);
        trueValue.setTranslateY(10);
        
        btn.setText("RECODE THE GRADES");
        btn.setTranslateX(70);
        btn.setTranslateY(70);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                RecordGrades recordGrades = new RecordGrades();
                recordGrades.start(primaryStage);
                
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().addAll(btn, trueValue, true_answer);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Page8 true Answer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
