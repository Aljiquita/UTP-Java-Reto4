
package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class JDBCUtilities {
    private static final String UBICACION_BD = "J:/Material mision TIC 2/Programacion Basica/Unidad 4/Reto4/ProyectosConstruccion.db";
    
    public static Connection getConnection() throws SQLException {
        
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }
    /*
    public class JDBCUtilities {
    
    String strConexionDB = "jdbc:sqlite:J:/Material mision TIC 2/Programacion Basica/Unidad 4/Reto4/ProyectosConstruccion.db";
    
    Connection conn = null;
    public JDBCUtilities(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);    
        }catch(Exception e){
            System.out.println(e);
        }
        }
    */
     /*
         public ResultSet consultarRegistros(String strSentenciaSQL){
       try{
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        }
        catch(Exception e){
            System.out.println( e);
            return null;
        }
    }
        */
}
