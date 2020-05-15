

public class Ship extends Sea{


    public Ship(){}
    public Ship(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Ship!!");
    }
    public void show()
    {
        super.show();
    }
}