
public class main {
	// メイン処理
	public static void main(String[] args) {

		// それぞれのインスタンスを生成
		Yusha yusha = new Yusha();
		Wizard wizard = new Wizard();
		Cleric cleric = new Cleric();
		LastBoss lastBoss = new LastBoss();

		// 敵があらわれた！
		System.out.println(lastBoss.getName() + "が現れた！");

		// バトル開始
		yusha.specialAttack(lastBoss);
		wizard.magicalAttack(lastBoss);
		lastBoss.specialEvilAttack(yusha);
		cleric.healingMagic(yusha);

		// 回復アイテムを使用
		System.out.println(yusha.getName() + "は薬草を使った");
		yusha.eatFood("薬草");
		System.out.println(wizard.getName() + "は魔法の水を使った");
		wizard.eatFood("魔法の水");

		// ステータス表示
		showStatus(yusha);
		showStatus(wizard);
		showStatus(cleric);
		showStatus(lastBoss);

	}

	private static void showStatus(Human target) {
		 System.out.println("- " + target.getName() + " の ステータス---");
		if (target.getGender() == 1) {
			System.out.println("性別　：　漢");
		} else {
			System.out.println("性別　：　女");

		}
		System.out.println("しんちょう ： " + target.getLength());
		System.out.println("たいじゅう ： " + target.getWeight());
		System.out.println("たいりょく ： " + target.getVitality());
		System.out.println("まりょく ： " + target.getMagic());
		System.out.println("");

	}

}
