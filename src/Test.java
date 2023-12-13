
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Person taro = new Person();
		
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber = "09012345678";
		taro.address = "東京都新宿区";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		taro.name="木村次郎";
		taro.age=18;
		taro.phoneNumber = "09098765432";
		taro.address = "東京都足立区";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		taro.name = "鈴木花子";
		taro.age = 16;
		taro.phoneNumber = "09011112222";
		taro.address = "東京都墨田区";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		taro.name = "河本敬太";
		taro.age = 32;
		taro.phoneNumber = "09033334444";
		taro.address = "東京都渋谷区";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		Robot robo = new Robot();
		
		robo.name = "aibo";
		robo.talk();
		robo.walk();
		robo.run();
		
		robo.name = "asimo";
		robo.talk();
		robo.walk();
		robo.run();
		
		robo.name = "pepper";
		robo.talk();
		robo.walk();
		robo.run();
	}

}
