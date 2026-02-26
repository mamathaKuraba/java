import java.util.*;
public class day3{
public static void main(String[] args){
    int array[][]=new int[4][4];
    int new_arr[][]=new int[3][];
    new_arr[0]=new int[2];
    new_arr[1]=new int[6];
    new_arr[2]=new int[3];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<new_arr.length;i++){
        int value= sc.nextInt();
        new_arr[i]=new int [value];
    }
    System.out.println(new_arr[0].length);
    System.out.println(new_arr[1].length);
    System.out.println(new_arr[2].length);
}
}