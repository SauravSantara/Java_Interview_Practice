package Core;
public class ArrSum {

    public static void main(String[] args) throws Exception {
        int arr[] = {3, 2, 4, 4, 3};
        int sum = 0;

        for (int itr: arr) {
            sum += itr;
        }
        System.out.println("sum = " + sum);
    }
}
