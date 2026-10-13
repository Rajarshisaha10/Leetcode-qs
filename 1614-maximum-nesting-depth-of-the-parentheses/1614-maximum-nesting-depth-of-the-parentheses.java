class Solution {
    public int maxDepth(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        int max = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == '('){
                count++;
            }else if (arr[i] == ')'){
                if(count > max) max = count;
                count--;
            }
        }
        return max;
    }
}