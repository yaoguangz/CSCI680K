package Test;

public class SearchSubStrInStr {

	public static void main(String[] args) 
	{
		int ind = searchWordInText("Hello readers Yao","Yao");
		System.out.println(ind);
		
		/*
	      String strOrig = "Hello readers";
	      
	      int intIndex = strOrig.indexOf("readers");
	      
	      if(intIndex == - 1){
	         System.out.println("Hello not found");
	      }else{
	         System.out.println("Found Hello at index "
	         + intIndex);
	      }
	      */
	 }
	
	// -1: not found, otherwise: found
	public static int searchWordInText(String text, String word)
	{
		//String strOrig = "Hello readers";
	      /*
	      int intIndex = text.indexOf(text);
	      
	      if(intIndex == - 1){
	         System.out.println("Hello not found");
	      }else{
	         System.out.println("Found Hello at index "
	         + intIndex);
	      }
	      */
	      return text.indexOf(word);
	}
	
}
