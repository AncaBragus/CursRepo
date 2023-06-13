package curs10;

public class StringBuilderExample {

	public static void main(String[] args) {
		reverseString("masina");
		replaceFromString("Salut! Eu sunt Oana");
		deleteFromString("teleenciclopedie");
		insertIntoString("Textul initial");
		addSpacesToText("ThisisA Camelcasetest");
		
	}
	public static void reverseString(String text){
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
}
	public static void replaceFromString (String text){
		StringBuilder sb = new StringBuilder(text);
		sb.replace(6,12,"Oana");
		System.out.println(sb);
	}
	
	public static void deleteFromString (String text){
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.delete(2,5);
		System.out.println(sb);
	}
	
	public static void insertIntoString (String text){
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.insert(0,"text de inserat");
		System.out.println(sb);
	}
	public static void  addSpacesToText(String text) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		for (int i =0; i<sb.length();i++){
			if(Character.isUpperCase(sb.charAt(i)))	{
				sb.insert(i," ");
				i++;
			}
				
		}
		
	}
}
