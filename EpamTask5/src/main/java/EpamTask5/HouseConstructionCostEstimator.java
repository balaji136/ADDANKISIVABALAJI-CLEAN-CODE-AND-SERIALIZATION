package EpamTask5;
import java.util.*;
class HouseConstructionCost{
	float squareFeet;
	HouseConstructionCost(float squareFeet){
		this.squareFeet=squareFeet;
	}
	double standardMaterial(){
		return(squareFeet*1200);
	}
	double aboveStandardMaterial(){
		return(squareFeet*1500);
	}
	double highStandardMaterial(boolean fullyAutomation){

        if(fullyAutomation){
        	return(squareFeet*2500);
        }
        else{
        	return(squareFeet*1800);
        }
	}

}
class HouseConstructionCostEstimator{
	public static void main(String[] args){
		/*materaial standard    input_to_given
		  standard material     s
		  above standard        a
		  high standard         h
		  fully aumation        m
		*/
		  Scanner scanner=new Scanner(System.in);
		  boolean fullyAutomation=false;
		  float squareFeet=scanner.nextFloat();
		  char materialStandard=scanner.next().charAt(0);
		  double houseMaterialCost;
		  HouseConstructionCost houseConstructionCost=new HouseConstructionCost(squareFeet);
		  if(materialStandard=='h'){
              materialStandard=scanner.next().charAt(0);
              if(materialStandard=='m')
              	fullyAutomation=true;
            houseMaterialCost=houseConstructionCost.highStandardMaterial(fullyAutomation);
		  }
		  else if(materialStandard=='s')
		  	houseMaterialCost=houseConstructionCost.standardMaterial();
		  else if(materialStandard=='a')
		  	houseMaterialCost=houseConstructionCost.aboveStandardMaterial();
		  else
		  	System.exit(1);//unsuccessful


     scanner.close();

	}
}



