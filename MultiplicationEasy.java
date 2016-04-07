import java.util.Random;

public class MultiplicationEasy extends Operation {
	Random rand=new Random();
	public MultiplicationEasy(){
		super(10);
	}
	@Override
	public void getQuestion() {
		while(true){
			num1=rand.nextInt(6);
			num2=rand.nextInt(6);
			if(num2<=num1){
				return;
			}
		}
	}	
	@Override
	public int getAnswer() {
		ans=num1*num2;
		return 0;
	}
	@Override
	public boolean test(int testVal) {
		if(testVal==ans){
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public String displayQuestion() {
		
		return "What is "+num1+" x "+num2+"?";
	}
	private int num1;
	private int num2;
	private int ans;
	@SuppressWarnings("unused")
	private int points;
}
