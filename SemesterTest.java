import java.util.Scanner;
public class SemesterTest{
	public static void main(String[]args){
		Start Start1;
		FloorOne Search1, random;
		//FloorTwo;
		//FloorThre;
		Scanner input=new Scanner(System.in);
		int play=1, choice=0;
		int D1=1, D2=2, D3=3, D4=5, D5=5, D6=6, D7=7, D8=8, D9=9, D10=10;
		 roomEnter=1, upORdown=1;
		int x=1, y=1, door=1, randomINF1=1, randomINF2=1, randndomINF3=1;
		int invCloth=0, invString=0;
		
		System.out.println("WELCOME TO THE CRAZY HOSPITAL!!!");
		System.out.println("Created by: Justin Schneider");
		System.out.print("Would you like to start? [yes=1, no=0]: ");
		play=input.nextInt();
		if(play==1){
			playing=true;
			Start out=new Start();
			out.Start1();
			while(playing==true){
				while(floor==3){
					System.out.println();
					System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
					choice=input.nextInt();
					while(choice>=0){
						if(choice==0){
							 System.exit(0);
						}
						else if(choice==1){
							System.out.println("You are on the eighth floor and you chose to jump out the window!");
								for(int delay1=0; delay1<delay; delay1++){
									try{
										Thread.sleep(279);
									}
									catch (InterruptedException ie){
									ie.printStackTrace();
									}
									System.out.println(".");
								}
								System.out.println("GAME OVER!");
								choice=0;
								floor=0;
								playing=false;
								play=0;
							}
						else if(choice==2){
							System.out.println();
							System.out.println("You have exited the room and see 10 doors [1-10]");
							System.out.print("What door would you like to try: ");
							door=input.nextInt();
							room=door;
							if(door>0||door<11){
								if(Stairs=true&&door==10){
									while(x==y){
										System.out.print("Would you like to go up or down? [1=up, 2=down, 3=back]: ");
										upORdown=input.nextInt();
										if(upORdown==1){
											if(parachute==true){
												System.out.println("You made it to the roof!");
												System.out.println("CONGRATULATIONS, YOU WIN!");
												choice=0;
												floor=0;
												playing=false;
												play=0;
												x=0;
											}
											else{
												System.out.println("You need a parachute to leave!");
											}
										}
										else if(upORdown==2){
											System.out.println("You go down a floor");
											choice=0;
											floor=2;
											x=0;
										}
									}
								}
								else if(Stairs=false&&door==10){
									System.out.println("You find a locked door!");
								}
								else{
									roomEnter=room;
									choice=-1;
								}
							}
							else
								System.out.println("That is not a valid door!");
						}
						else if(choice==3){
							System.out.println();
							FloorOne item=new FloorOne(room, invCloth, Stairs);
							randomINF1=0;
							choice=-1;
						}
						else{
							System.out.println();
							System.out.println("Sorry but that isn't an option.");
							System.out.println();
							System.out.print("You have 3 options, Jump out the window (1), Leave the room (2), or search the room (3). ENTER 0 to quit: ");
							choice=input.nextInt();
						}
					}
				}
			}
		}
	}
}