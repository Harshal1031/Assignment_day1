package com.oops2;

public class Area {

               public int area(Triangle t1) {
            	   
            	  return (t1.getLength()*t1.getBreadth())/2;
               }
               public int area(Rectangle r1) {
            	   
            	  return r1.getLength()*r1.getBreadth();
               }
               public int area(Cuboid c1) {
            	   volum(c1);
            	  return 2*(c1.getLength()*c1.getBreadth()+c1.getBreadth()*c1.getHight()+c1.getHight()*c1.getLength());
               }
			private void volum(Cuboid c1) {
               int volum=c1.getBreadth()*c1.getHight()*c1.getLength();
               System.out.println("Volum of Cuboid::"+volum);
               perimeter(c1);
			}
			private void perimeter(Cuboid c1) {
              int parimeter=4*(c1.getBreadth()+c1.getHight()+c1.getLength());
              System.out.println("The parimeter of Cuboid::"+parimeter);
			}
            public int area(Square s1) {
         	   
         	  return s1.getSide()*s1.getSide();
            }
            public double area(Circle cr1) {
          	   
         	  return cr1.getRadius()*cr1.getRadius()*Math.PI;
            }





}
