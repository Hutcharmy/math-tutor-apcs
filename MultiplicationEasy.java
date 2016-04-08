import java.util.Random;

public class MultiplicationEasy extends Operation {
	Random rand=new Random();
	public MultiplicationEasy(int k){
		super(10, k);
	}
	@Override
	public void generateQuestion() {
		while(true){
			num1=rand.nextInt(6);
			num2=rand.nextInt(6);
			if(num2<=num1){
				return;
			}
		}
	}	
	@Override
	public void generateAnswer() {
		ans=num1*num2;
		return;
	}

	@Override
	public String displayQuestion() {
		
		return "What is "+num1+" x "+num2+"?";
	}
	private int num1;
	private int num2;
	@SuppressWarnings("unused")
	private int ans;
	@SuppressWarnings("unused")
	private int points;
}
