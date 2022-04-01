
public class Yusha extends Human {

	// コンストラクタ
	public Yusha() {
		super.setName("勇者");
		super.setGender(1);
		super.setLength(180);
		super.setWeight(70);
		super.setVitality(100);
		super.setMagic(5);
	}

	public void specialAttack(Human target) {
		String name = super.getName();
		super.setVitality(super.getVitality() - 20);
		System.out.println(name + " の 攻撃");
		System.out.println(name + "の必殺技が炸裂した！");

		target.setVitality(target.getVitality() - 50);
		System.out.println(target.getName() + "に50のダメージを与えた");

		super.setVitality(super.getVitality() - 10);
		System.out.println(name + "の体力は" + super.getVitality() + "になった");
		System.out.println("");

	}

}
