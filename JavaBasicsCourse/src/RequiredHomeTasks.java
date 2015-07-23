	/**
	 * @author Savchuk Yuriy
	 *
	 * Goal: get numbers of required tasks from 56 total.
	 */
	public class RequiredHomeTasks {

		public static void main(String[] args) {
			char first = 'S';
			int x = first%4;
			System.out.print("Numbers of required tasks: ");
			for (int i = 1; i <= 56; i++){
				if (i%4 == x){
					System.out.print(i + " ");
				}
			}
		}

	}
   /* Result output: 
    * Numbers of required tasks: 3 7 11 15 19 23 27 31 35 39 43 47 51 55  
    */
	