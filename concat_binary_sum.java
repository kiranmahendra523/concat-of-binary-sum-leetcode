import java.util.*;
import java.io.*;
class Solution {
    public int concatenatedBinary(int n) {
        long res = 0;
        int mod = 1_000_000_007;
        for(int i=1;i<=n;i++){
            String st = Integer.toBinaryString(i);
            res = (res<<st.length())%mod;
            res = (res+i)%mod;
        }
        
        return (int)res;
    }
}
