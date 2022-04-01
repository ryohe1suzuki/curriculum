
public class Wizard extends Human {
	// コンストラクタ
	public Wizard() {
		super.setName("魔法使い");
		super.setGender(2);
		super.setLength(170);
		super.setWeight(60);
		super.setVitality(20);
		super.setMagic(50);
	}

	public void magicalAttack(Human target) {
		String name = super.getName();
		System.out.println(name + " の 攻撃");
		System.out.println(name + "は攻撃呪文を唱えた！");

		target.setVitality(target.getVitality() - 20);
		System.out.println(target.getName() + "に20のダメージを与えた");

		super.setVitality(super.getMagic() - 10);
		System.out.println(name + "の魔力は" + super.getMagic() + "になった");
		System.out.println("");

	}

}
