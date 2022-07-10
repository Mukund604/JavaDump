public class DigitSum {
    public static void sumDigit(){
        int n, sum, lastDigit;
        n = 1234;
        sum = 0;
        while (n > 0) {
            lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        System.out.println(sum);
        System.out.println("Moti hi");
    }

    public static void main(String[] args) {
        DigitSum.sumDigit();
    }

}

