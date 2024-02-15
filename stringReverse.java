import java.util.*;

class str_reverse {
	String rev = "";
	char ch;

	public void reverse(String str) {
		String arr[] = str.split(" ");
		System.out.println("The number of words in the string : " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			int n = s.length();

			for (int j = 0; j < n; j++) {
				ch = s.charAt(j);
				rev = ch + rev;
			}
			System.out.println("Reversed word is :" + rev);
			rev = " ";
		}
	}
}

class Main {
	public static void main(String args[]) {
		str_reverse obj = new str_reverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine().trim();
		obj.reverse(str);

		sc.close();
	}
}
