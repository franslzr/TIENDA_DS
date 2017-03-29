/*
 * Conexion Base De Datos
 */
package connections;

import java.sql.*;

public class conection extends ClaseConexion {

    public conection() {
        
    }

    private String password = "admin";
    private String usuario = "root";
    private String direccionServidor = "localhost";
    private String nombreBaseDatos = "tienda";
    private String puerto = "3306";

    @Override
    public void CrearConexion() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBaseDatos, usuario, password);
        System.out.println(":)");
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setDireccionServidor(String direccionServidor) {
        this.direccionServidor = direccionServidor;
    }

    public void setNombreBaseDatos(String nombreBaseDatos) {
        this.nombreBaseDatos = nombreBaseDatos;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
}
