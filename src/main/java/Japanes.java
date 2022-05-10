public class Japanes extends Human{
	public Japanes() {
		super();
		super.language = "日本語";
	}
	
	public Japanes(String name,String language) {
		super(name,language);
	}
	
	@Override
	public String returnBirthPlaceInfo() {
        // 出身地用の文字列
        String msg = "出身地:日本";

        // 作成した文字列を返却
        return msg;
    }
}