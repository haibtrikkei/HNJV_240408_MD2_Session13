package demo_baitap.bai1;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Bai1 {
    public static void main(String[] args) {
        //dem so lan xuat hien cua moi phan tu trong mang
        int[] mang = {8,67,0,7,6,8,6,6,5,7,5};

        Map<Integer, Integer> list = new HashMap<>();

        for(int i = 0; i<mang.length;i++){
            boolean check = false;
            for(int j = 0; j < i;j++){
                if(mang[j]==mang[i]){
                    check = true;
                    break;
                }
            }
            if(!check){
                int count = 1;
                for(int j=i+1;j<mang.length;j++){
                    if(mang[i]==mang[j]){
                        count++;
                    }
                }
                list.put(mang[i], count);

            }
        }
        System.out.println("So lan xuat hien cua moi phan tu trong mang la: ");
        for(Map.Entry<Integer, Integer> obj : list.entrySet()){
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }
    }
}
