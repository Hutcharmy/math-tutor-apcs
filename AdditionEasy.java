import java.util.Random;
public class AdditionEasy extends Operation {
	Random rand=new Random();
	public AdditionEasy() {
		super(10);
	}
	public void getQuestion(){
		num1=rand.nextInt(6);
		num2=rand.nextInt(6);
		return;
	}
	public int getAnswer() {
		ans=num1+num2;
		return ans;
	}
	public String displayQuestion(){
		return "What is "+num1+" + "+num2+"?";
	}
	public boolean test(int testVal) {
		if(testVal==this.ans){
			return true;
		}
		else{
			return false;
		}
	}
	private int num1;
	private int num2;
	private int ans;
	@SuppressWarnings("unused")
	private int points;
}
