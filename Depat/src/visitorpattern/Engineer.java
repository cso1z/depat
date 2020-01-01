package visitorpattern;

import java.util.Random;
//����ʦ
public class Engineer extends Staff {

	public Engineer(String aName) {
		super(aName);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	// ����ʦһ��
	public int getCodeLines() {
		return new Random().nextInt(10 * 10000);
	}
}
