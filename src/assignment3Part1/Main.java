package assignment3Part1;

public class Main {
    public static void main(String[] args) {
        MoodyObject happy=new HappyObject();
        MoodyObject sad=new SadObject();
        PsychiatristObject psy=new PsychiatristObject();


        psy.examine(happy);
        System.out.println();
        happy.queryMood();
        System.out.println();
        System.out.println();

        happy.expressFeelings();
        System.out.println();
        psy.observe(happy);
        System.out.println();

        System.out.println();
        psy.examine(sad);
        System.out.println();
        sad.queryMood();
        System.out.println();
        System.out.println();
        sad.expressFeelings();
        System.out.println();
        psy.observe(sad);


    }
}
