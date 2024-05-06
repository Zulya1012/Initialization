package init;
public class House {
	int square = 160;
	String color;
	Door d = new Door (210);
	House(String c){
		color = c;
		System.out.println("Inside House Constractor");
	}

}

class Door{
	int hight;
	Door (int h){
		hight = h;
		System.out.println("Inside Door Constractor");
	}
}
