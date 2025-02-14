package MarioItem;
import java.util.Arrays;

public class Mushroom extends Item {

    public Mushroom() {
        setName("Mushroom");
    }

    public void run(int[] newLocation) {
        setLocation(newLocation);
        run();
    }

    public void run() {
        if(this.appear) {
            System.out.println(" " + name + " is at, " + Arrays.toString(location) + " " + name + " is running");
        } else {
            System.out.println(" " + name + " is disappeared");
        }
    }
    
}
