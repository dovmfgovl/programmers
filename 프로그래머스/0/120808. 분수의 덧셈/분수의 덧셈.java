class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {       
        // numer1, numer2 와 denom1, denom2 를 통분한다.
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;
        
        //int max = 1;
        
        // 공약수를 max에 저장하면서 최종적으로 최대공약수가 max에 저장되도록 한다.
        //for (int i=1; i<=numer && i<=denom; i++) {
        //    if (numer%i == 0 && denom%i == 0) {
        //        max = i;
        //    }   
        //} 
        //
        //numer = numer / max;
        //denom = denom / max;
        
        // denom 통분한 수에서 1씩 minus하며 값을 구한다.
        for (int i=denom; i>=1; i--) {
            if (numer%i == 0 && denom%i == 0) {
                numer /= i;
                denom /= i;
            }
        }
        
        int[] answer = {numer, denom};
        return answer;
    }
}