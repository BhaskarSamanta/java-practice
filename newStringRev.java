import java.util.*;

public class newStringRev {
    String rev="";
    char ch;

    public void reverse(String str) {
		String arr[] = str.split(" ");
		//System.out.println("The number of words in the string : " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			
            for (int j = 0; j < s.length(); j++) {
				 ch = s.charAt(j);
				 rev = ch + rev;
			}
            // rev = "" + rev;
			System.out.println("Reversed word is :" + rev); 
			rev = " ";
		}
        // System.out.println("Reversed word is :" + rev);
	}

public static void main(String[] args) {
     

    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a String:");
    String userString = sc.nextLine();

    int wordCount =0;

    for(int i=0; i< userString.length();i++){

        if (userString.charAt(i) == ' '|| userString.charAt(i)== userString.charAt(userString.length()-1)) {

            wordCount+=1;
            
        }
    
    }

    if (wordCount == 0) {
        
        System.out.println("There is Nothing in the Given String");
    }

    System.out.println("number of words in the string "+wordCount);

    newStringRev nr = new newStringRev();

    nr.reverse(userString);
    
    sc.close();


}
    
}
