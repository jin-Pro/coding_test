package Level_Basic_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No_33_1373 {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();
        int num;

        if(len % 3 == 1) s="00"+s;
        else if(len % 3 == 2) s="0"+s;
        for(int i=0; i<len; i+=3) {
            num=((s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i+2)-'0'));
            System.out.print(num);
        }
    }
}
