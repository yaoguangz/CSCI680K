package Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	public static void main(String x[])
	{
		Map<String, Integer> map = new HashMap<>();
		
		//String[] words = {"Yao", "guang", "yao", "zhong", "yao"};
		String sentence = "Would it be faster if I used some sort of StringBuilder, or a regex, or maybe something else? Yes, I know: profile it and see, but I hope someone can provide an answer of the top of their head, as this is a common task.";
		String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		String wordLower = null;
	    for (String w : words) {
	    	wordLower = w.toLowerCase();
	        Integer n = map.get(wordLower);
	        n = (n == null) ? 1 : ++n;
	        map.put(wordLower, n);
	    }
	    
	    PrintWriter writer = null;
		try {
			writer = new PrintWriter("E:\\Spring 2016\\CSCI 680-K\\Project\\Output\\wordCount1.csv", "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    writer.println("word,count");
	   // writer.println("The second line");
	    
	    
	    System.out.println("word,count");
	    for (String key : map.keySet()) {
	        System.out.println(key + "," + map.get(key));
	        writer.println(key + "," + map.get(key));
	    }
	    
	    writer.close();
	}
}
