/**
 * @(#)SemesterTest.java
 *
 *
 * @author 
 * @version 1.00 2018/12/20
 */

import java.util.Scanner;
public class SemesterTest{
    public static void main(String[]args){
    	SemesterTestSec Start;// Room, Floor, Item, INV;
    	Scanner input=new Scanner(System.in);
    	int play=1, choice=0;
    	int D1=1, D2=2, D3=3, D4=5, D5=5, D6=6, D7=7, D8=8, D9=9, D10=10;
		int Floor=3, Room=1, delay=8;
	//	boolean Stairs=false;
		System.out.println("WELCOME TO THE CRAZY HOSPITAL!!!");
		System.out.println("Created by: Justin Schneider");
		System.out.print("Would you like to start? [yes=1, no=0]: ");
		play=input.nextInt();
		if(play==1){
			SemesterTestSec out=new SemesterTestSec(Floor, Room);
			out.Start();
			System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
			choice=input.nextInt();
			while(choice!=0){
				if(choice==1){
					System.out.println("You are on the eight floor and you chose to jump out the window!");
					for(int delay1=0; delay1<delay; delay1++){
    					try{
    						Thread.sleep(279);
    					}
    					catch (InterruptedException ie){
        	        		ie.printStackTrace();
        	    		}
    					System.out.println(".");
    				}
    				System.out.println("SPLAT!");
    				choice=0;
				}
				else if(choice==2){
					System.out.println("You have exited the room and see 10 doors [1-10]");
					System.out.print("What door would you like to try: ");
					int door=input.nextInt();
					if(door>0||door<11)
						if(door=1)
							System.out.println("You find a locked door!");
						else{
							System.out.println("The door is unlocked and you walk inside");
							System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
							choice=input.nextInt();
						}
						
					else
						System.out.println("That is not a valid door!");
				}
				else if(choice==3){
				}
				else{
					System.out.println("Sorry but that isn't an option.");
					System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
					choice=input.nextInt();
				}
			}
		}
    }
}