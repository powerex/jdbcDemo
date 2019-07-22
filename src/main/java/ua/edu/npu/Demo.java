package ua.edu.npu;

import ua.edu.npu.model.Student;
import ua.edu.npu.util.DBConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(DBConfig.getDriver());
        Connection connection =
                DriverManager.getConnection(
                        DBConfig.getUrl(),
                        DBConfig.getUser(),
                        DBConfig.getPassword());

        System.out.println("Connection received");

        String sqlUpdate = "UPDATE students SET age=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdate);
        preparedStatement.setInt(1, 99);
        double randomId = Math.random() * 14 + 1;
        preparedStatement.setInt(2, (int) randomId);
        int i = preparedStatement.executeUpdate();
        System.out.println("Prepared statement update rows: " + i);

        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM students";
        ResultSet resultSet = statement.executeQuery(sql);

        List<Student> students = new ArrayList<>();

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int age = resultSet.getInt(3);
            students.add(new Student(id, name, age));
        }

        students.forEach(System.out::println);

        resultSet.close();
        statement.close();
        connection.close();
    }
}