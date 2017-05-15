/*
 * @ author : Marzie Shafiee
 * 
 * @ ID : #40016801
 * 
 * Assignment #3 - Comp 228
 * 
 * */

public class Main {
	
	public static void main(String args[])
	  {
		//defining pattern array
		char pattern[] = {'a', 'b','c'};
		//defining target array
		char target[] = {'a', 'a', 'b', 'c', 'd', 'a', 'b','a', 'b', 'c', 'x', 'y', 'a','b', 'c', 'e', 'a', 'b', 'c'};
		
		//pattern length
		int m = 2 ;
		//target length
		int n = 18 ;
		//defining stack array
		int stack[] = new int[5];
		//setting the first index of stack to -1
		int top = -1;
		//defining a register for max length of pattern
		int patternMaxInteger_reg = m;
		//defining a register for max length of target
		int targetMaxInteger_reg = n;
		
		//set all registers to 0
		int i_reg = 0; //target 
		int j_reg = 0; //pattern
		int k_reg = i_reg;
		
		//while target not exhausted
		while(i_reg <= targetMaxInteger_reg){
			j_reg = 0;
			k_reg = i_reg;

			int p_reg = pattern[j_reg]; //load
			int t_reg = target[i_reg]; //load
			
			//while characters match
			while (p_reg == t_reg){
				
				//if pattern exhausted
				if(j_reg == patternMaxInteger_reg ){
					top++;
					stack[top] = i_reg; //store
					break;
				}
				
				//if target exhausted
				if(k_reg == targetMaxInteger_reg){
					break;
				}
				
				k_reg++;
				j_reg++;
				
				p_reg = pattern[j_reg];
				t_reg = target[k_reg];
			}
				i_reg++;
		}
		
		//printing the result
		if (top == -1){
			System.out.println("The pattern was not found.\n");
		}else{
			System.out.println("The pattern found " + (top+1) + " time(s)\n");
			System.out.print("at position(s): ");
			for(int j = 0; j < stack.length; j++){
				System.out.print(stack[j] + " ");
			}
		}
	  }
}
/*
 * The pattern found 4 time(s)
 * 
 * at position(s): 1 7 12 16 0 
 */
