package visitorpattern;

//CTO����עԱ���ڼ�������Ĺ���
public class CTOVisitor implements Visitor {

	@Override
	public void visit(Engineer engineer) {
		System.out.println("����ʦ�� " + engineer.name + ",���������� "
				+ engineer.getCodeLines());
	}

	@Override
	public void visit(Manager leader) {
		System.out.println("���� " + leader.name + ",��Ʒ������"
				+ leader.getProducts());
	}

}
