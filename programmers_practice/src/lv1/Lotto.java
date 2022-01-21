package lv1;

class Lotto {
    public int[] Lotto(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int matchCnt = 0;

        for(int i = 0; i <lottos.length; i++) {
            if(lottos[i] == 0)
                zeroCnt++;
            for(int j = 0; j < win_nums.length; j++) {
                if(win_nums[j] == lottos[i]){
                    matchCnt++;
                    break;
                }
            }
        }

        answer[0] = Math.min(7-(zeroCnt+matchCnt),6);
        answer[1] = Math.min(7-matchCnt,6);
        return answer;
    }
}

