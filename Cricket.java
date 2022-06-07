import java.util.*;
public class Cricket {
    public static void main(String[] args) {
        String[] cricket={"Ajay,120","Abhishek,10","Abhay,1150","Valika,150"};
        ArrayList<Integer> list = new ArrayList<>(cricket.length);
        Scanner sc = new Scanner(System.in);

     for (int i = 0; i < cricket.length; i++) {
            for (int j = 0; j < cricket[i].length(); j++) {
                if (cricket[i].charAt(j) == ',') {
                    StringBuilder temp = new StringBuilder(1);
                    String[] sd = new String[1];
                    int count = 0;
                    for (int k = j + 1; k < cricket[i].length(); k++) {
                        temp.append(cricket[i].charAt(k));
                    }
                    sd[count] = temp.toString();
                    count++;
                    for (int l = 0; l < count; l++) {
                        list.add(Integer.parseInt(sd[l]));
                    }
                }
            }
     }
        for(int i=0;i< list.size();i++){
            int count=0;
            for(int j=0;j< list.size();j++){
                if(list.get(i)!=list.get(j)){
                    if(list.get(i)>list.get(j)){
                        count++;
                    }
                }
            }
            if(count==list.size()-1){
                for(int m=0;m<cricket[i].length();m++){
                    if(cricket[i].charAt(m)==','){
                        break;
                    }
                    System.out.print(cricket[i].charAt(m));
                }
                i= list.size();
            }
        }
    }
}
