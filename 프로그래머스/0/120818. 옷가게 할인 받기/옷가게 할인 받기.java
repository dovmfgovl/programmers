import java.lang.Math;

class Solution {
    public int solution(int price) {
        //int answer = 0;
        
        //if (price >= 500000)
          //  answer = (int) Math.floor(price * 0.8);
        //else if (price >= 300000)
          //  answer = (int) Math.floor(price * 0.9);
        //else if (price >= 100000)
          //  answer = (int) Math.floor(price * 0.95);
        //else
          //  answer = price;
        
        return (int) (price >= 500000 ? price * 0.8 : price >= 300000 ? price * 0.9 : price >= 100000 ? price * 0.95 : price);
    }
}