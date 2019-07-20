import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(BlackMesa.flg) {
			System.out.println("¡¿«¿:\n"+Arrays.toString(Department.values()));
			BlackMesa.menu(in.nextInt());
		}
		
		//BlackMesa.menu(3);
}
}
