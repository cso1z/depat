package templatemethod;

public abstract class AbstractComputer {
	protected void powerOn() {
		System.out.println("������Դ");
	}

	protected void checkHardware() {
		System.out.println("Ӳ�����");
	}

	protected void loadOS() {
		System.out.println("�������ϵͳ");
	}

	protected void login() {
		System.out.println("С�׵ļ��������֤��ֱ�ӽ���ϵͳ");
	}

	/*
	 * �������������������̶�δ������Դ��ϵͳ��顢���ز���ϵͳ���û���¼���÷���Ϊfinal�� ��ֹ�㷨��ܱ���д
	 */
	public final void startUp() {
		System.out.println("-----���� START-------");
		powerOn();
		checkHardware();
		loadOS();
		login();
		System.out.println("----����END------");
	}
}
