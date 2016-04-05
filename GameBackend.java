import java.util.ArrayList;
public class GameBackend {
	public static void game(ArrayList<Operation> modules, ArrayList<Integer> times){
		for(int i=0;i<modules.size();i++){//will run all modules in order
			for(int j=0; j<times.get(i);j++){//will run a module as many times as user specifies
				int points=0;
				Operation currentModule = modules.get(i);//new address to make typing easier
				while(points<currentModule.getPoints()){//actual game with this module starts here
					//Tell them how may points they have
					currentModule.getQuestion();
					currentModule.getAnswer();
					//Within the ui we do currentModule.displayQuestion();
					//Ask for answer
					int ans=0;//some value they enter
					boolean correct=currentModule.test(ans);
					if(correct){
						//Tell them they got it right
						points++;
					}
					else{
						//Tell them they got it wrong
						//Either another try or the correct answer, we'll decide
					}
				}
			}
		}
	}
}
