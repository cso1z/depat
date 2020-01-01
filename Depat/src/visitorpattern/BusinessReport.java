package visitorpattern;

import java.util.LinkedList;
import java.util.List;
//员工业务报表
public class BusinessReport {

	List<Staff> mStaffs=new LinkedList<Staff>();
	public BusinessReport() {
		mStaffs.add(new Manager("王经理"));
		mStaffs.add(new Engineer("工程师-gong1"));
		mStaffs.add(new Engineer("工程师-gong2"));
		mStaffs.add(new Engineer("工程师-gong3"));
		mStaffs.add(new Engineer("工程师-gong4"));
		mStaffs.add(new Engineer("工程师-gong5"));
	}
	/*
	 * 为访问者展示报表
	 */
	public void showReport(Visitor visitor){
		for (Staff staff : mStaffs) {
			staff.accept(visitor);
		}
	}
}
