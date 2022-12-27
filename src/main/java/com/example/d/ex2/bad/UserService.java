package com.example.d.ex2.bad;

public class UserService {

    UserJDBCDAOImpl dao = new UserJDBCDAOImpl(); // tipo concreto - alto acoplamiento
    
    void findOne(Long id) {
    	
    	// dao.findOne(Long id);
    	
    }
}
