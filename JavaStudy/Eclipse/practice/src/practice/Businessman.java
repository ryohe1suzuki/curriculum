package practice;

public class Businessman {
	//======パラメータ======
	private String name;  //名前
	private int gender; //性別(1：男　2：女）
	private int length; //身長
	private int weight; //体重
	private String skill; //特技
	private String hoby; //趣味
	
	//コンストラクタ
	public Businessman() {
		this.name = "サラリーマン金太郎";
		this.gender = 1;
		this.length = 180;
		this.weight = 80;
		this.skill = "商談";
		this.hoby = "編み物";		
	}
	
    //======操作======
    //営業メソッド
	public void sales() {
		System.out.println(this.name + "は外回りに行ってきます！");
	}
	
	//休憩メソッド
	public void rest() {
		System.out.println(this.name + "は" + this.hoby + "をして休憩しています" );
	}
	
	//特技getterメソッド
	public String skill() {
		return this.skill;
	}
	
	
	public static void main(String[] args) {
		Businessman bm = new Businessman();
		bm.sales();
		bm.rest();
		System.out.println(bm.skill() + "が得意です！");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
