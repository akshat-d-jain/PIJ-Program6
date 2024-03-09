// Name - Akshat D Jain
// PRN - 22070126136
// Batch - AIML B3
public class Main {
    public static void main(String[] args) {
        // Create and set behaviors for RubberDuck
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehaviour(new FlyNoWay());
        rubberDuck.setQuackBehaviour(new Squeak());
        rubberDuck.setSwimBehaviour(new swim());
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();

        // Create and set behaviors for RedHeadDuck
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.setFlyBehaviour(new FlyWings());
        redHeadDuck.setQuackBehaviour(new Quack());
        redHeadDuck.setSwimBehaviour(new swim());
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();

        // Create and set behaviors for MalardDuck
        MalardDuck malardDuck = new MalardDuck();
        malardDuck.setFlyBehaviour(new FlyWings());
        malardDuck.setQuackBehaviour(new Quack());
        malardDuck.setSwimBehaviour(new swim());
        malardDuck.display();
        malardDuck.performFly();
        malardDuck.performQuack();
        malardDuck.performSwim();
    }
}
