public class countzero {
    public static void main(String[] args){
        int[] arr={10,0,78,0,52};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        System.out.print(count);
    }
    
}

