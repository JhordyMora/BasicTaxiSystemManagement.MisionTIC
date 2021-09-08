package Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;        
import java.sql.SQLException;
import java.util.logging.Level; 
import java.util.logging.Logger;      

import org.json.simple.*;
import org.json.simple.parser.*;

public class ConnectionDB {
    public static Connection getConnection(){
        JSONParser parser = new JSONParser();
        Connection conn = null;
    }
}
