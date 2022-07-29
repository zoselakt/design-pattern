package strategy.robot;
/**
 * @author ksd49
 * 스트래티지 패턴 ( Strategy Pattern )
 * ● 행위를 클래스로 캡슐화하여 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴
 *    - 같은 문제를 해결하는 여러 알고리즘이 클래스별로 캡슐화 되어 있고 이들이 필요할 때 교체할 수 있도록 함으로써
 *      동일한 문제를 다른 알고리즘으로 해결할 수 있게 하는 디자인 패턴.
 *    - 즉, 전력을 쉽게 바꿀수 있도록 해주는 디자인 패턴
 *    - 게임 케릭터처럼 공격이나 행동을 하는 방식을 바꾸고 싶을때 유용하다.
 * ● 역할이 수행하는 작업
 * 	  - strategy : 인터페이스나 추상클래스로 외부에서 동일한 방식으로 알고리즘을 호출하는 방법을 명시
 * 	  - concreteStrategy : 스트래티지 패턴에서 명시한 알고리즘을 실제로 구현한 클래스
 *    - context : 스트래티지 패턴을 이용하는 역할을 수행한다.
 *                필요에 따라 동적으로 구체적인 전략을 바꿀 수 있도록 Setter메서드를 제공한다.
 * ● Robot 클래스 -> MovingStrategy / AttackStrategy 메서드를 상속받아 구체적인 로봇을 만듬
 * ● Atom, TaekwonV 클래스 -> Robot(abstract)를 상속받아 실체가 있는 로봇을 만듬
 * ● AttackStrategy -> PunchStrategy / MissileStrategy 상속과 실체구현
 * ● MovingStrategy -> WalkingStrategy / FlyingStrategy 상속과 실체구현
 */
public class StrategyTest {
	public static void main(String[] args) {
		Robot taekwonV = new TeakwonV("TeakwonV");
		Robot atom = new Atom("Atom");
		
		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());
		
		atom.setMovingStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new PunchStrategy());
		
		System.out.print("My name is" + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println("");
		
		atom.move();
		atom.attack();
	}
}
