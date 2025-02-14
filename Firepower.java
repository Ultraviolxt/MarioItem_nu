package MarioItem;
import java.util.Arrays;

public class Firepower extends Item {

    public Firepower() {
        setName("Firepower");
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
