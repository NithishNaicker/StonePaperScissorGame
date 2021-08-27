package com.company;
import java.util.Scanner;
import java.lang.*;
import java.util.Random;

public class StonePaperScissor {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        Random rand = new Random();

        while(true) {
            System.out.println("******************************** STONE PAPER SCISSOR ******************************");
            System.out.print("\n");
            System.out.println("1) PLAY");
            System.out.println("2) INSTRUCTIONS");
            System.out.println("3) EXIT");
            int option;
            System.out.print("Enter your choice:");

            option = scn.nextInt();
            System.out.print("\n");
            switch (option) {
                case 1:
                    System.out.println("_____________________________________GAME PLAY_____________________________________");
                    System.out.print("\n");
                    System.out.println("NOTE: Type the spelling correctly <*> CHECK HERE-->(stone or paper or scissor)");
                    System.out.print("\n");
                    System.out.print("Enter your object:");
                    int compOption;

                    String humanoption = scn.next();

                    System.out.print("\n");

                    compOption = rand.nextInt(2);

                    //IF RANDOM NUMBER GENERATED IS 0

                    if (0==compOption)
                    {
                        String object="stone";


                        if(humanoption.equals(object))
                        {
                            System.out.println("COMPUTER:"+object+"        YOU:"+humanoption);
                            System.out.print("\n");
                            System.out.println("------MATCH TIE------");
                        }
                        else if(humanoption.equals("paper"))
                        {
                            System.out.println("COMPUTER:"+object+"        YOU:"+humanoption);
                            System.out.print("\n");
                            System.out.println("######  YOU WIN  #####");
                        }
                        else if(humanoption.equals("scissor")) {
                            System.out.println("COMPUTER:" + object + "    YOU:" + humanoption);
                            System.out.print("\n");
                            System.out.println("......  YOU LOST ......");
                        }
                    }

                    //IF RANDOM NUMBER GENERATED IS 1

                    else if (1==compOption)
                    {
                        String object="paper";


                        if(humanoption.equals(object))
                        {
                            System.out.println("COMPUTER:"+object+"        YOU:"+humanoption);
                            System.out.print("\n");
                            System.out.println("------MATCH TIE------");
                        }
                        else if(humanoption.equals("scissor"))
                        {
                            System.out.println("COMPUTER:"+object+"        YOU:"+humanoption);
                            System.out.print("\n");
                            System.out.println("######  YOU WIN  #####");
                        }
                        else if(humanoption.equals("stone")) {
                            System.out.println("COMPUTER:" + object + "    YOU:" + humanoption);
                            System.out.print("\n");
                            System.out.println("......  YOU LOST ......");
                        }
                    }

                    //IF RANDOM NUMBER GENERATED IS 2

                    else if (2==compOption)
                    {
                        String object="scissor";


                        if(humanoption.equals(object))
                        {
                            System.out.println("COMPUTER:"+object+"        YOU:"+humanoption);
                            System.out.print("\n");
                            System.out.println("------MATCH TIE------");
                        }
                        else if(humanoption.equals("stone"))
                        {
                            System.out.println("COMPUTER:"+object+"        YOU:"+humanoption);
                            System.out.print("\n");
                            System.out.println("######  YOU WIN  #####");
                        }
                        else if(humanoption.equals("paper")) {
                            System.out.println("COMPUTER:" + object + "    YOU:" + humanoption);
                            System.out.print("\n");
                            System.out.println("......  YOU LOST ......");
                        }
                    }

                    System.out.print("\n");
                    break;
                case 2:
                    System.out.println("STONE PAPER SCISSOR INSTRUCTIONS");
                    System.out.print("\n");
                    System.out.println("* Enter any option of your choice between stone ,paper and scissor");
                    System.out.println("* The computer will be your opponent in the game");
                    System.out.println("* The computer will come up with its option");
                    System.out.println("* As per rules of the game if computer comes with stone and you have scissor \n  then computer will win");
                    System.out.println("* If you select option paper and computer comes up with stone then you win");
                    System.out.println("* stone will win over scissor but lose over paper,paper will win over stone  \n  lose with scissor and scissor will win over paper but will lose with stone");
                    System.out.print("\n");
                    break;
                case 3:
                    System.exit(0);

                    break;
            }

        }


    }
}
