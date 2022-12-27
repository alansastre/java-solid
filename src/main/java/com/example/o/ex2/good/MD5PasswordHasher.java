package com.example.o.ex2.good;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5PasswordHasher implements PasswordHasher{
    @Override
    public MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
