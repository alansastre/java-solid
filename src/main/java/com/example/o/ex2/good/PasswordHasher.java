package com.example.o.ex2.good;

import com.example.o.ex2.bad.HashType;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Optional;

/*
3 responsabilidades completamente distintas:
 - hash
 - save
 - notify
 */
public interface PasswordHasher {

    default Optional<String> hashPassword(String password) {
        MessageDigest md = this.getMessageDigest();
        byte[] passwordHashed = md.digest(password.getBytes());
        String passwordHex = HexFormat.of().formatHex(passwordHashed);
        return Optional.ofNullable(passwordHex);
    }

    MessageDigest getMessageDigest();

}
