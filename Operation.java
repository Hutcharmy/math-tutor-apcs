import java.util.Random;

@SuppressWarnings("unused")
public abstract class Operation {
	public Operation(int point){
		this.points=point;
	}
	public int getPoints(){
		return this.points;
	}
	public abstract void getQuestion();
	public abstract int getAnswer();
	public abstract boolean test(int testVal);
	public abstract String displayQuestion();
	@SuppressWarnings("unused")
	private int num1;
	@SuppressWarnings("unused")
	private int num2;
	@SuppressWarnings("unused")
	private int ans;
	private int points;
}
