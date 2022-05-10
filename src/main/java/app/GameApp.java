package app;

public class GameApp {
	String item;
	
	public GameApp() {
		
	}
	
	public GameApp(String item) {
		this.item = item;
	}
	
	public String start(String name) {
		String str = name + "さんと" + this.item + "でゲームを開始します。";
		return str;
	}
}