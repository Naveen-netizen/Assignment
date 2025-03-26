package search;
public class sqrt {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(sqrtOfTheNum(x));
    }

    static int sqrtOfTheNum(int x) {
        int start = 0;
        int end = x;
        int result = 0;
        if (x == 0 || x == 1) {
            return x;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid == x) {
                result = mid;
                return result;
            } else if ((long) mid * mid > x) {
                end = mid - 1;
            } else {
                result=mid;
                start = mid + 1;
            }
        }
        return result;

    }
}