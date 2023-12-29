package com.javainbabysteps.advancedoop.Lecture1Ex2;

public class PassingObject {
    public static float avg(Point p) {
        float result = 0;
        int a = p.getX();
        int b= p.getY();
        result = (a + b)/2.0F;
        a++;
        b++;
        p.setX(a);
        p.setY(b);
        return result;
    }

    public static void main(String[] args) {

        Point point = new Point(3,4);

        float z = avg(point);
        System.out.println("z="+z);
        System.out.println("p.x="+ point.getX());
        System.out.println("p.y="+point.getY());
    }


}
