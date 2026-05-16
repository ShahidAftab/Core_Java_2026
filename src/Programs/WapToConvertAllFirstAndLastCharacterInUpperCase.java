package Programs;

public class WapToConvertAllFirstAndLastCharacterInUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is a programmimg lanuage";
		String s1[]=str.split(" ");
		String sent="";
		for(String ele:s1) {
			String word=ele;
			String newWord="";
			if(word.length()==1) {
				newWord = word.substring(0).toUpperCase();
			}
			else {
				newWord = word.substring(0,1).toUpperCase()+word.substring(1,word.length()-1)+word.substring(word.length()-1).toUpperCase();
			}
			sent = sent+newWord+" ";
		}
		System.out.println(sent.trim());
	}

}
