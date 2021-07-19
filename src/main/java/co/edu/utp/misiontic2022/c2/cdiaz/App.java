package co.edu.utp.misiontic2022.c2.cdiaz;

import java.sql.SQLException;

import co.edu.utp.misiontic2022.c2.cdiaz.util.JDBCUtilities;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try (var connection = JDBCUtilities.getConnection()) {
            if (JDBCUtilities.isDatabaseEmpty()) {
                JDBCUtilities.initDatabase(connection);
            }

            

        } catch (SQLException e) {
            System.err.println("Error en conexion a base de datos: " + e);
        }
    }



}
