import java.util.Random;
public class AdditionEasy extends Operation {
	Random rand=new Random();
	public AdditionEasy(int k) {
		super(10,k);
		
	}
	public void generateQuestion(){
		num1=rand.nextInt(6);
		num2=rand.nextInt(6);
	}
	public void generateAnswer() {
		ans=num1+num2;
	}
	public String displayQuestion(){
		return "What is "+num1+" + "+num2+"?";
	}
	
	private int num1;
	private int num2;
	@SuppressWarnings("unused")
	private int ans;
	@SuppressWarnings("unused")
	private int points;
}
