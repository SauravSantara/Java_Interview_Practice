package Core;
public class NoDuplicate {
    
    public static void main(String[] args) throws Exception {
        int arr[] = {3, 2, 4, 4, 3, 77, 1, 1, 11, 1};

        for (int i = 0; i < arr.length; i++)
        {
            boolean isDuplicate = false;

            for (int j = 0; j < arr.length; j++)
            {
                if (i == j)
                {
                    continue;
                }
                else if (arr[i] == arr[j]){
                    isDuplicate = true;
                    System.out.println("isDuplicate = " + arr[i]);
                    break;
                }
            }

            if (!isDuplicate)
                System.out.println("Has no duplicate = " + arr[i]);
        }
    
    }

}
