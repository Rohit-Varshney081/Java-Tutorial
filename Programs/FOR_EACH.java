class FOR_EACH{
    static void min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        if (min>arr[i])
        min=arr[i];
        System.out.println("Minimum : "+min);
    }
    public static void main(String[] args){
        int a[]={10,20,30,5,15};
        min(a);
        int arr[]={22,33,44,55,66};
        for(int i:arr){
            System.out.println(i);
        }
    }
}