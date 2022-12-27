package com.example.d.ex1.good;

import com.example.d.ex1.bad.Customer;
import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerMySQLDAO implements CustomerDAO{
    private MysqlDataSource dataSource;

    public CustomerMySQLDAO() {
        this.dataSource = new MysqlDataSource();
        this.dataSource.setServerName("localhost");
        this.dataSource.setPortNumber(3306);
        this.dataSource.setDatabaseName("javajdbc");
        this.dataSource.setUser("root");
        this.dataSource.setPassword("password");
    }

    @Override
    public List<Customer> findAll(){
        try(Connection connection = dataSource.getConnection();){


        } catch (SQLException sqle) {

        }
        return new ArrayList<>();
    }
}
