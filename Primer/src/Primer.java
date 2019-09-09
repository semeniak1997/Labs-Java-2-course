
public class Primer {
	
	     public static void main(String[] args){
	            int N = 5;
	            short matr[][] = new short[N][N];
	            
	            for(int i = 0; i < matr.length; i++){
	                for(int j = 0; j < matr[i].length; j++){
	                 matr[i][j] = (short)(Math.random()*100);
	                }
	            }
	            
	            for(int i = 0; i < matr.length; i++){
	                for(int j = 0; j < matr[i].length; j++){
	                        System.out.print(matr[i][j] + "\t");
	                }
	                System.out.println();
	            }
	            
	          for(int i = 0; i < N; i++){
	            for(int l = 0; l < N - 1; l++){
	                if(matr[1][l + 1] < matr[1][l]){
	                    for(int j = 0; j < N; j++){
	                        short temp = matr[j][l];
	                        matr[j][l] = matr[j][l + 1];
	                        matr[j][l + 1] = temp;
	                    }
	                }
	            }       
	          }
	            
	            System.out.println("-----------------------");
	            
	            for(int i = 0; i < matr.length; i++){   
	                for(int j = 0; j < matr[i].length; j++){
	                    System.out.print(matr[i][j] + "\t");
	                }
	            System.out.println();
	        }   
	     
	     
	            }
	     }

