import java.util.Random;

// 17
public class Coin {
    private int faceUp;
    Random rand = new Random();

    Coin () {
        this.faceUp = 1;
    }

    public int getFaceUp() {
        return faceUp;
    }

    public void flip(){
        faceUp = rand.nextInt(0,2);
    }
}
