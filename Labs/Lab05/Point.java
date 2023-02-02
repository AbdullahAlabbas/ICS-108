package Labs.Lab05;
public class Point {

    double x,y;

    Point()
    { x = 0;
     y = 0;}

     Point(double Px,double Py)
     { x = Px;
     y = Py;}

     double distance(Point p)

     {return Math.sqrt( Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));}


    
}


