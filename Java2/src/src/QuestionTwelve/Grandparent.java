package QuestionTwelve;

public class Grandparent {
    static {
        System.out.println("static - grandparent");
    }

    {
        System.out.println("instance - grandparent");
    }

    public Grandparent() {
        System.out.println("constructor - grandparent");
    }
}
