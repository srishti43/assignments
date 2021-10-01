class UnfoundClass {
    UnfoundClass() {
        System.out.println("I will not be found at runtime");
    }
}

public class ThirdQuestion {
    public static void main(String[] args) {
        try {
            // ClassNotFoundException
            // Class.forName("saurabh.soni");
            // NoClassDefFoundError
            UnfoundClass ufc = new UnfoundClass();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("I'm in finally block");
        }
    }
}