package strategy.duck;

public class MallardDuck extends Duck{
	public MallardDuck() {
		flyBehavior = new FlywithWings();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("청둥오리 입니다~");
	}
}
