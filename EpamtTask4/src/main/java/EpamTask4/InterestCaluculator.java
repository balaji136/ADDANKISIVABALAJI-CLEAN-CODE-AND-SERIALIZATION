package EpamTask4;
import java.util.*;

class Interest{
	int principle;
	int time;
	int rate_of_interest;
	Interest(int principle,int time,int rate_of_interest){
		this.principle=principle;
		this.time=time;
		this.rate_of_interest=rate_of_interest;
	}
	double simpleInterestCaluculator(){
		return((principle*time*rate_of_interest)/100);
	}
	double compoundInterestCaluculator(){
		return((principle*Math.pow((1+(rate_of_interest/100)),time))-principle);
	}

}
public class InterestCaluculator{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		int principle=scanner.nextInt();
		int time=scanner.nextInt();
		int rate_of_interest=scanner.nextInt();
		/*caluculate          input
		  simple Interest     simple
		  compound Interest   compound
		 */
		String userChoiceToCaluculate=scanner.next();
		Interest interest=new Interest(principle,time,rate_of_interest);
		double simple_interest;
		double compound_interest;
		if("simple".equalsIgnoreCase(userChoiceToCaluculate)) 
		     simple_interest = interest.simpleInterestCaluculator();
		else
			 compound_interest = interest.compoundInterestCaluculator();
		scanner.close();
	}
}


