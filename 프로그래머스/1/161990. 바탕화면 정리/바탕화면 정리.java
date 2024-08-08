class Solution {
    public int[] solution(String[] wallpaper) {
        int y = wallpaper.length;
        int x = wallpaper[0].length();
        
        int lux, luy, rdx, rdy;
        lux = 51;
        luy = 51;
        
        rdx = 0;
        rdy = 0;
        
        for(int i = 0; i < y; i++ ){
            for(int j = 0; j < x; j++){
                
                if(wallpaper[i].charAt(j) == '#'){
                    if(luy > i){
                        luy = i;
                    }
                    if(lux > j){
                        lux = j;
                    }
                    if(rdy < i){
                        rdy = i;
                    }
                    if(rdx < j){
                        rdx = j;
                    }
                }
                
            }
        }
        
        int[] answer = {luy,lux,rdy + 1,rdx + 1};
        return answer;
    }
}