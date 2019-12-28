package controller;

import java.util.Scanner;

public class controller {
	UserService userService = UserServiceImpl.getInstancew();
	
	public static void main(String[] args){
		
		new Controller().begin();
	}
	private void begin(){
		Scanner s = new Scanner(System.in);
		int menu;
		
		do{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu){
			case 1:
				userService.join();
				break;
			case 2:
				userService.userList();
				break;
			case 3:
				userService.userList();
				break;
			case 0:
				System.out.println("exit program");
				break;
				
								
			}
		}while(menu !=0);
	}
	

}
