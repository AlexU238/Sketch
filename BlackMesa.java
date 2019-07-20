import java.util.Arrays;
import java.util.Scanner;

public abstract class BlackMesa {
	static boolean flg=true;
	
	static Scanner in = new Scanner(System.in);
	static void menu(int a) {
		
		switch(a) {
		case 1:
			showAllDepartments();
			break;
		case 2:
			showAllActiveDepartments();
			break;
		case 3:
			System.out.println("������ ����� �����, �� � ���");
			showDepartmentInfo(in.nextLine().toUpperCase());
			break;
		case 4:
			System.out.println("������ ����� �����, �� � ���, �� �����");
			addWorkers(in.nextLine().toUpperCase(), in.nextInt());
			break;
		case 5:
			System.out.println("������ ����� �����, �� � ���, �� �����");
			removeWorkers(in.nextLine().toUpperCase(), in.nextInt());
			break;
		case 6:
			System.out.println("������ ����� �����, �� � ���, �� �����");
			addMoney(in.nextLine().toUpperCase(), in.nextInt());
			break;
		case 7:
			System.out.println("������ ����� �����, �� � ���, �� �����");
			removeMoney(in.nextLine().toUpperCase(), in.nextInt());
			break;
		case 8:
			System.out.println("������ ����� �����, �� � ���");
			activateDepartment(in.nextLine().toUpperCase());
			break;
		case 9:
			System.out.println("������ ����� �����, �� � ���");
			deActivateDepartment(in.nextLine().toUpperCase());
			break;
		default:
			System.out.println("EXITING...");
			flg=false;
			break;
		}
	}
	
	private static void showAllDepartments() {
		for(int i=0; i<Department.values().length; ++i) {
				System.out.println(Department.values()[i].getTitle());
		}
	}
	

	private static void showAllActiveDepartments() {
		for(int i=0; i<Department.values().length; ++i) {
			if(Department.values()[i].isActive()){
				System.out.println("�������� --> "+Department.values()[i].getTitle());
			}
			else {
				System.out.println("�� �������� --> "+Department.values()[i].getTitle());
			}		
		}
	}
	
	private static void showDepartmentInfo(String s) {
		System.out.println("����� � ��� == "+Department.valueOf(s).name()+"\n"
	+"����� == "+Department.valueOf(s).getTitle()+"\n"
		+"��������� == "+Department.valueOf(s).getCommentary()+"\n"
		+"������ == "+Department.valueOf(s).getMoney()+"\n"
		+"ʳ������ ���������� == "+Department.valueOf(s).getWorkers()+"\n"
		+"�������� == "+Department.valueOf(s).isActive()+"\n");
	}
	
	private static void addWorkers(String s, int w) {
		Department.valueOf(s).setWorkers(Department.valueOf(s).getWorkers()+w);
		System.out.println(Department.valueOf(s).getTitle()+" ��������� �� "+w+" ����������");
	}
	
	private static void removeWorkers(String s, int w) {
		Department.valueOf(s).setWorkers(Department.valueOf(s).getWorkers()+w);
		System.out.println(Department.valueOf(s).getTitle()+" ��������� �� "+w+" ����������");
	}
	
	private static void addMoney(String s, int m) {
		Department.valueOf(s).setMoney(Department.valueOf(s).getMoney()+m);
		System.out.println(Department.valueOf(s).getTitle()+" �������� �� "+m+" $");
	}
	
	private static void removeMoney(String s, int m) {
		Department.valueOf(s).setMoney(Department.valueOf(s).getMoney()-m);
		System.out.println(Department.valueOf(s).getTitle()+" �������� �� "+m+" $");
	}
	
	private static void activateDepartment(String s) {
		if(!Department.valueOf(s).isActive()) {
			Department.valueOf(s).setActive(true);
		}
		else
			System.out.println("³��� ��������");
	}
	
	private static void deActivateDepartment(String s) {
		if(Department.valueOf(s).isActive()) {
			Department.valueOf(s).setActive(false);
		}
		else
			System.out.println("³��� �� ��������");
	}
	
	
}
