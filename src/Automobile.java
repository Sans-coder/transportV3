

public class Automobile extends Land{

    public Automobile(){}
    public Automobile(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Automobile!!");
    }
    public void show()
    {
        super.show();
    }
}