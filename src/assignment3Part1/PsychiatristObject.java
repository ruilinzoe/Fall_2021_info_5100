package assignment3Part1;

public class PsychiatristObject {
    //asks moody object about its mood
    public void examine(MoodyObject moodyObject){
        System.out.printf("How are you feeling today?");
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(MoodyObject moodyObject){

        System.out.printf("Observation:"+moodyObject.toString());
    }

}
