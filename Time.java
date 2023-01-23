package tc;
import java.util.*;
public class Time
{ 
double min,hour;
 Scanner in=new Scanner(System.in);
 public void minutetohour()
{ 
 System.out.println("enter minutes:");
 min=in.nextDouble();
 hour=min*60;
  System.out.println("minutes:"+min+"hour"+hour);
System.out.println("\n");
  }
 public void hourtomin()
{ 
 System.out.println("enter hours:");
 min=in.nextDouble();
 min=hour/60;
  System.out.println("hour="+hour+"min="+min);
System.out.println("\n");
}
}
  
