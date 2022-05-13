package jp.co.axiz.util;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

public class AppUtil{
	
	public static boolean isGameApp(App app){
		return app instanceof GameApp;
	}
	
	public static boolean isCardGameApp(App app) {
		return app instanceof CardGameApp; 
	}
	
	public static boolean isDartsGameApp(App app) {
		return app instanceof DartsGameApp; 
	}
	
	public static boolean isClockApp(App app) {
		return app instanceof ClockApp; 
	}
	
	public static String getAppName(App app) {
		String str = "";
		if(app instanceof CardGameApp) {
			str = "ゲーム:カード";
		}else if(app instanceof DartsGameApp) {
			str = "ゲーム:ダーツ";
		}else if(app instanceof ClockApp) {
			str = "時計";
		}
		return str; 
	}
}