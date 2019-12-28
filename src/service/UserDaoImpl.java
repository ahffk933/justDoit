package service;

import vo.UserVO;
import dao.UserDao;
import data.Database;

public class UserDaoImpl implements UserDao{
	private static UserDaoImpl instance;
	
	private UserDaoImpl(){}
	public static UserDaoImpl getInstance(){
		if(instance == null){
			instance = new UserDaoImpl();
		}
		return instance;
	}
	Database database = Database.getInstance();
	@Override
	public UserVO SelectUser(String key, String value){
		for(int i = 0; i < database.tb_user.size(); i++){
			UserVO user = database.tb_user.get(i);
			
			if(key.equals("ID")){
				if(user.getId().equals(value)){
					return user;
				}
			}else if(key.equals("NAME")){
				if(user.getName().equals(value)){
					return user;
				}
			}
			
		}
		return null;
	}
	
	
	
	

}
