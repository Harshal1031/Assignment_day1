package com.oops2;

public class TestArea {

	public static void main(String[] args) {
//          Triangle t1=new Triangle();
//          t1.input();
//          Rectangle r1=new Rectangle();
//          r1.input();
//          
//          Area a=new Area();
//         
//     System.out.println("Area of Triangle::"+a.area(t1));
//   System.out.println("Area of Rectangle::"+a.area(r1));
//   Triangle t2=new Triangle();
//   t2.input();
//   System.out.println("Area of Triangle::"+a.area(t2));
		Cuboid c1 = new Cuboid();
		c1.input();
		Square s1 = new Square();
		s1.input();
		Circle cr1 = new Circle();
		cr1.input();
		Area a = new Area();
		System.out.println("Area of Cuboid::" + a.area(c1));
		System.out.println("Area of Squer::" + a.area(s1));
		System.out.println("Area of Circle::" + a.area(cr1));


	}

}
