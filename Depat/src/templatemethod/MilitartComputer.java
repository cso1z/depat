package templatemethod;

public class MilitartComputer extends AbstractComputer {
 
	@Override
	protected void checkHardware() {
		super.checkHardware();
		System.out.println("检查硬件防火墙");
	}
 

	@Override
	protected void login() {
		System.out.println("进行指纹识别等浮渣的用户验证");
	}

}
