package curs9;

public class VaragsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printArg("abc", "def");
		printVariableArg(3,"unu", "doi", "trei", "patru","cinci");
		
		//JavascriptExecutor
		//excuteScript("", webelemen1 )
		//excuteScript("", webelemen1, webelement2 )

	}
	
	public  static void printArg(String s1, String s2){
		System.out.println(s1 + " " +s2);
	}
	public  static void printVariableArg(int num, String ceva, String ... values ){
		for(String obj:values) {
			System.out.println(obj);
	}
		//System.out.println(ceva);
}
}
