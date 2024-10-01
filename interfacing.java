import java.io.*;
interface interface1
  {
    void addition();
    void subtraction();
  }
class max implements interface1
  {
    public void addition();
    {
      system.out.println("--add--");
    }
    public void subtraction();
    {
      system.out.println("--sub--");
    }
  }
class interfacing
  {
    public static void main(String[]args)
    {
      max m1=new max();
      m1.addition();
      m1.subtraction();
    }
  }
      
    
