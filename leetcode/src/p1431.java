import java.util.ArrayList;
import java.util.List;

class p1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();

        int maxValue = 0;

        for (int candy : candies) {
            if (candy > maxValue) {
                maxValue = candy;
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maxValue) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
}
