package jdbc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**原生的jdbc 使用sql包下的接口和数据库驱动类
 * 1.加载jdbc驱动程序
 * 2.创建数据库连接类的实例对象
 * 3.获取Connection 对象的实例  创建statement 对象实例 执行标准的sql语句 对数据库表相关操作
 * 4.返回的结果用ResultSet类处理
 */
@Component
@Service
public class JDBCService {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://127.0.0.1:3306/tcc-simple";
        String username ="admin";
        String password ="root";

        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("数据库连接成功!");
        return connection;
    }


    public void save() throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        try {
            connection.setAutoCommit(false);
            //java.sql.SQLNonTransientConnectionException: Can''t call rollback when autocommit=true
            Statement statement = connection.createStatement();
            String sql ="insert t_order values(null,'2020-11-18 12:21:17',1,1)";
            statement.execute(sql);
            //事务提交
            connection.commit();

        } catch (SQLException throwables) {
           if (connection!=null){
               //事务回滚
               connection.rollback();
           }
        } finally {
            if(connection!=null){
                //关闭连接
                connection.close();
            }
        }

    }

}
