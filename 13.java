class Solution {
    public int romanToInt(String s) {
        int ret = 0;
        char last = 'A';
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                    ret++;break;
                case 'V':
                    if(last == 'I'){ret+=3;break;}
                    else ret+=5;break;
                case 'X':
                    if(last == 'I'){ret+=8;break;}
                    else ret+=10;break;
                case 'L':
                    if(last == 'X'){ret+=30;break;}
                    else ret+=50;break;
                case 'C':
                    if(last == 'X'){ret+=80;break;}
                    else ret+=100;break;
                case 'D':
                    if(last =='C'){ret+=300;break;}
                    else ret+=500;break;
                case 'M':
                    if(last == 'C'){ret+=800;break;}
                    else ret+=1000;break;
                default:
                    return -1;
            }
            last = s.charAt(i);
        }
        return ret;
    }
}
