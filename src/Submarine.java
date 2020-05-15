


public class Submarine extends Sea{

    public Submarine(){}
    public Submarine(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Submarine!!");
    }
    public void show()
    {
        super.show();
    }
}