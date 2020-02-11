package pages.Andrea;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BasicKnowledge {

}

    /*private String name;
    private int age;
    public static void main(String [] args) {





    }

    public void setName(String name){
        if(name ==null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}*/




/**
 * HF Java DotCom game practice
 */
     /*   Game game = new Game();
        String [] myShip = {"1", "6", "8"};
        game.setShip(myShip);

        String userGuess = "1";
        game.CheckResult(userGuess);*/

        /* Random() class
     int max = 100;
     int min = 10;

     double num1 = Math.random() * (max - min) + min;
     int num1Int = (int)num1;

     Random r = new Random();
     int num2 = r.nextInt(4) + 1;

     System.out.println(num1Int);
     System.out.println(num2);*/

    /*}

    public static class GameHelper{

        public String getUserInput(String prompt){
            String inputLine = "null";
            System.out.println(prompt + " ");
            try{
                BufferedReader is = new BufferedReader(
                        new InputStreamReader(System.in));

                inputLine = is.readLine();
                if(inputLine.length()==0)
                    return null;
            }catch (IOException e){
                System.out.println("IOException: " + e);
            }
            return inputLine;
        }
    }

    public static class Game{

        private String [] locationShip;
        private int numOfHits = 0;

        public void setShip(String [] ship){

            locationShip = ship;
        }

        public String CheckResult(String userGuess){

            String result = "miss";
            for (String i: locationShip){
                if(i==userGuess){
                    result = "hit";
                    numOfHits++;
                }
            }

            if(numOfHits==locationShip.length){
                    result = "kill";
                }
             System.out.println(result);
            return result;
        }*/

