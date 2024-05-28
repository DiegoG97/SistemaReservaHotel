package Logica;

import Datos.vhabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hola
 */
public class fhabitacion {
    private final conexion mysql = new conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;

        String[] titulos = {"ID", "Numero", "Zona", "Descripcion", "Precio", "Estado", "Tipo de habitación", "Servicio"};
        String[] registro = new String[8];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from habitacion where zona like '%" + buscar + "%' order by idhabitacion";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("idhabitacion");
                registro[1] = rs.getString("numero");
                registro[2] = rs.getString("zona");
                registro[3] = rs.getString("descripcion");
                registro[4] = rs.getString("precio_diario");
                registro[5] = rs.getString("estado");
                registro[6] = rs.getString("tipo_habitacion");
                registro[7] = rs.getString("servicio");

                totalregistros++;
                modelo.addRow(registro);
            }

            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public boolean insertar(vhabitacion dts) {
        sSQL = "insert into habitacion (numero, zona, descripcion, precio_diario, estado, tipo_habitacion, servicio) " +
                "values (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getZona());
            pst.setString(3, dts.getDescripcion());
            pst.setInt(4, dts.getPrecio_diario());
            pst.setString(5, dts.getEstado());
            pst.setString(6, dts.getTipo_habitacion());
            pst.setString(7, dts.getServicio());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean editar(vhabitacion dts) {
        sSQL = "update habitacion set numero=?, zona=?, descripcion=?, precio_diario=?, estado=?, tipo_habitacion=?, servicio=? " +
               "where idhabitacion=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getZona());
            pst.setString(3, dts.getDescripcion());
            pst.setInt(4, dts.getPrecio_diario());
            pst.setString(5, dts.getEstado());
            pst.setString(6, dts.getTipo_habitacion());
            pst.setString(7, dts.getServicio());
            pst.setInt(8, dts.getIdhabitacion());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(vhabitacion dts) {
        sSQL = "delete from habitacion where idhabitacion=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdhabitacion());

            int n = pst.executeUpdate();

            return n != 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
}
