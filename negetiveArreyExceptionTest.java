import java.util.*;
class NegetiveException extends Exception {
    public NegetiveException(String errMsg) {
        super(errMsg);
    }
}
public class negetiveArreyExceptionTest {
    public void arreyValidation(int arr[]) throws NegetiveException {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                throw new NegetiveException("Negetive Values are Not Excepeted in Arrey ");
            } else {
                System.out.println("The arrey values of index " + i + " is " + arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the size of the Arrey: ");
        int size = sc.nextInt();
        int useArrey[] = new int[size];
        System.out.println("Enter the elements of the arrey: ");
        try {
            for (int i = 0; i < size; i++) {
                useArrey[i] = sc.nextInt();
            }
            negetiveArreyExceptionTest tester = new negetiveArreyExceptionTest();
            tester.arreyValidation(useArrey);
        } catch (NegetiveException neg_ep) {
            System.out.println("Error Occured! " + neg_ep.getMessage());
        }
        sc.close();
    }
}