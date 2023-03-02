package com.hackathon03.codeguru.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class HardCodedCredentials {

    public void createSqlConnectionNoncompliant() throws Exception {
        // Noncompliant: password is hardcoded.
        final Connection connection = DriverManager.getConnection("some url",
                "username", "password");
        connection.close();
    }


    public void createSqlConnectionCompliant() throws Exception {
        // Compliant: password is obtained from environment.
        final Connection connection = DriverManager.getConnection("some url",
                "user", System.getProperty("pwd"));
        connection.close();
    }

}
