package java15;
class CTest extends Thread  //(a)
{
   private String id;
   public CTest(String str)
   {
      id=str;
   }
   public void run()        //(b)
   {
      for(int i=1;i<=5;i++)
      {
         for(int j=0;j<100000000;j++);
         System.out.println(id+" "+i);
      }
   }
}
public class class02
{
   public static void main(String args[])
   {
      CTest hi=new CTest("Hello");    //(c)�ŧiCTest���O����éI�s
      CTest bye=new CTest("Good bye");//(c)�ŧiCTest���O����éI�s
      hi.run();
      bye.run();
   }
}
/*
(d)��X���G:
   Hello 1
   Hello 2
   Hello 3
   Hello 4
   Hello 5
   Good bye 1
   Good bye 2
   Good bye 3
   Good bye 4
   Good bye 5
*/