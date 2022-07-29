package strategy.robot;
/**
 * @author ksd49
 * ��Ʈ��Ƽ�� ���� ( Strategy Pattern )
 * �� ������ Ŭ������ ĸ��ȭ�Ͽ� �������� ������ �����Ӱ� �ٲ� �� �ְ� ���ִ� ����
 *    - ���� ������ �ذ��ϴ� ���� �˰����� Ŭ�������� ĸ��ȭ �Ǿ� �ְ� �̵��� �ʿ��� �� ��ü�� �� �ֵ��� �����ν�
 *      ������ ������ �ٸ� �˰������� �ذ��� �� �ְ� �ϴ� ������ ����.
 *    - ��, ������ ���� �ٲܼ� �ֵ��� ���ִ� ������ ����
 *    - ���� �ɸ���ó�� �����̳� �ൿ�� �ϴ� ����� �ٲٰ� ������ �����ϴ�.
 * �� ������ �����ϴ� �۾�
 * 	  - strategy : �������̽��� �߻�Ŭ������ �ܺο��� ������ ������� �˰����� ȣ���ϴ� ����� ���
 * 	  - concreteStrategy : ��Ʈ��Ƽ�� ���Ͽ��� ����� �˰����� ������ ������ Ŭ����
 *    - context : ��Ʈ��Ƽ�� ������ �̿��ϴ� ������ �����Ѵ�.
 *                �ʿ信 ���� �������� ��ü���� ������ �ٲ� �� �ֵ��� Setter�޼��带 �����Ѵ�.
 * �� Robot Ŭ���� -> MovingStrategy / AttackStrategy �޼��带 ��ӹ޾� ��ü���� �κ��� ����
 * �� Atom, TaekwonV Ŭ���� -> Robot(abstract)�� ��ӹ޾� ��ü�� �ִ� �κ��� ����
 * �� AttackStrategy -> PunchStrategy / MissileStrategy ��Ӱ� ��ü����
 * �� MovingStrategy -> WalkingStrategy / FlyingStrategy ��Ӱ� ��ü����
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
