class Main {
   static void pattern6(int N)
{
  
    for (int i = 0; i < N; i++)
    {
       
        
        for (int j = N; j > i; j--)
        {
            System.out.print(N-j+1+" ");
        }

        System.out.println();
    }
}

    public static void main(String[] args) {
        
        int N = 5;
        pattern6(N);
    }
}
