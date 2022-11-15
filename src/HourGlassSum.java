import java.util.List;


public class HourGlassSum {

    /**
     * Hackerrank easy 2D array question uses a sliding window pattern on three
     * arrays simultaneously to calculate the hourglass sum
     */
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0, len = arr.size(); i < len - 2; i++) {
            //sub arrays
            List<Integer> topArr = arr.get(i);
            List<Integer> middleArr = arr.get(i + 1);
            List<Integer> bottomArr = arr.get(i + 2);
            
            //arrLength
            int arrLen = topArr.size();


            // init pointers
            int left = 0, middle = 1, right = 2;

            while (right < arrLen) {
                // temporarily save sums
                int tempSum = 0;

                tempSum += topArr.get(left) + topArr.get(middle) + topArr.get(right);
                tempSum += middleArr.get(middle);
                tempSum += bottomArr.get(left) + bottomArr.get(middle) + bottomArr.get(right);

                if (tempSum > maxSum) maxSum = tempSum;

                // increment counters
                left++;
                middle++;
                right++;
            }

        }
        return maxSum;
    }

}
