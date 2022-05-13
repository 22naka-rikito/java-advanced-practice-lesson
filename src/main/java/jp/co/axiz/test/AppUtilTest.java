package jp.co.axiz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.util.AppUtil;

class AppUtilTest {

	@Test
	public void isGameAppNo1() {
		CardGameApp cardGameApp = new CardGameApp();
		boolean result = AppUtil.isGameApp(cardGameApp);
		assertEquals(true,result);
	}
	
	@Test
	public void isGameAppNo2() {
		DartsGameApp dartsGameApp = new DartsGameApp();
		boolean result = AppUtil.isGameApp(dartsGameApp);
		assertEquals(true,result);
	}
	
	@Test
	public void isGameAppNo3() {
		ClockApp clockApp = new ClockApp();
		boolean result = AppUtil.isGameApp(clockApp);
		assertEquals(false,result);
	}
	
	@Test
	void isCardGameAppNo1() {
		CardGameApp cardGameApp = new CardGameApp();
		boolean result = AppUtil.isCardGameApp(cardGameApp);
		assertEquals(true,result);
	}
	
	@Test
	void isCardGameAppNo2() {
		DartsGameApp dartsGameApp = new DartsGameApp();
		boolean result = AppUtil.isCardGameApp(dartsGameApp);
		assertEquals(false,result);
	}
	
	@Test
	void isCardGameAppNo3() {
		ClockApp clockApp = new ClockApp();
		boolean result = AppUtil.isCardGameApp(clockApp);
		assertEquals(false,result);
	}
	
	@Test
	void isDartsGameAppNo1() {
		CardGameApp cardGameApp = new CardGameApp();
		boolean result = AppUtil.isDartsGameApp(cardGameApp);
		assertEquals(false,result);
	}
	
	@Test
	void isDartsGameAppNo2() {
		DartsGameApp dartsGameApp = new DartsGameApp();
		boolean result = AppUtil.isDartsGameApp(dartsGameApp);
		assertEquals(true,result);
	}
	
	@Test
	void isDartsGameAppNo3() {
		ClockApp clockApp = new ClockApp();
		boolean result = AppUtil.isDartsGameApp(clockApp);
		assertEquals(false,result);
	}
	
	@Test
	void isClockAppNo1() {
		CardGameApp cardGameApp = new CardGameApp();
		boolean result = AppUtil.isClockApp(cardGameApp);
		assertEquals(false,result);
	}
	
	@Test
	void isClockAppNo2() {
		DartsGameApp dartsGameApp = new DartsGameApp();
		boolean result = AppUtil.isClockApp(dartsGameApp);
		assertEquals(false,result);
	}
	
	@Test
	void isClockAppNo3() {
		ClockApp clockApp = new ClockApp();
		boolean result = AppUtil.isClockApp(clockApp);
		assertEquals(true,result);
	}
	
	@Test
	void getAppNameNo1() {
		CardGameApp cardGameApp = new CardGameApp();
		String result = AppUtil.getAppName(cardGameApp);
		assertEquals("ゲーム:カード",result);
	}
	
	@Test
	void getAppNameNo2() {
		DartsGameApp dartsGameApp = new DartsGameApp();
		String result = AppUtil.getAppName(dartsGameApp);
		assertEquals("ゲーム:ダーツ",result);
	}
	
	@Test
	void getAppNameNo3() {
		ClockApp clockApp = new ClockApp();
		String result = AppUtil.getAppName(clockApp);
		assertEquals("時計",result);
	}

}
