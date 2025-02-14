package MarioItem;
public class App extends Item {
    public static void main(String[] args) throws Exception {
       Mushroom m1 = new Mushroom();
       Starman s1 = new Starman();
       Firepower f1 = new Firepower(); 
       m1.setAppear(true);
       s1.setAppear(false);
       m1.show();
       s1.run(new int[]{10 ,10});
       System.out.println("Mushroom location is " + m1.getLocation()[0] + "," + m1.getLocation()[1]);
       m1.run(new int[]{5, 0});
    }
}
