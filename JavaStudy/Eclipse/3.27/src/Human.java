public class Human {
	private String name = null; // 名前
	private int gender = 0; // 性別 (1:男 2:女)
	private int length = 0; // 身長
	private int weight = 0; // 体重
	private int vitality = 0; // 体力
	private int magic = 0; // 魔力

	// コンストラクタ
	public Human() {
	}

	// getter･setter(なまえ)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getter･setter(性別)
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;

	}

	// getter･setter(身長)
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	// getter･setter(体重)
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// getter･setter(たいりょく)
	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vaitality) {
		this.vitality = vaitality;
	}

	// getter･setter(まりょく)
	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	// はなす
	public void talk(String about) {
		System.out.println(about);
	}

	// 食べる
	public void eatFood(String food) {

		int foodType = 0;

		if ("やくそう".equals(food)) {
			foodType = 1;
		} else if ("魔法の水".equals(food)) {
			foodType = 2;
		} else {
			foodType = 3;
		}
		digestFood(foodType);// 食べ物を消化する
	}

	// 消化する
	public void digestFood(int foodType) {
		if (foodType == 1) {
			vitality += 10; // 体力を10回復
		} else if (foodType == 2) {
			magic += 10; // 魔力を10回復
		} else {
			vitality += 1;
		}
	}

}
