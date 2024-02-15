import java.util.*;
public class deleteConsonants {
    public static void main(String[] args){
        String userstr="";
        String newstr="";
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");

        userstr=sc.nextLine().trim();

        for(int i = 0; i<userstr.length(); i++ ){
            if(userstr.charAt(i)=='a'||userstr.charAt(i)=='e'||userstr.charAt(i)=='i'||userstr.charAt(i)=='o'||userstr.charAt(i)=='u'||userstr.charAt(i)=='A'||userstr.charAt(i)=='E'||userstr.charAt(i)=='I'||userstr.charAt(i)=='O'||userstr.charAt(i)=='U'||userstr.charAt(i)==' '){
                
                newstr+=userstr.charAt(i);

            }
        }
        System.out.println("the new string is: \n" +newstr);

        sc.close();

    }
}
