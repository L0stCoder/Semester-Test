/**
 * @(#)SemesterTestSec.java
 *
 *
 * @author 
 * @version 1.00 2018/12/20
 */


public class SemesterTestSec{
	private int start, floorNum, roomNum;
	private String Start;
    public SemesterTestSec(int Floor, int Room){
    	floorNum=Floor;
    	roomNum=Room;
    }
    public String Start(){
  		start=(int)(Math.random()*3);
  		if(start==0){
  			System.out.println("You just awoke in a room, you find your self extremly tired.");
  			System.out.println("Once you get your barings you look around to see almost nothing.");
  			System.out.println("After stareing for a bit you can finally see, you choose to look around.");
  		}
  		else if(start==1){
  			System.out.println("You have just woken up in a strange room.");
  			System.out.println("The last thing you remember is going to sleep at your home.");
  			System.out.println("You decited to go look around.");
  		}
  		else{
  			System.out.println("We are starting your journey at an abandon hospital, but as soon as you walk in side");
  			System.out.println("you pass out. As you wake up you can see that you are still in the hospital.");
  			System.out.println("You get up and start to look around.");
  		}
   		return Start;
   	}
}