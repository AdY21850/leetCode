class Solution {
    public String largestGoodInteger(String num) {
        String s = "";
        for (int i = 0; i <= num.length() - 3; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                String triple = "" + num.charAt(i) + num.charAt(i + 1) + num.charAt(i + 2);
                if (triple.compareTo(s) > 0) { 
                    s = triple;
                }
            }
        }
        return s;
    }
}