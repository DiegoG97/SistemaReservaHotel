package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Esta clase se encarga de establecer la conexión a la base de datos MySQL.
 * 
 * @author Hola
 */
public class conexion {

    public String db = "basereserva"; // Nombre de la base de datos
    public String url = "jdbc:mysql://127.0.0.1/" + db; // URL de conexión
    public String user = "root"; // Usuario de la base de datos
    public String password = ""; // Contraseña del usuario (puedes cambiarla)

    /**
     * Crea una instancia de la clase Conexion.
     */
    public conexion() {
    }

    /**
     Establece la conexión a la base de datos MySQL.
     */
    
    public Connection conectar() {
        Connection connection = null;
        try {
            // Carga el driver MySQL
            Class.forName("com.mysql.jdbc.Driver");

            // Establece la conexión
            connection = DriverManager.getConnection(url, user, password);

            // Mensaje de éxito (opcional)
            JOptionPane.showMessageDialog(null, "Conectado a la base de datos");

        } catch (ClassNotFoundException ex) {
            System.err.println("Error: Driver no encontrado: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al conectar: Driver no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            System.err.println("Error SQL: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al conectar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return connection;
    }

    /**
     * Cierra la conexión a la base de datos.
     * 
     * @param connection La conexión a cerrar.
     */
    public void cerrarConexion(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }
}
