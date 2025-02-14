package MarioItem;


public class Item {
    protected String name;
    protected boolean appear;
    protected int[] location = new int[]{0,0};

    

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getAppear(){
        return this.appear;
    }

    public void setAppear(boolean appear){
        this.appear = appear;
        if(this.appear= true){
            System.out.println("Set item "+getName()+" to appear");
        }else{
            System.out.println("Set item "+getName()+" to disappeared");
        }
    }
    public int[] getLocation(){
        return this.location;
    }

    public void setLocation(int[] location){
        this.location = location;
    }

    public void show(){
        setAppear(true);
        System.out.println("Block is cracking, "+name+" is appearing");
        
    }

    public void run(){
        if(this.appear ){
            System.out.println(" "+name+" is at, "+location);
        }else{
            System.out.println(" "+name+" is disappeared");
        }
    }
}
