import java.util.Scanner;
public class FloorOne{
	private int Door;
	private int item1, item2, item3, item4, item5, item6, item7, item8, item9;
	private int item1INVC=0, item2INVC=0, item3INVC=0, item4INVC=0, item5INVC=0, item6INVC=0, item7INVC=0, item8INVC=0, item9INVC=0;
	private int invCloth;
	public int random;
	private String item1String=" ", item2String=" ", item3String=" ", item4String=" ", item5String=" ", item6String=" ", item7String=" ", item8String=" ", item9String=" ";
	public String Search1;
	public boolean LockedOne=true;
    public FloorOne(int rooms, int Cloth, boolean Locked){
    	Door=rooms;
    	invCloth=Cloth;
    	LockedOne=Locked;
    	Search1();
    }
    public String Search1(){
    	item1=(int)(Math.random()*10);
    	item2=(int)(Math.random()*10);
    	while(item1==item2){
    		item2=(int)(Math.random()*10);
    	}
    	item3=(int)(Math.random()*10);
    	while(item2==item3||item1==item3){
    		item3=(int)(Math.random()*10);
    	}
    	item4=(int)(Math.random()*10);
    	while(item3==item4||item2==item4||item1==item4){
    		item4=(int)(Math.random()*10);
    	}
    	item5=(int)(Math.random()*10);
    	while(item4==item5||item3==item5||item2==item5||item1==item5){
    		item5=(int)(Math.random()*10);
    	}
    	item6=(int)(Math.random()*10);
    	while(item5==item6||item4==item6||item3==item6||item2==item6||item1==item6){
    		item6=(int)(Math.random()*10);
    	}
    	item7=(int)(Math.random()*10);
    	while(item6==item7||item5==item7||item4==item7||item3==item7||item2==item7||item1==item7){
    		item7=(int)(Math.random()*10);
    	}
    	item8=(int)(Math.random()*10);
    	while(item7==item8||item6==item8||item5==item8||item4==item8||item3==item8||item2==item8||item1==item8){
    		item8=(int)(Math.random()*10);
    	}
    	item9=(int)(Math.random()*10);
    	while(item8==item9||item7==item9||item6==item9||item5==item9||item4==item9||item3==item9||item2==item9||item1==item9){
    		item9=(int)(Math.random()*10);
    	}
    	if(item1>=0||item1<=5){
    		item1String="Nothing";
    	}
    	else if(item1>=6&&item1<=7){
    		if(item1INVC==0){
    			item1String="Cloth";
    			invCloth++;
    			item1INVC=1;
    		}
    		else{
    			item1String="Nothing";
    			item1INVC=1;
    		}
    	}
    	else{
    		item1String="Big Button";
    		LockedOne=true;
    	}
    	if(item2>=0&&item2<=4){
    		item2String="Nothing";
    	}
    	else if(item2>=5&&item2<=7){
    		item2String="Cloth";
    		if(item2INVC==0){
    			item2String="Cloth";
    			invCloth++;
    			item2INVC=1;
    		}
    		else{
    			item2String="Nothing";
    			item2INVC=1;
    		}
    	}
    	else{
    		item2String="Big Button";
    		LockedOne=true;
    	}
    	if(item3>=0&&item3<=4){
    		item3String="Nothing";
    	}
    	else if(item3>=5&&item3<=7){
    		item3String="Cloth";
    		if(item3INVC==0){
    			item3String="Cloth";
    			invCloth++;
    			item3INVC=1;
    		}
    		else{
    			item3String="Nothing";
    			item3INVC=1;
    		}
    	}
    	else{
    		item3String="Big Button";
    		LockedOne=true;
    	}
    	if(item4>=0&&item4<=4){
    		item4String="Nothing";
    	}
    	else if(item4>=5&&item4<=7){
    		item4String="Cloth";
    		if(item4INVC==0){
    			item4String="Cloth";
    			invCloth++;
    			item4INVC=1;
    		}
    		else{
    			item4String="Nothing";
    			item4INVC=1;
    		}
    	}
    	else{
    		item4String="Big Button";
    		LockedOne=true;
    	}
    	if(item5>=0&&item5<=4){
    		item5String="Nothing";
    	}
    	else if(item5>=5&&item5<=7){
    		item5String="Cloth";
    		if(item5INVC==0){
    			item5String="Cloth";
    			invCloth++;
    			item5INVC=1;
    		}
    		else{
    			item5String="Nothing";
    			item5INVC=1;
    		}
    	}
    	else{
    		item5String="Big Button";
    		LockedOne=true;
    	}
    	if(item6>=0&&item6<=4){
    		item6String="Nothing";
    	}
    	else if(item6>=5&&item2<=7){
    		item6String="Cloth";
    		if(item6INVC==0){
    			item6String="Cloth";
    			invCloth++;
    			item6INVC=1;
    		}
    		else{
    			item6String="Nothing";
    			item6INVC=1;
    		}
    	}
    	else{
    		item6String="Big Button";
    		LockedOne=true;
    	}
    	if(item7>=0&&item7<=4){
    		item7String="Nothing";
    	}
    	else if(item7>=5&&item7<=7){
    		item7String="Cloth";
    		if(item7INVC==0){
    			item7String="Cloth";
    			invCloth++;
    			item7INVC=1;
    		}
    		else{
    			item7String="Nothing";
    			item7INVC=1;
    		}
    	}
    	else{
    		item7String="Big Button";
    		LockedOne=true;
    	}
    	if(item8>=0&&item8<=4){
    		item8String="Nothing";
    	}
    	else if(item8>=5&&item8<=7){
    		item8String="Cloth";
    		if(item8INVC==0){
    			item8String="Cloth";
    			invCloth++;
    			item8INVC=1;
    		}
    		else{
    			item8String="Nothing";
    			item8INVC=1;
    		}
    	}
    	else{
    		item8String="Big Button";
    		LockedOne=true;
    	}
    	if(item9>=0&&item9<=4){
    		item9String="Nothing";
    	}
    	else if(item9>=5&&item9<=7){
    		item9String="Cloth";
    		if(item9INVC==0){
    			item9String="Cloth";
    			invCloth++;
    			item9INVC=1;
    		}
    		else{
    			item9String="Nothing";
    			item9INVC=1;
    		}
    	}
    	else{
    		item9String="Big Button";
    		LockedOne=true;
    	}
    	if(Door==1){
    		System.out.println("You found "+item1String+"!");
    	}
    	else if(Door==2){
    		System.out.println("You found "+item2String+"!");
    	}
    	else if(Door==3){
    		System.out.println("You found "+item3String+"!");
    	}
    	else if(Door==4){
    		System.out.println("You found "+item4String+"!");
    	}
    	else if(Door==5){
    		System.out.println("You found "+item5String+"!");
    	}
    	else if(Door==6){
    		System.out.println("You found "+item6String+"!");
    	}
    	else if(Door==7){
    		System.out.println("You found "+item7String+"!");
    	}
    	else if(Door==8){
    		System.out.println("You found "+item8String+"!");
    	}
    	else if(Door==9){
    		System.out.println("You found "+item9String+"!");
    	}
    	return Search1;
	}
}