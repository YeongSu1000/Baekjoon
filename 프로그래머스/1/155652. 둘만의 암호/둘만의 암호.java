class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            c = s.charAt(i);
            while (count < index) { // z = 122
                c++;
                if (c > 122) {
                    c = 'a';
                }
                if (!skip.contains(String.valueOf(c))) {
                    count++;

                }

            }
            answer += String.valueOf(c);
        }
        return answer;
    }
}