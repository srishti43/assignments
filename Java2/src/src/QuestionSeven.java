//WAP to convert seconds into days, hours, minutes and seconds.
public class QuestionSeven
{
    int inputSeconds;
    int days;
    int hours;
    int minutes;
    int seconds;

    QuestionSeven(int s) {
        inputSeconds = s;
    }

    void convertSeconds() {
        days = inputSeconds / 86400;
        int remainingSeconds = inputSeconds % 86400;
        hours = remainingSeconds / 3600;
        remainingSeconds = remainingSeconds % 3600;
        minutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;
        seconds = remainingSeconds;
    }

    public static void main(String[] args) {
        QuestionSeven converter = new QuestionSeven(86400);
        converter.convertSeconds();
        System.out.println(converter.inputSeconds + " seconds is");
        System.out.println(converter.days + " day(s)");
        System.out.println(converter.hours + " hour(s)");
        System.out.println(converter.minutes + " minute(s)");
        System.out.println(converter.seconds + " second(s)");

    }
}
