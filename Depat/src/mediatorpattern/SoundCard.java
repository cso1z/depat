package mediatorpattern;

public class SoundCard extends Colleague{

	public SoundCard(Mediator mediator) {
		super(mediator);
	}
/*
 * ������Ƶ
 */
	public void soundPlay(String d){
		System.out.println("��Ƶ�� "+d);
	}
}
