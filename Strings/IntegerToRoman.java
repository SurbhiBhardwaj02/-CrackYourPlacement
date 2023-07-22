package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");

        String result = "";
        while(num > 0){
            int temp=0;
            for(int i: map.keySet()){
                if(i > num){
                    continue;
                }
                else{
                    temp=i;
                    break;
                }
            }
            result += map.get(temp);
            num = num - temp;
        }

        return result;
    }
}
