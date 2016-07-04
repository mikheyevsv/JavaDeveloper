package mikheyevsv.Lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Serg on 29.02.2016.
 */
public class DublString {

    public String[] removeDubleString(String[] arr) {
        int index = 1;
        String [] tempArr = new String[arr.length];
        tempArr[0] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[index] = null;
                    tempArr[index++] = arr[i];
                }
            }
        }
//        new prohod
        String [] arr1 = new String[index];
        System.arraycopy(tempArr, 0, arr1, 0, index);
        return arr1;
    }
}

//        boolean[] isDubl = new boolean[str.length];
//        for (int i = 0; i < str.length; i++);
//
//           for (int i = 0; i < str.length; i++) {
//               if(!isDubl[i]){
//                    String tmp = str[i];
//
//                    for (int j = i+1; j < str.length ; j++) {
//                        if(tmp == str[j]){
//                           isDubl[j] = true;
//                           index++;
//                      }
//                   }
//               }
//            }
//       String []result = new String[str.length - index];
//       for (int i = 0, j = 0; i < str.length ; i++) {
//           if(!isDubl[i]){
//               result[j++] = str[i];
//            }
//        }
       // return i;


