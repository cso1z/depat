package visitorpattern;

public class Client {
	public static void main(String[] args) {
		// ��������
		BusinessReport report = new BusinessReport();
		System.out.println("============��CEO���ı���===========");
		// ���÷����ߣ�������CEO
		report.showReport(new CEOVisitor());
		System.out.println("===========��CTO���ı���===========");
		// ע����һ��������CTO
		report.showReport(new CTOVisitor());
	}
}
