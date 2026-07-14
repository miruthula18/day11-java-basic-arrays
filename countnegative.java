public class countnegative {
    public static void main(String[] args){
        int[] arr={10,-58,78,-7,52};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
        }
        System.out.print(count);
    }
    
}
