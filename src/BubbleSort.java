public class BubbleSort{
    public static void main(String args[]){

        int arr[]={10,8,20,5};
        for(int i=0;i<arr.length;i++){
            //Reason for j=i+1 ; we will ignore already sorted elements in further iterations
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
