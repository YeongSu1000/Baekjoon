class Solution {
    public String solution(String new_id) {
        String newId = "";
        int dot = 0;
        new_id = new_id.toLowerCase();
        for (int i = 0; i < new_id.length(); i++) {
            if (new_id.charAt(i) >= 97 && new_id.charAt(i) <= 122) {
                newId += new_id.charAt(i);
                
                dot = 0;
            } else if (new_id.charAt(i) == '-' || new_id.charAt(i) == '_') {
                newId += new_id.charAt(i);
                dot = 0;
            } else if(new_id.charAt(i) == '1' || new_id.charAt(i) == '2' || new_id.charAt(i) == '3' || 
                      new_id.charAt(i) == '4'|| new_id.charAt(i) == '5' || new_id.charAt(i) == '6' || 
                      new_id.charAt(i) == '7' || new_id.charAt(i) == '8' ||new_id.charAt(i) == '9' || 
                      new_id.charAt(i) == '0'){
                newId += new_id.charAt(i);
                dot = 0;
            }
            if (new_id.charAt(i) == '.' && dot == 0) {
                newId += new_id.charAt(i);
                dot = 1;
            }
        }
        if (newId.equals("")){
            newId = "a";
        }
        
        StringBuilder answer = new StringBuilder(newId);
        if(answer.charAt(answer.length() - 1) == '.' && answer.length() - 1 > 0){
            answer.deleteCharAt(answer.length() - 1);
        }else if(answer.charAt(answer.length() - 1) == '.' && answer.length() - 1 == 0){
            answer.setCharAt(0,'a');
        }
        if(answer.charAt(0) == '.' && answer.length() - 1 > 0){
            answer.deleteCharAt(0);
        }
        while(answer.length() > 15){
            answer.deleteCharAt(answer.length() - 1);
        }
        if(answer.charAt(answer.length() - 1) == '.'){
            answer.deleteCharAt(answer.length() - 1);
        }

        char c = answer.charAt(answer.length() - 1);
        while(answer.length() < 3){
            answer.append(c);
        }
        
        
        return String.valueOf(answer);
    }
}