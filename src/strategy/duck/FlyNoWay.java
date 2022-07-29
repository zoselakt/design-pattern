package strategy.duck;

public class FlyNoWay implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("fly fly~");
	}
}