
/*
 * write a java program that reades a list of integer from the user and throws an exception if any nombers ar duplicate
 */
import java.util.*;

class DuplicateValueExeption extends Exception {

    public DuplicateValueExeption(String errmsg) {
        super(errmsg);
    }

}

public class newjavaExeption {

    public void check(int arr[]) throws DuplicateValueExeption {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    throw new DuplicateValueExeption("hell gay hell gay hell gay hell gay");

                }
            }
            System.out.println(
                    "you are good boy you dont giving duplicate value. you good me good.god bless,the elements in index "
                            + i + "is " + arr[i]);
        }
    }

    public static void main(String eroor[]) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        size = sc.nextInt();
        int arr2[] = new int[size];
        System.out.println("Enter the numbers of the list");

        try {

            newjavaExeption nje = new newjavaExeption();
            for (int i = 0; i < size; i++) {
                arr2[i] = sc.nextInt();
            }
            nje.check(arr2);
        } catch (DuplicateValueExeption dv) {
            System.out.println("paglachoda tor code e error ache:" + dv.getMessage());

        }
        sc.close();
    }
}
