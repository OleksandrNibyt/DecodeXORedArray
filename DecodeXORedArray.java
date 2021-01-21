class Solution {
    public static int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int result[] = new int [len+1];
        result[0] = first;
        for (int i = 0; i < len; i++  ){
            result[i + 1] = result[i] ^ encoded[i];
        }
        return result;
    }
}

public class DecodeXORedArray {
    public static void main(String[] args) {
        int coded[] = {1,2,3};
        int first = 1;
        int[] result = Solution.decode(coded, first);
        for (int i = 0; i< result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
