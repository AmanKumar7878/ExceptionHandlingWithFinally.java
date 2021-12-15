public class New {
    public static void main(String[] args) {
        int i=0;
        int j =5;
        try
        {
            int c=j/i;

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
        System.out.println("Inside Finally Block");
        }
    }
}
