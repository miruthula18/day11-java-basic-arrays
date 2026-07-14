public class lastoccurance{
public static void main(String[] args){
    int[] arr={10,20,30,10,50};
    int target=10;
    int index=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            index=i;
            
        }

    }
    System.out.print(index);


    }
}