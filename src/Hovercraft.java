
public class Hovercraft extends Sea{

    public Hovercraft(){}
    public Hovercraft(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Hovercraft!!!");
    }
    public void show()
    {
        super.show();
    }
}