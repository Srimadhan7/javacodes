import java.io.*;

abstract class teams
{
public abstract void NoOfPlayers();

public abstract void  NoOfMatches();

}

class matches extends teams
{

 public void NoOfPlayers()
  {
    System.out.println(" team enter to final match");
  }

public void NoOfMatches()
  {
    System.out.println(" played three match");
  }
}


class players
{

 public static void main(String []args)
  {
    teams m1=new matches();
    m1.NoOfPlayers();
    m1.NoOfMatches();

  }
}

