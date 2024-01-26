public class App {

    static void tlargest(int arr[]){
        if(arr.length<3){
            System.out.println("invalid");
        }
        int largest=arr[0], second=Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i = 1 ; i< arr.length; i++){
            if(arr[i]>largest){
                third=second;
                second= largest;
                largest=arr[i];
                
            }
            else if (arr[i]>second){
                third=second;
                second=arr[i];
                
            }
            else if(arr[i]>third){
                third=arr[i];
            }
            
        }
        System.out.printf("the 3rd largest number is %d:",third);
    }
    public static void main(String[] args) throws Exception {
    int[] arr = {2,5,1,7,8,8,9,12,6};
    tlargest(arr);
    }
    
    }
