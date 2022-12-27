package com.example.o.ex2.bad;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
3 responsabilidades completamente distintas:
 - hash
 - save
 - notify
 */
public class PasswordHasher {

    public byte[] hashPassword(String password, HashType hashType) throws NoSuchAlgorithmException {

        MessageDigest md = switch(hashType){
            case MD_5 -> MessageDigest.getInstance("MD5");
            case SHA_256 -> MessageDigest.getInstance("SHA-256");
            case SHA3_512 -> MessageDigest.getInstance("SHA3-512");
        }; // Nos obliga a seguir añadiendo nuevos casos aquí

        return md.digest(password.getBytes());
    }

}
