
package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
    
    public Connection conectaBD(){
        Connection conn = null;
    try{
        //Configuraçãoes da conexão com o banco de dados;
        String url = "jdbc:mysql://localhost:3306/cadastro?userSSL=false";
        String user = "root";
        String password = "";
        
        conn = DriverManager.getConnection(url, user, password);
        
    }catch(SQLException e){
        System.out.println(" Deu Rium: "+e.getMessage());
    }
    return conn;
    }
    
     }
