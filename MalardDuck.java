public class MalardDuck extends Duck{
    public MalardDuck(){
        quackBehaviour=new Quack();
        flyBehaviour=new FlyWings();
        swimBehaviour= new Drown();

    }
    void display(){
        System.out.println("This is MalardDuck Duck......");

    }
}
