package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FactoryDMLs {
    // ConnectDBWithMethod.java 파일이 main 파일
    // select, insert, delete 펑션 각각 만들기
    public ResultSet  SelectStatements(Statement statement, String query) throws SQLException{
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
        //null을 resultSet으로 바꾸기.  펑션만들기 끝

    //펑션을 사용한다는 class 사용한다 = 무조건 인스턴스한다    
    }
    // table로 나오는걸 result set으로 받음. 얘는 셀렉트문.
}
