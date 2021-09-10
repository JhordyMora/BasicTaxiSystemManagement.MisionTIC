package Access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import Model.*;
import Utils.ConnectionDB;

public class GeneralDAO {
    private Connection conn = null;
    public ArrayList<Conductor> getAllConductores(){
        ArrayList<Conductor> conductores = new ArrayList();
        try {
            if(conn == null){
                conn = ConnectionDB.getConnection();

                String sql = "select usu_cc,veh_placa from conductor;";
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);

                while(result.next()){
                    Conductor conductor = new Conductor(result.getInt(1),result.getString(2));
                    conductores.add(conductor);
                }
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Codigo: " + ex.getErrorCode() + "\nError : " + ex.getMessage());
        }
        return conductores;
    }

    public ArrayList<Usuario> getAllUsuarios(){
        ArrayList<Usuario> usuarios = new ArrayList();
        try {
            if(conn == null){
                conn = ConnectionDB.getConnection();

                String sql = "select usu_cc,usu_nombre,usu_apellido,usu_email from usuario;";
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);

                while(result.next()){
                    Usuario usuario = new Usuario(result.getInt(1),result.getString(2),result.getString(3),result.getString(4));
                    usuarios.add(usuario);
                }
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Codigo: " + ex.getErrorCode() + "\nError : " + ex.getMessage());
        }
        return usuarios;
    }

    public ArrayList<Vehiculo> getAllVehiculo(){
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        try {
            if(conn == null){
                conn = ConnectionDB.getConnection();

                String sql = "select veh_placa,veh_marca,veh_modelo,veh_anhio,veh_capacidad,veh_color, veh_kilometros from vehiculo;";
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);

                while(result.next()){
                    Vehiculo vehiculo = new Vehiculo(result.getString(1),result.getString(2),result.getString(3),result.getInt(4),result.getInt(5),result.getString(6),result.getInt(7));
                    vehiculos.add(vehiculo);
                }
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Codigo: " + ex.getErrorCode() + "\nError : " + ex.getMessage());
        }
        return vehiculos;
    }

    public ArrayList<Viaje> getAllViaje(){
        ArrayList<Viaje> viajes = new ArrayList();
        try {
            if(conn == null){
                conn = ConnectionDB.getConnection();

                String sql = "select via_id,usu_cc,con_cc,fecha from viaje;";
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);

                while(result.next()){
                    Viaje viaje = new Viaje(result.getInt(1),result.getInt(2),result.getInt(3),result.getString(4));
                    viajes.add(viaje);
                }
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Codigo: " + ex.getErrorCode() + "\nError : " + ex.getMessage());
        }
        return viajes;
    }

    public ArrayList<Usuario> getUsuariosByName(String usu_nombre){
        ArrayList<Usuario> usuarios = new ArrayList();
        try {
            if(conn == null){
                conn = ConnectionDB.getConnection();

                String sql = "select usu_cc,usu_nombre, usu_apellido,usu_email from usuario where usu_nombre = ?;";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1,usu_nombre);
                ResultSet result = statement.executeQuery(sql);

                while(result.next()){
                    Usuario usuario = new Usuario(result.getInt(1),result.getString(2),result.getString(3),result.getString(4));
                    usuarios.add(usuario);
                }
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Codigo: " + ex.getErrorCode() + "\nError : " + ex.getMessage());
        }
        return usuarios;
    }

    public void insertUsuario(Usuario usuario){
        try {
            if(conn == null){
                conn = ConnectionDB.getConnection();

                String sql = "insert into usuario(usuCC,usuNombre,usuApellido,usuEmail) values (?,?,?,?);";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1,usuario.getusuCC());
                statement.setString(2,usuario.getusuNombre());
                statement.setString(3,usuario.getusuApellido());
                statement.setString(4,usuario.getusuEmail());

                int rowInserted = statement.executeUpdate();
                if (rowInserted > 0){
                        JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente");
                }
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Codigo: " + ex.getErrorCode() + "\nError : " + ex.getMessage());
        }
    }
    
    public void updateUsuario(Usuario usuario){
        try {
            if(conn == null){
                conn = ConnectionDB.getConnection();

                String sql = "update usuario set usu_nombre=? where usuCC = ?;";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(2,usuario.getusuCC());
                statement.setString(1,usuario.getusuNombre());

                int rowInserted = statement.executeUpdate();
                if (rowInserted > 0){
                        JOptionPane.showMessageDialog(null, "El registro fue actualizado exitosamente");
                }
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Codigo: " + ex.getErrorCode() + "\nError : " + ex.getMessage());
        }
    }

    public void deleteUsuario(Usuario usuario){
        try {
            if(conn == null){
                conn = ConnectionDB.getConnection();

                String sql = "delete from usuario where usuCC = ?;";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1,usuario.getusuCC());

                int rowInserted = statement.executeUpdate();
                if (rowInserted > 0){
                        JOptionPane.showMessageDialog(null, "El registro fue borrado exitosamente");
                }
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Codigo: " + ex.getErrorCode() + "\nError : " + ex.getMessage());
        }
    }
}
