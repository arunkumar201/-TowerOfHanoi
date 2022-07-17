
import java.util.Scanner;
public class Main {
    static int i=0;
   static void TOH(int n,int src,int dest,int med) //TOH(int n,int A, int C ,int B)
   {
       if(n==0){
           return;
       }
       else{
           i++;
         //Moving or shifting n-1 disks from src(A) to med/Aux[B] by using dest rod (C) mediator.
           TOH(n-1,src,med,dest);  //TOH(n-1,A,B,C);
           System.out.println ("Move "+n+" from rod "+src+" to rod "+dest);
 //Moving or shifting n-1 disks from Med/Aux[ B ]  to dest(A) by using Src(A) rod as Mediator
           TOH(n-1,med,dest,src); //TOH(n-1,B,C,A);

       }
   }

    public static void main ( String[] args ) {
        int n;
        Scanner sc = new Scanner ( System.in );
        n = sc.nextInt ();

        TOH(n,1,3,2); //src=1(First rod)  , dest=3rd rod  , med(aux)=2nd rod  
        System.out.println (i);


    }

}

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
