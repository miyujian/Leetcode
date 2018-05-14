class Problem13 {
    public int romanToInt(String s) {
        char[] ss = s.toCharArray();
        int total = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(ss[i] == 'I'){
                total += 1;
            }else if(ss[i] == 'V'){
                total += 5;
                while(i-1 >= 0 && ss[i-1] == 'I' ){
                    i --;
                    total -= 1;
                }
            }else if(ss[i] == 'X'){
               total += 10;
                while(i-1 >= 0 && ss[i-1] == 'I' ){
                    i --;
                    total -= 1;
                }
            }else if(ss[i] == 'L'){
                total += 50;
                while(i-1 >= 0 && ss[i-1] == 'X' ){
                    i --;
                    total -= 10;
                }
            }else if(ss[i] == 'C'){
               total += 100;
                while(i-1 >= 0 && ss[i-1] == 'X' ){
                    i --;
                    total -= 10;
                }
            }else if(ss[i] == 'D'){
                total += 500;
                while(i-1 >= 0 && ss[i-1] == 'C' ){
                    i --;
                    total -= 100;
                }
            }else if(ss[i] == 'M'){
               total += 1000;
                while(i-1 >= 0 && ss[i-1] == 'C' ){
                    i --;
                    total -= 100;
                }
            }
        }
        return total;
    }
}
