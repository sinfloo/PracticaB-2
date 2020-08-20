package com.ujcm.practicab.modeloDAO;

import com.ujcm.practicab.config.ConexionDB;
import com.ujcm.practicab.modelo.Detalle;
import com.ujcm.practicab.modelo.Hijo;
import com.ujcm.practicab.modelo.Padre;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CrudDAO {

    public Padre validarPadre(String doc) {
        String sql = "SELECT * FROM padre WHERE dni=?";
        Padre padre = new Padre();
        try {
            PreparedStatement ps = ConexionDB.Acceso().prepareStatement(sql);
            ps.setString(1, doc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                padre.setId(rs.getInt(1));
                padre.setDni(rs.getString(2));
                padre.setNombres(rs.getString(3));
                padre.setApellidos(rs.getString(4));
            }
        } catch (SQLException e) {
            System.err.println("Error" + e);
        }
        return padre;
    }

    public Hijo validarHijo(String doc) {
        String sql = "SELECT * FROM hijo WHERE dni=?";
        Hijo hijo = new Hijo();
        try {
            PreparedStatement ps = ConexionDB.Acceso().prepareStatement(sql);
            ps.setString(1, doc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                hijo.setId(rs.getInt(1));
                hijo.setDni(rs.getString(2));
                hijo.setNombres(rs.getString(3));
                hijo.setApellidos(rs.getString(4));
            }
        } catch (SQLException e) {
            System.err.println("Error" + e);
        }
        return hijo;
    }

    public int addRegristo(Detalle detalle) {
        int res = 0;
        if (detalle.getHijo() != null && detalle.getHijo().getDni() != null) {
            int idPadre;
            if (validarPadre(detalle.getPadre().getDni()).getDni() != null) {
                idPadre = validarPadre(detalle.getPadre().getDni()).getId();
            } else {
                idPadre = addPadre(detalle.getPadre());
            }
            int idHijo = addHijo(detalle.getHijo());
            String sql = "insert into detalle(idPadre,idHijo)values(?,?)";
            try {
                PreparedStatement ps = ConexionDB.Acceso().prepareStatement(sql);
                ps.setInt(1, idPadre);
                ps.setInt(2, idHijo);
                res = ps.executeUpdate();
            } catch (SQLException e) {
                System.err.println("Error" + e);
            }
        } else {
            res = addPadre(detalle.getPadre());
        }
        return res;
    }

    private int addPadre(Padre padre) {
        int idPadre = 0;
        String sql = "insert into padre(dni,nombres,apellidos)values(?,?,?)";
        try {
            PreparedStatement ps = ConexionDB.Acceso().prepareStatement(sql);
            ps.setString(1, padre.getDni());
            ps.setString(2, padre.getNombres());
            ps.setString(3, padre.getApellidos());
            ps.executeUpdate();
            sql = "SELECT @@IDENTITY AS idPadre";
            try (ResultSet rs = ps.executeQuery(sql)) {
                rs.next();
                idPadre = rs.getInt("idPadre");
            }
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return idPadre;
    }

    private int addHijo(Hijo hijo) {
        int idhijo = 0;
        String sql = "insert into hijo(dni,nombres,apellidos)values(?,?,?)";
        try {
            PreparedStatement ps = ConexionDB.Acceso().prepareStatement(sql);
            ps.setString(1, hijo.getDni());
            ps.setString(2, hijo.getNombres());
            ps.setString(3, hijo.getApellidos());
            ps.executeUpdate();
            sql = "SELECT @@IDENTITY AS idHijo";
            try (ResultSet rs = ps.executeQuery(sql)) {
                rs.next();
                idhijo = rs.getInt("idHijo");
            }
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return idhijo;
    }

    public List<Object[]> getData(String doc) {
        String sql = "SELECT d.idDetalle,p.dni,p.nombres ,h.dni,h.nombres \n"
                + "FROM detalle d INNER JOIN padre p INNER JOIN hijo h\n"
                + "ON d.idPadre=p.idPadre AND d.idHijo=h.idHijo\n"
                + "WHERE p.dni=? or h.dni=?";
        if (doc.equals("")) {
            sql = "SELECT d.idDetalle,p.dni,p.nombres ,h.dni,h.nombres \n"
                    + "FROM detalle d INNER JOIN padre p INNER JOIN hijo h\n"
                    + "ON d.idPadre=p.idPadre AND d.idHijo=h.idHijo";
        }
        List<Object[]> lista = new ArrayList<>();
        try {
            PreparedStatement ps = ConexionDB.Acceso().prepareStatement(sql);
            if (!doc.equals("")) {
                ps.setString(1, doc);
                ps.setString(2, doc);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] obj = new Object[5];
                obj[0] = rs.getInt(1);
                obj[1] = rs.getString(2);
                obj[2] = rs.getString(3);
                obj[3] = rs.getString(4);
                obj[4] = rs.getString(5);
                lista.add(obj);
            }
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return lista;
    }
}
