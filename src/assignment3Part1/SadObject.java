package assignment3Part1;

public class SadObject extends MoodyObject{

    @Override
    public String getMood() {
        return "sad";
    }

    @Override
    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    public void expressFeelings(){
        System.out.printf("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    //returns message about self : “Subject cries a lot”
    public String toString(){
        return ("Subject cries a lot");
    }
}
