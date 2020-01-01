package templatemethod;

public class Test {
	public static void main(String[] args) {
         AbstractComputer computer=new CoderComputer();
         computer.startUp();
         computer=new MilitartComputer();
         computer.startUp();
	}
}
