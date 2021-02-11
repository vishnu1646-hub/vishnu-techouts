package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssociationForMany {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
	    List traineeNames=new ArrayList<>();
	    List studyMaterials1=new ArrayList<>();
	    
	    System.out.println("enter trainee name:");
	    String s=scanner.nextLine();
	    traineeNames.add(s);
	    System.out.println("enter the number of books required:");
    	int x=scanner.nextInt();
    	studyMaterials1.add(x);


	    for (int i = 0; i <traineeNames.size(); i++) {
	    	
	       	    	Trainee trainee=new Trainee(s);
	       	    	System.out.print(trainee.reading()+" reads number of books:");

	    	       	for (int j = 0; j <studyMaterials1.size(); j++) {
	    	       	 StudyMaterial studyMaterial=new StudyMaterial(x);
	    	       	 System.out.println(studyMaterial.materials());

	
					}
	    	 
	 		  	 		      
	 		

	    	
			
		}
//		Trainee trainee=new Trainee("balaji");
//		Trainee trainee1=new Trainee("pavan");
//		StudyMaterial studyMaterial=new StudyMaterial(12);
	   		//System.out.println(trainee.reading()+" is reading "+studyMaterial.materials()+" number of books");
	}

}
