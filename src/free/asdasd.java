package free;

import java.util.ArrayList;
import java.util.List;

public class asdasd {
    public static void main(String[] args) {
        String arg1 = "CodegymDaNang";

            String output ="";
            for(int i=0; i<arg1.length(); i++){
                if  (arg1.charAt(i) == arg1.toLowerCase().charAt(i)){
                    output += arg1.charAt(i);
                } else {
                    if  (i != 0){
                        output += " ";
                    }
                    output += arg1.toLowerCase().charAt(i);
                }
            }
        System.out.println(output);
    }
}
