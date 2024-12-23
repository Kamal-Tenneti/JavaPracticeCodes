package basics;

import java.awt.Point;
import java.util.Date;

public class Variables_DataTypes {
	
	public static void main(String[]args) {
		//primitive data type
		byte age=22;
		long viewscount = 7_8_95_23_463;
		float Monthlyincome = 500.50F;
		char gender='M';
		boolean isvalid=true;
		System.out.println(age);
		System.out.println(viewscount);
		System.out.println(Monthlyincome);
		System.out.println(gender);
		System.out.println(isvalid);	
		
		//Non-primitive data type
		String name="Kamal";
		System.out.println(name);
		
		Date now=new Date();
		System.out.println(now);
		
		Point point1 = new Point(10, 20);
		Point point2= point1;
		System.out.println(point1.x + " : " + point1.y);
		System.out.println(point2.x + " : " + point2.y);
		point1.y = 25;
		System.out.println(point1.x + " : " + point1.y);
		System.out.println(point2.x + " : " + point2.y);
	}

}
