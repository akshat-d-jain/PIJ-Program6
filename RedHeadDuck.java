public class RedHeadDuck extends Duck{

    public RedHeadDuck()
    {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWings();
    }

    void display(){
        System.out.println("This is RedHead Duck");
    }
}
