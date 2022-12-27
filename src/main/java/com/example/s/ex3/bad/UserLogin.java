package com.example.s.ex3.bad;

public class UserLogin {

    // Está haciendo dos cosas: sacar de base de datos y enviar un email
    User login(String userName, String password) {
    	
        //User user = db.findUserByUserNameAndPassword(userName, password);
    	User user = new User();
        if (user == null) {
            // do something
        }
        // login process..
        this.sendEmail(user, "Successfull login");
        
        return user;
    }
    
    void sendEmail(User user, String msg) {
        // sending email to user
    	String email = user.getEmail();
    	// ....
    }
}
