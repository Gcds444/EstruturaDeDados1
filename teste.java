import java.util.Scanner; 
import java.util.Arrays; 
class Main {public static void main (String [] args){

	String [] v = new String [25];
	String name;
	int i;
	
		for (i =0; i < 25+5; i++){
			if (i == 25) {
				System.out.println(Arrays.asList(v));
				System.out.println("25o cadastro");
			}
		System.out.println("Nome Do Aluno");
		Scanner myObj = new Scanner(System.in);
		name = myObj.nextLine();  
		System.out.println("Username is: " + name);  
		v[i] = name;
		}
	}
}

