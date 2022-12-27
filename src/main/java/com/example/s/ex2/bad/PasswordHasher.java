package com.example.s.ex2.bad;

/*
3 responsabilidades completamente distintas:
 - hash
 - save
 - notify
 */
public class PasswordHasher {

    public String hashPassword(String password){
        String hashedPassword = "";
        // implementation
        // MessageDigest md = MessageDigest.getInstance("SHA2");
        // ....
        return hashedPassword;
    }

    public boolean savePasswordDB(String password){

        // Connection, Statement, ResultSet

        return true;
    }

    public boolean savePasswordFile(String password, String fileName){

        // Files.write

        return true;
    }

    public void notifyPassword(String password, String email){
        // send email


    }
}
