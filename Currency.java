package cc;
import java.util.*;
public class Currency
 {
  double inr,usd;
  double euro,yen;
  
   public void dollartorupee()
    { Scanner in=new Scanner(System.in);
     System.out.println("Enter dollar t convert into rupee");
     usd=in.nextDouble();
     inr=usd*83.80;
     System.out.println("dollar="+usd+"equal to inr"+inr);
     System.out.println("\n");
     }
       public void eurotorupee()  
        { Scanner in=new Scanner(System.in);
          System.out.println("Enter euro to convert to rupee");
          euro=in.nextDouble();
          inr=euro*81;
           System.out.println("Euro+"+euro+"equal to rupee"+inr);
            System.out.println("\n");
           }
         public void rupeetoeuro()
          { Scanner in=new Scanner(System.in);
             System.out.println("Enter rupee to convert into euro");
             inr=in.nextDouble();
              euro=inr/79;
              System.out.println("rupee+"+inr+"equal to euro"+euro);
            System.out.println("\n");
            }
          public void yentorupee()
          { Scanner in=new Scanner(System.in);
          System.out.println("Enter yen to convert into rupee");
             yen=in.nextDouble();
              inr=inr*0.57;
              System.out.println("yen+"+yen+"equal to rupee"+inr);
            System.out.println("\n");
           }
            public void rupeetoyen()
            { Scanner in=new Scanner(System.in);
             System.out.println("Enter rupee to convert into yen");
             inr=in.nextDouble();
              yen=inr/0.57;
              System.out.println("rupee+"+inr+"equal to yen"+yen);


            System.out.println("\n");
  		}
	}
