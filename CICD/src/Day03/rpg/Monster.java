package Day03.rpg;

abstract class Monster implements Attackable {
	protected int hp;
	
	public Monster(int hp) {
		this.hp = hp;
	}
	
	public boolean isAlive() {
		return hp > 0;
	}
}
