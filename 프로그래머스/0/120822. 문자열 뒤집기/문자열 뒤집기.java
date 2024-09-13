class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        for(int i=0; i<my_string.length()/2; i++){
            ch[i] ^= ch[my_string.length()-i-1];
            ch[my_string.length()-i-1] ^= ch[i];
            ch[i] ^= ch[my_string.length()-i-1];
        }
        answer = new String(ch);
        return answer;
    }
}