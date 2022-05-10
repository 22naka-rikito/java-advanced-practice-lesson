public class American extends Human{
	public American() {
		super();
		super.language = "アメリカ語";
	}
	
	public American(String name,String language) {
		super(name,language);
	}
	
	@Override
	public String returnBirthPlaceInfo() {
        // 出身地用の文字列
        String msg = "出身地:アメリカ";

        // 作成した文字列を返却
        return msg;
    }
}