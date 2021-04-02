package pl.coderslab.model;

import org.mindrot.jbcrypt.BCrypt;
import pl.coderslab.utils.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class UserDao
{
    private static final String CREATE_USER_QUERY =
            "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";

    private static final String READ_USER_QUERY =
            "SELECT * FROM users WHERE id = ?";

    private static final String UPDATE_USER_QUERY =
            "UPDATE users SET email = ?, username = ?, password = ? where id = ?";

    private static final String REMOVE_USER_QUERY =
            "DELETE FROM users WHERE id = ?";

    private static final String FIND_ALL_QUERY =
            "SELECT * FROM users";



    public String hashPassword(String password)
    {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }



    public User createUser(User user) {
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, hashPassword(user.getPassword()));
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                user.setId(resultSet.getInt(1));
            }
            return user;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }



    public User readUser(int userId) {
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(READ_USER_QUERY);
            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = new User();

                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));

                return user;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void updateUser(User user) {
        try (Connection connection = DbUtil.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_QUERY);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, this.hashPassword(user.getPassword()));
            preparedStatement.setInt(4, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {

            ex.printStackTrace();
        }
    }


    public void deleteUser(int userId)
    {
        try (Connection connection = DbUtil.getConnection())
        {
            PreparedStatement preparedStatement = connection.prepareStatement(REMOVE_USER_QUERY);
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }



    public ArrayList<User> showAllUsers()
    {
        try (Connection connection = DbUtil.getConnection())
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(FIND_ALL_QUERY);
            ArrayList<User> users = new ArrayList<>();

            while (resultSet.next())
            {
                User user = new User(resultSet.getInt("id"), resultSet.getString("email"), resultSet.getString("username"), resultSet.getString("password"));
                users.add(user);
                System.out.println("ID: " + user.getId() + " EMAIL: " + user.getEmail() + " USERNAME: " + user.getUsername());
            }
            return users;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }



    public User[] findAllUsers()
    {
        try (Connection connection = DbUtil.getConnection())
        {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            User[] usersList = new User[0];

            while (resultSet.next())
            {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                usersList = addToArray(user, usersList);
            }
            return usersList;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }

    private User[] addToArray(User user, User[] users)
    {
        User[] tempUsers = Arrays.copyOf(users, users.length + 1);
        tempUsers[users.length] = user;
        return tempUsers;
    }
}
