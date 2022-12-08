package com.drive;

/*pdf 코드*/
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DataSourceTest {
    @Test
    public void testConnection(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext(
                "file:src/main/webapp/WEB-INF/applicationContext.xml"
        );
        DataSource ds = (DataSource) ctx.getBean("ds");


        Connection con;

        {
            try {
                con = ds.getConnection();
                System.out.println("DB 연결 성공!");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}