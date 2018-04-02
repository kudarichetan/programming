package learningJavaCore;

public class LocalVsGlobalVariables {
	int age=25; //Global variables
	String name="Tom";
	public static void main(String[] args) {
		int i=10;
		int age=28;
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables(); //Object Class
		System.out.println(obj.name);
		System.out.println(obj.age);
		int k = obj.sum();
		System.out.println(age);
		System.out.println(k);
	}
	public int sum() {
		int i=15;
		int j=25;
		int age=27;
		System.out.println("sum :"+age);
		return age;
	}

}
