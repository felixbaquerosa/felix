/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SCC
 */
public class dbConnector {
    
    public dbConnector(){
       
            try{
                Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/tbl_user", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
}
