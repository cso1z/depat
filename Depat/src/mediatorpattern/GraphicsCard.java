package mediatorpattern;

public class GraphicsCard extends Colleague{

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}
/*
 * ������Ƶ
 */
	public void videoPlay(String data){
		System.out.println("��Ƶ: "+data);
	}
}
