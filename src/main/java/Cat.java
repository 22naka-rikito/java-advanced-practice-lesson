public class Cat extends Animal{
	
	public Cat() {
		
	}
	
	public Cat(String name,int age) {
		super(name,age);
	}

	@Override
	public String introduceAge() {
		String str = "種類はネコです。人間で言うと、";
		switch(super.age) {
		case 0:
			str += "0～10代中盤";
			break;
		case 1:
			str += "10代中盤";
			break;
		case 2:
		case 3:
			str += "20代";
			break;
		case 4:
		case 5:
			str += "30代";
			break;
		case 6:
		case 7:
		case 8:
			str += "40代";
			break;
		case 9:
		case 10:
			str += "50代";
			break;
		default:
			str += "60歳以上";
			break;
			
		}
		str += "です。";
		return str;
	}

	@Override
	public String getFilePath() {
		String path = "c:\\work\\cat.txt";
		return path;
	}
}