package com.login_system.persistence;

import java.util.ArrayList;
import java.util.List;

import com.login_system.model.UserBean;

public class UserDAO extends DAO{
	public static void main(String[] args) {
		try {
			UserDAO userDAO = new UserDAO();
			for(UserBean user : userDAO.findAll()) {
				System.out.println(user.toString());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public List<UserBean> findAll() throws Exception {
		List<UserBean> list = new ArrayList<>();
		
		try {
			openConnection();
			statement = connection.prepareStatement("SELECT u.id, u.username, p.firstname, p.lastname, p.email, bio FROM tb_user u JOIN tb_profile p ON p.id_user_fk = u.id");
			result = statement.executeQuery();
			while(result.next()) {
				UserBean user = new UserBean();
				user.setId(result.getInt("u.id"));
				user.setUsername(result.getString("u.username"));
				list.add(user);
			}
		}finally {
			closeConnection();
		}
		return list;
	}	
	
}
