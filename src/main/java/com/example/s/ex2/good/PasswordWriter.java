package com.example.s.ex2.good;

/*
Crear distintos mecanismos de almacenamiento separados en clases

por ejemplo

PasswordRepository (interfaz)
PasswordFileRepository (implementación 1)
PasswordDBRepository (implementación 2)
 */
public class PasswordWriter {

    public boolean savePasswordDB(String password){

        // Connection, Statement, ResultSet

        return true;
    }

    public boolean savePasswordFile(String password, String fileName){

        // Files.write

        return true;
    }
}
