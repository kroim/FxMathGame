/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgameprofx;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author top1st
 */
public class RecordGrades extends Application {
    
    List<CheckBox> checkBoxList = new ArrayList<>();
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("SEE SCORES");
        btn.setTranslateX(90);
        btn.setTranslateY(70);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                GameData gameData = GameData.getInstance();
                System.out.println("Hello World!");
                for(int i = 0; i < 5; i++){
                    if (checkBoxList.get(i).isSelected()) {
                       gameData.recordSet[i]++;
                    }    
                }
                RecordAnswers recordAnswers = new RecordAnswers();
                recordAnswers.start(primaryStage);
            }
        });
        
        List<Node> childList = new ArrayList<>();
        childList.add(btn);
        Label sbLabel = new Label("SYMBOL");
        sbLabel.setTranslateX(-50);
        sbLabel.setTranslateY(-90);
        childList.add(sbLabel);
        
        Label coLabel = new Label("CORRECT");
        coLabel.setTranslateX(30);
        coLabel.setTranslateY(-90);
        childList.add(coLabel);
        
        
        
        for(int i = 0; i < 5; i++) {
            CheckBox selectbox = new CheckBox();
            Label symbolLabel = new Label(GameData.getInstance().symbolnames[i]);
            selectbox.setTranslateX(30);
            selectbox.setTranslateY(i * 30 - 60);
            childList.add(selectbox);
            checkBoxList.add(selectbox);
            
            symbolLabel.setTranslateX(-50);
            symbolLabel.setTranslateY(i * 30 - 60);
            childList.add(symbolLabel);
        }

        
        
        StackPane root = new StackPane();
        root.getChildren().addAll(childList);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Check Correct answers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
