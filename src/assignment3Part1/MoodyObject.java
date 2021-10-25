package assignment3Part1;

public abstract class MoodyObject{

    // Each Object expresses a different motion
    abstract void expressFeelings();

    // Return the mood : sad or happy – depending on which object sends the message
    abstract String getMood();

    //an object responds according to how it feels, print ”I feel Happy(or Sad) today!!”
    public void queryMood(){
        System.out.printf("I feel " + getMood()+" "+ "today");
    }
}
