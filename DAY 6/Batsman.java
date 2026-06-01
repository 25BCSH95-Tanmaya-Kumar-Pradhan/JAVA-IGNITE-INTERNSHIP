
public class Batsman {
	
	String playerName;
	int runs;
	int balls;
	double strikeRate;
	
	Batsman (String pname, int run, int ball)
	{
		playerName = pname;
		runs=run;
		balls = ball;
		strikeRate = (double) (runs*100)/balls;
	}
	
	void display()
	{
		System.out.println("Player name: "+playerName);
		System.out.println("Strike Rate: "+strikeRate);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batsman player = new Batsman("Gill",75,50);
		player.display();
	}

}
