package Day03.rpg;

class Tarantula extends Monster {
	public Tarantula() {
		super(70);
	}
	
	@Override
	public void attack() {
		System.out.println("타란튤라: 독침 발사! (데미지 9)");
	}
}
