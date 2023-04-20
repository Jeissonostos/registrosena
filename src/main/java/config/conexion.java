
package config;


public class conexion {
    connection con;
    
    public conectar()
    {
        try{
            class.forname("com.mysql.jdbc.driver");
            con=drivermanager.getconnection("jdbc:mysql://localhost:3306/tecnologo2023","root","");
            
        }catch(exception e)
        {
        sytem.err.println("Error"+e)}
    }
    public connection getconnection()
    {
    return con;
    }
    
}
