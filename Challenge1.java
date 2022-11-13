import java.util.*;
import javax.swing.*;

public class Challenge1 {

	public static void main(String[] args) {
	
	//Método 2.a
	Scanner entry = new Scanner (System.in);
	
	String tipo = JOptionPane.showInputDialog("Choose the type of number: A or B");	
	
	Challenge1 numb = new Challenge1();
	
	numb.generateNumber(tipo);
	
	//Método 2.b
	
	//System.out.println("Write a capital letter");
	
	String color = JOptionPane.showInputDialog("Write a color");
	
	Challenge1 col = new Challenge1();
	
	col.verifyColor(color);
		
	}
 //Punto 2.a:
	
	public void generateNumber (String type) {
		
		String A = "54";
		String B = "08";
		int upperbound = 99999999, lowerbound=10000000;
		String finalnumber="";
			
		
		if(type.equalsIgnoreCase("A")) {
			
		Random rand = new Random ();
		
		int num=lowerbound+rand.nextInt(upperbound);
		
		String randNum=String.valueOf(num);
		
		finalnumber=A+randNum;
		
		JOptionPane.showMessageDialog(null,"Your random number of Type A is: " + finalnumber);
			
		}
		else if (type.equalsIgnoreCase("B")){
			
		Random rand = new Random ();
			
		int num=lowerbound+rand.nextInt(upperbound);
			
		String randNum=String.valueOf(num);
			
		finalnumber=B+randNum;
		
		JOptionPane.showMessageDialog(null,"Your random number of Type B is: " + finalnumber);	
					
		}
		else {
			JOptionPane.showMessageDialog(null,"You put an incorrect letter");
			
		}
		
	}
	
	//Punto 2.b
	
	public void verifyColor(String input) {
		
		boolean verColor;
		
		List<String> Colors = new ArrayList<String>();
		
		Colors.add("yellow");
		Colors.add("green");
		Colors.add("red");
		Colors.add("blue");
		Colors.add("purple");
			
			 if(Colors.contains(input.toLowerCase())){
				
				 verColor=false;
				 JOptionPane.showMessageDialog(null,"The color is available "+ "(" + verColor + ")");
		
			}
			else {
				verColor=true;
				JOptionPane.showMessageDialog(null,"The color is not available "+ "(" + verColor + ")");			
			} 
	}
				
}

