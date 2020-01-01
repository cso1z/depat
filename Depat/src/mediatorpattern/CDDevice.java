package mediatorpattern;

/*
 * ����ͬ��
 */
public class CDDevice extends Colleague {
	private String data;// ��Ƶ����

	public CDDevice(Mediator mediator) {
		super(mediator);
	}
	/*
	 * ��ȡ��Ƶ����
	 */
	public String read(){
		return data;
	}
	/*
	 * ������Ƶ����
	 */
	public void load(){
		//ʵ���������Ƶ��������Ƶ���ݶ���һ����������
		data="��Ƶ����,��Ƶ����";
		//֪ͨ�н��� Ҳ�����������ݸı�
		mediator.changed(this);
	}
 }
