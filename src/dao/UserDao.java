package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.UserVO;

public interface UserDao {
	
	UserVO SelectUser(String key, String value);
	void insertUser(UserVO user);
	UserVO SelectUser(HashMap<String, String> param);
	ArrayList<UserVO>SelectUserList();

}
