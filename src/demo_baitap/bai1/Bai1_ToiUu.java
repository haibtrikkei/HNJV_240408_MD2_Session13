package demo_baitap.bai1;

import java.util.HashMap;
import java.util.Map;

public class Bai1_ToiUu {
    public static void main(String[] args) {
        //dem so lan xuat hien cua moi phan tu trong mang
        int[] mang = {8,67,0,7,6,8,6,6,5,7,5};

        Map<Integer, Integer> list = new HashMap<>();

        for(int x : mang){
            if(list.containsKey(x)){
                Integer value = list.get(x)+1;
                list.put(x,value);
            }else{
                list.put(x,1);
            }
        }
        System.out.println("So lan xuat hien cua moi phan tu trong mang la: ");
        for(Map.Entry<Integer, Integer> obj : list.entrySet()){
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }
    }
}
