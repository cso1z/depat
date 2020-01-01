package visitorpattern;

import java.util.Random;

//Ա������
public abstract class Staff {
	public String name;
    //Ա��kpi
	public int kpi;

	public Staff (String aName){
		this.name=aName;
		kpi=new Random().nextInt(10);
	}
	 
	//���ܷ�Visitor�ķ�����
	public abstract void accept(Visitor visitor);
}
