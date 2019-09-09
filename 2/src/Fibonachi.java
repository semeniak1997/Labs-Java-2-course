
public class Fibonachi {
	public static int f(int index) {
		if(index <=0){
		return 0;}
		else if (index==1){
			return 1;}
		else if (index == 2) {
            return 1;
        } else {
            return f(index - 1) + f(index - 2);
        }
    
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for (int i = 1; i <=n; i++){
			System.out.print(f(i) + " ");
	}

}
}