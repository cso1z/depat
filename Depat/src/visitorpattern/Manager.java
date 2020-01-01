package visitorpattern;

import java.util.Random;
//经理类型
public class Manager extends Staff {
	private int products;// 产品数量

	public Manager(String aName) {
		super(aName);
		products=new Random().nextInt(10);
	}

 
 
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
 
	public int getProducts(){
		return products;
	}

}
