class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int c1 = 0;
        int c2 = 0;

        int c1l = cards1.length - 1;
        int c2l = cards2.length - 1;

        for (int i = 0; i < goal.length; i++) {
            if (c1 <= c1l && goal[i].equals(cards1[c1])) {
                c1++;
            }else if(c2 <= c2l && goal[i].equals(cards2[c2]) ){
                c2++;
            }else return "No";
        }

        return answer;
    }
}