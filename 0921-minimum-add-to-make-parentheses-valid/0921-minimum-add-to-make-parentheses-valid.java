class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        int open = 0;
        for(char c : s.toCharArray()){
            if (c == '('){
                open++;
            }else{
                if(open > 0){
                    open--;
                }else{
                    ans++;
                }
            }
        }
        return ans + open;
    }
}