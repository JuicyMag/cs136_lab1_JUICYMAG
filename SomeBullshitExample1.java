import java.util.Scanner; 

public class SomeBullshitExample1 {

	String[] sequence ; //storage 
	int next; // next available place to put values 
	final int INIT_SZ = 5; 
 	


 	public SomeBullshitExample1(){
 		sequence = new String[INIT_SZ];
 		next = 0 ; 

 	}
 	public String toString(){
 		String s = "";
 		for(int i = 0; i< next; i++){
 			s += sequence[i]; 
 		}
 	}
 	
	public static boolean prompt(Scanner sc, SomeBullshitExample1 bs){

		System.out.print("Enter a word (or exit to quit)"); 
		String word = sc.next(); 

		if(word.equals("exit")){ //have to use .equals for string comparison
			return false ; 
		} else {
			bs.append(word); 
		}


	}
	public void append(String word){
		sequence[next]= word ; 
		next++ ;

	}

		public static void main(String[] args){
			
			 // new scanner, used for input 
			Scanner sc = new Scanner(System.in) ; 
			//SomeBullshitExample1 bs = new SomeBullshitExample1();

			// while(sc.getString() != "exit" || "EXIT" || "Exit"){
			 	// add word to bs
			 	//function, prompts user, if exit => return false, otherwise adds word to bs
			 	// returns true

			// }


		}
	
	//class
		// instance variables 


	//constructor 
		//public Foo () {}

	//instanc emethods 

	//static methods





}