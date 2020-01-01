package mediatorpattern;
/*
 * 抽象同事类
 */
public abstract class Colleague {
	protected Mediator mediator;// 每一同事都该知道其中介者

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}
