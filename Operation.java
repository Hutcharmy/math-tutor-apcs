import java.util.Random;

@SuppressWarnings("unused")
public abstract class Operation {
	public Operation(int point, int time){
		this.points=point;
		this.times=time;
	}
	public int getPoints(){
		return this.points;
	}
	public int getTimes(){
		return this.times;
	}
	public abstract void generateQuestion();
	public abstract void generateAnswer();
	public boolean test(int testVal) {
		if(testVal==this.ans){
			return true;
		}
		else{
			return false;
		}
	}
	public abstract String displayQuestion();
	private int num1;
	private int num2;
	private int ans;
	private int points;
	private int times;
}
