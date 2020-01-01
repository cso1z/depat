package visitorpattern;

import java.util.LinkedList;
import java.util.List;
//Ա��ҵ�񱨱�
public class BusinessReport {

	List<Staff> mStaffs=new LinkedList<Staff>();
	public BusinessReport() {
		mStaffs.add(new Manager("������"));
		mStaffs.add(new Engineer("����ʦ-gong1"));
		mStaffs.add(new Engineer("����ʦ-gong2"));
		mStaffs.add(new Engineer("����ʦ-gong3"));
		mStaffs.add(new Engineer("����ʦ-gong4"));
		mStaffs.add(new Engineer("����ʦ-gong5"));
	}
	/*
	 * Ϊ������չʾ����
	 */
	public void showReport(Visitor visitor){
		for (Staff staff : mStaffs) {
			staff.accept(visitor);
		}
	}
}
