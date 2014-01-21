package candy.controller;

import candy.model.MarshmallowCreature;

public class CandyControler
{
	private MarshmallowCreature myCreature;
	
	public void start()
	{
		makeMonster();
	}
	
	private void makeMonster()
	{
		myCreature=new MarshmallowCreature("susie", false, 2, 2, 2);
	}
	

}
