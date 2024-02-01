package TestPackg;

public class ChildClass extends LoginClass {
	
	public static void main(String[] args) {
		Object[] input1 = new Object[2];
		input1[0] = "Chrome";
		input1[1] = "C:\\Users\\Mr. Nilesh\\Drivers\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe";
//"C:\Users\Mr. Nilesh\Drivers\geckodriver-v0.34.0-win64\geckodriver.exe"

		ParentClass.BrowLaunch(input1);
		
		ChildClass vv = new ChildClass();

		Object[] input2 = new Object[1];
		input2[0] = "https://tutorialsninja.com/demo/index.php?route=account/login"; // browser loaunch
		vv.geturl(input2);

		Object[] input3 = new Object[2];
		input3[0] = "//input[@name='email']";
		input3[1] = "annamali7745@gmail.com";
		vv.findElement(input3);

		
		input3[0] = "//input[@name='password']";
		input3[1] = "12345";
		vv.findElement(input3);

		Object[] input5 = new Object[2];
		input5[0] = "//input[@value='Login']";
		vv.clicklogin(input5);
	}
	
	
}

