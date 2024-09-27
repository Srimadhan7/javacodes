import java.io.*;

abstract class players
{


public abstract void NoOfPlayers();

public abstract void  NoOfMatches();


}


class matches extends players
{

 //method overriding
 public void NoOfPlayers()
  {
    System.out.println(" team enter to final match");
  }

public void NoOfMatches()
  {
    System.out.println(" played three match");
  }


}



class sample1
{

 public static void main(String []args)
  {

    players obj=new matches();

  }

}

