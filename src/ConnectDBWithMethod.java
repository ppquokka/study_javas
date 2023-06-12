import java.sql.*;

import cars.FactoryDMLs;

public class ConnectDBWithMethod {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM factorys";              
            /*  펑션으로 만들때 계!속! 재사용이 가능하다     
                1.statement를 파라미터로 던지고, 쿼리값도 던져서 resultset을 만들기
                  
                2.query   
                
                3.result로 뱉어내기
             *  묶음을 결과값으로 받는건 array(class)에서 했다
             * 파라미터를 (url, user, password)를 넣고, 스테이트먼트를 받으면 펑션을 만들 수 있음
             */
            FactoryDMLs factoryDMLs = new FactoryDMLs();
            ResultSet resultSet = factoryDMLs.SelectStatements(statement, query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }

            // SELECT COUNT(*) AS CNT FROM factorys;
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = statement.executeQuery(query);
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }

            /*
            INSERT INTO factorys
            (COMPANY_ID, COMPANY) 
            VALUE 
            ('CAR-01', 'AUDI');
            */
            String companyId = "CAR-01";
            String company = "AUDI" ;   
            /*입출력 관련 장비 자원을 이용하면 무조건 반납해야함
             * 위의 얘는 row에 입력되는 값이므로 반납 안해도됨
             * data는 입력&출력 둘 다임. 그렇지만 자세히 하면 컴퓨터 disk에 저장되므로
             * 꼭 반납해야함. 
             * 
            */
            query = "INSERT INTO factorys " +
                    "(COMPANY_ID, COMPANY) " +
                    " VALUE " +
                    "('"+companyId+"', '"+company+"') ";
            
            int count = statement.executeUpdate(query);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}