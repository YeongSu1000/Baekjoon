class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHp = health;
        int bandtime = 0;
        int c = attacks.length - 1;
        int lastAttack = attacks[c][0];
        int attackCount = 0;
        for(int i = 0; i < lastAttack; i++){
            
            if(i + 1 == attacks[attackCount][0]){
                health -= attacks[attackCount][1];
                bandtime = 0;
                attackCount++;
                if(health < 1){
                    return -1;
                }
            }else if(health < maxHp){
                health += bandage[1];
                bandtime++;
                if(bandtime == bandage[0]){
                    health += bandage[2];
                    bandtime = 0;
                }
            }
            if(health > maxHp){
                health = maxHp;
            }
        }
        
        int answer = 0;
        return health;
    }
}