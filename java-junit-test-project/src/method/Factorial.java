package method;

public class Factorial {
    public static int findFactorial(int number) {
        int result;
        int tempResult = 1;

        // if the number is 1
        if(number == 1) {
            // just assign the default temporary result to result
            result = tempResult;
            return result;
        }

        // otherwise (number >= 2)

        for(int i = 1; i <= number; i++) {
            tempResult = i * tempResult;  // 1 * 1, 2 * 1, 3 * 2, 4 * 6...
        }

        result = tempResult;


        return result;
    }


}
