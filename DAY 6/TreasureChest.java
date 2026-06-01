
public class TreasureChest {
	String playerName;
	int coinsCollected;
	String reward;
	
	TreasureChest (int coins)
	{
		coinsCollected = coins;
		if(coins>=1000)
		{
			reward = "Diamond Sword"; 
		}
		else if(coins>=500)
		{
			reward = "Gold Sword";
		}
		else if(coins>=100)
		{
			reward = "Iron Sword";
		}
		else
		{
			reward = "Wooden Sword";
		}
	}
	
	void display()
	{
		System.out.println("Collected "+coinsCollected+" coins");
		System.out.println("Reward: "+reward);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreasureChest treasure = new TreasureChest(1000);
		treasure.display();
	}

}
