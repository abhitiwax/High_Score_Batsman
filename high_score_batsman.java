import java.util.*;
public class high_score_batsman {
    public static void main(String[] args) {
        String[] cricket={"Ajay,120","Abhishek,10","Abhay,11","Valika,150"};
        int[] list=new int[cricket.length];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cricket.length; i++) {
         StringBuilder temp = new StringBuilder(1);
         String[] sd = new String[1];
            for (int j = 0; j < cricket[i].length(); j++) {
                if (cricket[i].charAt(j) == ',') {

                    for (int k = j + 1; k < cricket[i].length(); k++) {
                        temp.append(cricket[i].charAt(k));
                    }
                    sd[0] = temp.toString();
                }
            }
            list[i]=Integer.parseInt(sd[0]);
     }
        for(int i=0;i<list.length;i++){
            int count=0;
            for(int j=0;j<list.length;j++){

                    if(list[i]>list[j]){
                        count++;
                    }
            }
            if(count== cricket.length-1){
                for(int m=0;m<cricket[i].length();m++){
                    if(cricket[i].charAt(m)==','){
                        break;
                    }
                    System.out.print(cricket[i].charAt(m));
                }
                i=list.length;
            }
        }
    }
}
