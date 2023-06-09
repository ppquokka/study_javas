import java.sql.*;
public class ConnectDBs {
public static void main(String[] args) {
    try {
        // - MySQL workbench 실행 : JDBC
        // - User/password와 접속 IP:port 접속
        // ~~ 3306/데이터베이스 입력 : 데이터베이스가 동일해야 작동함
        String url = "jdbc:mysql://localhost:3306/db_cars";
        String user = "root";
        String password = "!yojulab*";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("DB연결 성공\n");
        //워크벤치에서 db더블클릭해서 볼드체로된 것 까지 완료

        /* - query Edit
         * statement가 에디터 */
        Statement statement = connection.createStatement();
        //에디터 띄우기 완
        
        String query = "SELECT * FROM factorys";
        ResultSet resultSet = statement.executeQuery(query);           //익시큐트, 마이sql에서 번개. 완
        while(resultSet.next()){ //얘는 db용, arraylist는 다른 용도
              // next는 뭉치를 던져주고 다음으로 넘어감. 즉 row1이 나옴
              //resultSet.getString("Company_ID");
              //resultSet.getString("Company");
              //겟스트링은 그 데이터 타입을 따라감 
        System.out.println(resultSet.getString("Company_ID")+resultSet.getString("Company"));
        }


        System.out.println();
    } catch (Exception e) {
        // TODO: handle exception
    }
}
}

/*
 * import java.sql.*;

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://localhost:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
 */