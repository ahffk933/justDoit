package service;

import java.util.Scanner;

import vo.UserVO;
import dao.UserDao;

public class UserServiceImpl {
	private static UserServiceImpl instance;
	private UserSercviceImpl(){}
	public static UserServiceImpl getInstance(){
		if(instance == null){
			instance = new UserServiceImpl();
		}
		return instance;
	}
	UserDao userDao = UserDaoImpl.getInstance();
	
	@Override
	public void join(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("id : ");
		String id = s.nextLine();
		System.out.println("pw : ");
		String password = s.nextLine();
		System.out.println("name : ");
		String name = s.nextLine();
		
		UserVO user = new UserVO();
		
		user.setId(id);
		user.setPassword(password);
		user.setName(name);
		
		UserVO userCheck = userDao.SelectUser("ID", user.getId());
		
		if(userCheck == null){
			userDao.insertUser(user);
			System.out.println("가입 땡스");
		}else{
			System.out.println("아디 중복");
		}
		
	}
	@Override
	public void login(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("id");
	}
	
	
	
	

}
