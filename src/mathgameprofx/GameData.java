/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgameprofx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author top1st
 */
public class GameData {

    int levelnum;
    int skillnum;
    int firstnum;
    int secondnum;
    int questionnum;
    String[] symbolnames = new String[5];
    int[] recordSet;
    
    private GameData() {
        this.recordSet = new int[5];
        firstnum = 1;
        secondnum = 1;
        levelnum = 1;
        skillnum = 0;
        questionnum = 0;
        symbolnames[0] = "Iron";
        symbolnames[1] = "Car";
        symbolnames[2] = "Pawn";
        symbolnames[3] = "Box";
        symbolnames[4] = "House";
        recordSet[0] = 0;
        recordSet[1] = 0;
        recordSet[2] = 0;
        recordSet[3] = 0;
        recordSet[4] = 0;
    }
    
    private static class SingletonHolder{
        private static final GameData INSTANCE = new GameData();
    }
    public static GameData getInstance(){
        return SingletonHolder.INSTANCE;
    }
    public String getTrueAnswer(){
        String trueanswer = "";
        switch(levelnum){
            case 1:
                switch(skillnum){
//                    add 35 to the two appear on dice
                    
                    case 0:
                        switch(questionnum){
                            case 0:
                                trueanswer = Integer.toString(35 + firstnum + secondnum);
                                break;
                            case 1:
//                        add 8 + 9 + colored dice
                                trueanswer = Integer.toString(8 + 9 + firstnum);
                                break;
                            case 2:
//                        add 40 + colored dice
                                trueanswer = Integer.toString(40 + firstnum);
                                break;
                            case 3:
                                trueanswer = Integer.toString(10 * firstnum + 4);
                                break;
                            case 4:
                                trueanswer = Integer.toString(9 + firstnum);
                                break;
                            case 5:
                                trueanswer = Integer.toString(15 + firstnum);
                                break;
                            case 6:
                                trueanswer = Integer.toString(30 + firstnum + secondnum);
                                break;
                            case 7:
                                trueanswer = Integer.toString(4 + 12 + firstnum);
                                break;
                            case 8:
                                trueanswer = Integer.toString(23 + firstnum + secondnum);
                                break;
                            case 9:
                                trueanswer = Integer.toString(64 + firstnum + secondnum);
                                break;
                            case 10:
                                trueanswer = Integer.toString(16 + firstnum);
                                break;
                            case 11:
                                trueanswer = Integer.toString(50 + firstnum);
                                break;
                            case 12:
                                trueanswer = Integer.toString(4 + firstnum);
                                break;
                        }
                        break;
                        
                    case 1:
                        break;
                    case 2:
                        break;
                }
                break;
                
//                Subtracting Whole Numbers
            case 2:
                switch(skillnum){
                    case 0:
                        trueanswer = Integer.toString(26 - firstnum);
                        break;
                    case 1:
                        trueanswer = Integer.toString(19 - firstnum);
                        break;
                    case 2:
                        trueanswer = Integer.toString(19 - firstnum);
                        break;
                    case 3:
                        trueanswer = Integer.toString(69 - firstnum - secondnum);
                        break;
                    case 4:
                        trueanswer = Integer.toString(18 - firstnum);
                        break;
                    case 5:
                        trueanswer = Integer.toString(12 - firstnum);
                        break;
                    case 6:
                        trueanswer = Integer.toString(2 + firstnum);
                        break;
                }
                break;
            case 3:
                switch(skillnum){
                    case 0:
                        
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                }
                break;
            case 4:
                switch(skillnum){
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                }
                break;
                
                        
        }
        return trueanswer;
    }
    
}
