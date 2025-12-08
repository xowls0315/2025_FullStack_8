package Day03.rpg;

abstract class Character implements Attackable, SpecialSkill {
	protected int hp;
	protected int mp;
	
	public Character(int hp, int mp) {
		this.hp = hp;
		this.mp = mp;
	}
	
	public boolean isAlive() {
		return hp > 0;
	}
}
