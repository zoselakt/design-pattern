package strategy.duck;

public class DuckTest {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.performFly();
	}
}
