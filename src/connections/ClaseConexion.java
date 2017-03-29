package connections;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

;

/**
 *
 * @author Roger Alvarez
 *
 */
public abstract class ClaseConexion {

    public Connection con;
    private Component Parent;

    public Component getParent() {
        return Parent;
    }

    public void setParent(Component Parent) {
        this.Parent = Parent;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public boolean AgregarRegistro(String NombreTabla, iList campos, boolean Merge) throws Exception {
        boolean agregado;
        String sql1 = ") VALUES(", sql = "INSERT INTO " + NombreTabla + "(";
        int y = 1;//para agregar elementos a la cadena

        for (ListasTablas campo : campos.getAll()) {
            sql += ((y > 1) ? ", " : "") + campo.getCampo();
            sql1 += ((y > 1) ? ", " : "") + "?";
            y++;
        }
        PreparedStatement ps;
        y = 1;
        sql += sql1 + ")";
        if (Merge) {
            sql += agregarMergeSentencia("mysql", campos);
        }
        ps = con.prepareStatement(sql);
        for (ListasTablas campo : campos.getAll()) {
            ps.setObject(y, campo.getValor());
            y++;
        }
        int m = 1;
        if (Merge) {
            for (ListasTablas o : campos.getAll()) {
                if (m > 1) {
                    ps.setObject(y, o.getValor());
                    y++;
                }
                m++;
            }
        }
        y = ps.executeUpdate();
        agregado = y > 0;
        return agregado;
    }

    public boolean ModificarRegistro(String NombreTabla, iList Nuevoscampos, iList Ncondiciones) throws Exception {
        boolean modificado;
        String sql = "UPDATE " + NombreTabla + " SET ";
        PreparedStatement ps;
        int y = 1;//para agregar elementos a la cadena
        for (ListasTablas Nuevoscampo : Nuevoscampos.getAll()) {
            sql += ((y > 1) ? ", " : "") + Nuevoscampo.getCampo() + "=?";
            y++;
        }
        sql += " WHERE ";
        y = 1;//para agregar elementos a la cadena
        for (ListasTablas Ncondicione : Ncondiciones.getAll()) {
            sql += ((y > 1) ? ", " : "") + Ncondicione.getCampo() + "=?";
            y++;
        }
        y = 1;
        ps = (PreparedStatement) con.prepareStatement(sql);
        for (ListasTablas Nuevoscampo : Nuevoscampos.getAll()) {
            ps.setObject(y, Nuevoscampo.getValor());
            y++;
        }
        for (ListasTablas Ncondicione : Ncondiciones.getAll()) {
            ps.setObject(y, Ncondicione.getValor());
            y++;
        }
        y = ps.executeUpdate();
        modificado = y > 0;
        return modificado;
    }//listo

    public abstract void CrearConexion() throws Exception;

    public void IniciarTransaccion() throws Exception {
        con.setAutoCommit(false);
    }

    public void comit() throws Exception {
        con.commit();
        con.setAutoCommit(true);
    }

    public void RollBack() throws Exception {
        con.rollback();
        con.setAutoCommit(true);
    }

    public void Conectar() throws Exception {
        this.CrearConexion();
    }

    public boolean Eliminar(String NombreTabla, iList condiciones) throws Exception {
        boolean borrado;
        PreparedStatement ps;
        String sql = "DELETE FROM " + NombreTabla + " WHERE ";
        int y = 1;//para agregar elementos a la cadena
        for (ListasTablas condicion : condiciones.getAll()) {
            sql += ((y > 1) ? " and " : "") + condicion.getCampo() + "=?";
            y++;
        }
        y = 1;
        ps = (PreparedStatement) con.prepareStatement(sql);
        for (ListasTablas condicion : condiciones.getAll()) {
            ps.setObject(y, condicion.getValor());
            y++;
        }
        y = ps.executeUpdate();
        borrado = y > 0;
        return borrado;
    }

    public void Desconectar() throws Exception {
        con.close();
    }

    public PreparedStatement BuscarRegistro(String NombreTabla, String[] CamposAMostrar, iList condiciones) throws Exception {
        String sql = "SELECT";
        int u = 1;
        for (String f : CamposAMostrar) {
            sql += ((u > 1) ? ", " : " ") + f;
            u++;
        }
        sql += " FROM " + NombreTabla;
        if (condiciones.size() > 0) {
            sql += " WHERE";
        }
        u = 1;
        for (ListasTablas condicion : condiciones.getAll()) {
            sql += ((u > 1) ? " AND " : " ") + condicion.getCampo() + "=?";
            u++;
        }
        u = 1;
        PreparedStatement ps = con.prepareStatement(sql);
        for (ListasTablas condicion : condiciones.getAll()) {
            ps.setObject(u, condicion.getValor());
            u++;
        }
        System.out.println(sql);
        return ps;
    }

    public PreparedStatement BuscarRegistroAutomatXTexto(String NombreTabla, String[] CamposAMostrar, iList condiciones) throws Exception {
        String sql = "SELECT ";
        int u = 1;
        for (String f : CamposAMostrar) {
            sql += ((u > 1) ? ", " : " ") + f;
            u++;
        }
        sql += " FROM " + NombreTabla + " WHERE ";
        u = 1;
        for (ListasTablas condicion : condiciones.getAll()) {
            sql += ((u > 1) ? ", " : " ") + condicion.getCampo() + " LIKE ?";
            u++;
        }
        System.out.println(sql);
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
        u = 1;
        for (ListasTablas condicion : condiciones.getAll()) {
            ps.setString(u, condicion.getValor() + "%");
            u++;
        }
        return ps;
    }

    public ClaseConexion() {
    }

    private String agregarMergeSentencia(String servidor, iList campos) {
        String sql = "";
        switch (servidor) {
            case "mysql":
                sql += " ON DUPLICATE KEY UPDATE";
                int y = 1;
                for (ListasTablas o : campos.getAll()) {
                    if (y > 1) {
                        sql += ((y > 2) ? ", " : " ") + o.getCampo() + "=?";
                    }
                    y++;
                }
        }
        return sql;
    }

    private void asignarValoresAPS(iList campos, PreparedStatement ps, int cont) throws SQLException {
        int y = 1;
        cont++;
        for (ListasTablas o : campos.getAll()) {
            if (y > 1) {
                ps.setObject(cont, o.getValor());
                cont++;
            }
            y++;
        }
    }

    //metodo para buscar todos los registros de una tabla
    public PreparedStatement BuscarTodos(String NombreTabla, String[] CamposAMostrar) throws Exception {
        String sql = "SELECT";
        int u = 1;
        for (String f : CamposAMostrar) {
            sql += ((u > 1) ? ", " : " ") + f;
            u++;
        }
        sql += " FROM " + NombreTabla;
        u = 1;
        PreparedStatement ps = con.prepareStatement(sql);
        System.out.println(sql);
        return ps;
    }
}
