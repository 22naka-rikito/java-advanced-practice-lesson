package jp.co.axiz.app;

public abstract class GameApp implements App{
	private String item;
	private int playTime;
	
	public GameApp() {
		
	}
	
	public GameApp(String item) {
		this.item = item;
	}
	
	protected abstract String play();
	
	public String start(String name) {
		String str = name + "さんと" + this.item + "でゲームを開始します。";
		str += play();
		return str;
	}
	
	public void setNum(int playTime) {
		this.playTime = playTime;
	}
	
	public int getNum() {
		return this.playTime;
	}
}