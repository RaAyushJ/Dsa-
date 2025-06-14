class Main {
   static void pattern5(int N)
{
    
    for (int i = 0; i < N; i++)
    {
    
        for (int j = N; j > i; j--)
        {
            System.out.print("* ");
        }

        System.out.println();
    }
}

    public static void main(String[] args) {
        
       
        int N = 5;
        pattern5(N);
    }
}
