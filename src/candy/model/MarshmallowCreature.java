package candy.model;

public class MarshmallowCreature
{
	// Declaration Section
	private int legs;
	private int arms;
	private int eyes;
	private boolean hasButton;
	private String name;

	public void setlegs(int legs)
	{
		this.legs = legs;

	}

	public void setarms(int arms)
	{
		this.arms = arms;

	}

	public void seteyes(int eyes)
	{
		this.eyes = eyes;
	}

	public void setHasButton(boolean hasButton)
	{
		this.hasButton = hasButton;
	}

	public void setname(String name)
	{
		this.name = name;

	}

	/**
	 * Default constructor for the MarshmallowCreature- Do not use.
	 */
	public MarshmallowCreature()
	{
		this.name="gross";
		this.hasButton=false;
		this.eyes=5;
		this.arms=16;
		this.legs=9;

	}

	/**
	 * 
	 * Creates a MarshmallowCreature with the specified parameters.
	 * 
	 * @param name
	 *            The name of the creature.
	 * @param hasButton
	 *            Whether the creature has a button.
	 * @param eyes
	 *            How many eyes the creature is constructed with.
	 * @param legs
	 *            The number legs when building the creature.
	 */
	public MarshmallowCreature(String name, boolean hasButton, int eyes,
			int arms, int legs)
	{

		this.name=name;
		this.hasButton=hasButton;
		this.eyes=eyes;
		this.arms=arms;
		this.legs=legs;
	}

}
