class Solution {
    public int maximum69Number (int num) {
        StringBuilder s = new StringBuilder(Integer.toString(num));  
        int i = 0;
        while (i < s.length() && s.charAt(i) == '9') {  
            i++;
        }
        if (i < s.length()) {  
            s.setCharAt(i, '9');  
        }
        int ans = Integer.parseInt(s.toString()); 
        return ans;
    }
}
