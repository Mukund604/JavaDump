import java.util.*;
public class NumberSum {
    private static Scanner in = new Scanner(System.in);
    public void largestSmallestMeanNumber() {
        int t = in.nextInt();
        int numberOfInputs = t;
        int mean = 0;
        int count = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        while(t > 0){
            int n = in.nextInt();
            count += n;
            int temp = n;
            if(temp > largest){
                largest = temp;
            }
            if(temp < smallest){
                smallest = temp;
            }
            t--;
        }
        mean = count/numberOfInputs;
        System.out.println("The Lagrest Number is: " + largest);
        System.out.println("The Smallest Number is: " + smallest);
        System.out.println("The Mean of the Numbers is: " + mean);

    }
}
