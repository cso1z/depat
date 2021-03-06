package visitorpattern;

import java.util.Random;

//员工基类
public abstract class Staff {
	public String name;
    //员工kpi
	public int kpi;

	public Staff (String aName){
		this.name=aName;
		kpi=new Random().nextInt(10);
	}
	 
	//接受访Visitor的访问者
	public abstract void accept(Visitor visitor);
}
