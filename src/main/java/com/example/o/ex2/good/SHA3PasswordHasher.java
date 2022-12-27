package com.example.o.ex2.good;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA3PasswordHasher implements PasswordHasher{
    @Override
    public MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance("SHA3_512");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
