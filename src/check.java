
public class check {
		
		public static void main(String[] args){
			//CHANGES NEW
			//GIT in Eclipse NEON
			int arrNum[] = new int[10];
			
			for(int i=0;i<10;i++){
				arrNum[i] = i;
			}
			arrNum[2] = 3000;
			for(int x : arrNum){
				System.out.println(x);				
			}
			
		}

}
