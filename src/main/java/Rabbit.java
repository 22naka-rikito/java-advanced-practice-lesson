public class Rabbit extends Animal{
	
	public Rabbit() {
		
	}
	
	public Rabbit(String name,int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String introduceAge() {
		String str = "種類はウサギです。人間で言うと、";
		switch(super.age) {
		case 0:
			str += "0～10代中盤";
			break;
		case 1:
			str += "10代中盤";
			break;
		case 2:
			str += "20代";
			break;
		case 3:
			str += "30代";
			break;
		case 4:
			str += "40代";
			break;
		case 5:
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
		String path = "c:\\work\\rabbit.txt";
		return path;
	}
}