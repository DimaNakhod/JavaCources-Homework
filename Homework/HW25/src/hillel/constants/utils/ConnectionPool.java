package hillel.constants.utils;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {
    public Connection getConnection() throws SQLException, NamingException {
        DataSource dataSource = (DataSource) (new InitialContext().lookup("java:comp/env/jdbc/VideoLibrary"));
        return dataSource.getConnection();
    }
}
