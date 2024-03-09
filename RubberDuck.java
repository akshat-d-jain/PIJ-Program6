public class RubberDuck extends Duck{

    public RubberDuck()
    {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    void display()
    {
        System.out.println("This is Rubber Duck");
    }
}
