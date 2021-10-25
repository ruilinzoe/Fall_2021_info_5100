package assignment3Part1;

public class HappyObject extends MoodyObject{

    @Override
    //returns string indicating happy
    public String getMood(){
        return "happy";
    }

    @Override
    public void expressFeelings() {
        System.out.printf("heeehee….hahahah…HAHAHA!!");
    }

    public String toString() {
        return ("Subject laughs a lot");

    }
}
