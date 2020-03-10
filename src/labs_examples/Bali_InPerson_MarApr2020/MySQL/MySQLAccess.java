package labs_examples.Bali_InPerson_MarApr2020.MySQL;

import java.sql.*;
import java.util.ArrayList;


public class MySQLAccess {
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    public static void main(String[] args) {
        MySQLAccess example = new MySQLAccess();
        try {
            example.readDataBase();
        } catch (Exception e){
            System.out.println("error in readDateBase()" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    public void readDataBase()
            throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost/ChatApp?" +
                    "&useSSL=false&allowPublicKeyRetrieval=true" +
                    "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from ChatApp.messages;");
            //writeResultSet(resultSet);
            ArrayList<Message> messages = mapResultSetToObjects(resultSet);
            for (Message m : messages){
                System.out.println(m.toString());
            }
            // PreparedStatements can use variables and are more efficient
            preparedStatement = connection
                    .prepareStatement("insert into  chatapp.messages (sender_id, recipient_id, content) " +
                            "values (?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setInt(1, 1);
            preparedStatement.setInt(2, 2);
            preparedStatement.setString(3, "Delete * from users;");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("SELECT * from chatapp.messages");
            resultSet = preparedStatement.executeQuery();
            writeResultSet(resultSet);
            //Remove again the insert comment
            preparedStatement = connection
                    .prepareStatement("delete from chatApp.messages where id = ? ; ");
            preparedStatement.setInt(1, 5);
            preparedStatement.executeUpdate();
            resultSet = statement.executeQuery("select * from ChatApp.Messages");
            writeMetaData(resultSet);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            close();
        }
    }
    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //         Now get some metadata from the database
        // Result set get the result of the SQL query
        System.out.println("The columns in the table are: ");
        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }
    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
            int sender_id = resultSet.getInt("sender_id");
            int recipient_id = resultSet.getInt("recipient_id");
            String message = resultSet.getString("content");
            System.out.println("Sender: " + sender_id + ", Recipient: " + recipient_id + ", Content: " + message);
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");
        }
    }
    private ArrayList<Message> mapResultSetToObjects(ResultSet resultSet) throws SQLException {
        ArrayList<Message> retList = new ArrayList();
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            Message m = new Message();
            m.setId(resultSet.getInt("id"));
            m.setSender_id(resultSet.getInt("sender_id"));
            m.setRecipient_id(resultSet.getInt("recipient_id"));
            m.setContent(resultSet.getString("content"));
            m.setTimeStamp(resultSet.getTime("timestamp").toString());
            retList.add(m);
        }
        return retList;
    }
    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
        }
    }
}

class Message{
    private int id;
    private int sender_id;
    private int recipient_id;
    private int group;
    private String content;
    private String timeStamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public int getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(int recipient_id) {
        this.recipient_id = recipient_id;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}