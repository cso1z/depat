package templatemethod;

public class MilitartComputer extends AbstractComputer {
 
	@Override
	protected void checkHardware() {
		super.checkHardware();
		System.out.println("���Ӳ������ǽ");
	}
 

	@Override
	protected void login() {
		System.out.println("����ָ��ʶ��ȸ������û���֤");
	}

}
