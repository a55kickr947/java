package dc;
import java.util.*;
public class Distance{
 double km,m,mile;
 Scanner in=new Scanner(System.in);
public void mtokm()
{
 System.out.println("enter the distance");
 m=in.nextDouble();;
 km=m/1000;
 System.out.println(" meters="+m+"Kilometers="+km);
 System.out.println("\n");
}
public void kmtom()
{
 System.out.println("enter the distance");
 km=in.nextDouble();;
 m=km*1000;
 System.out.println(" kilometers"+km+"meters="+m);
 System.out.println("\n");
}
public void miletokm()
{
 System.out.println("enter the distance");
 mile=in.nextDouble();
 km=mile/1.61;
 System.out.println(" miles="+mile+"Kilometers="+km);
 System.out.println("\n");
}
public void kmtomile()
{
 System.out.println("enter the distance");
 km=in.nextDouble();;
 m=km*0.62;
 System.out.println(" kilometers"+km+"miles="+mile);
 System.out.println("\n");
}
}
