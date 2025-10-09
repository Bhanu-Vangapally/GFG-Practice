import java.math.BigDecimal;
import java.math.RoundingMode;

class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> l=new ArrayList<Float>();
        l.add(a/b);
        BigDecimal r=new BigDecimal(a/b);
        r=r.setScale(3,RoundingMode.HALF_UP);
        l.add(r.floatValue());
        return l;
    }
}