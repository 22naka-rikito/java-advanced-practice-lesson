package app;

public abstract class GameApp implements App{
	String item;
	
	public GameApp() {
		
	}
	
	public GameApp(String item) {
		this.item = item;
	}
	
	public abstract String play();
	
	public String start(String name) {
		String str = name + "さんと" + this.item + "でゲームを開始します。";
		str += play();
		return str;
	}
}