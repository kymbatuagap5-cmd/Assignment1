package fitness;

public class Main {
    public static void main(String[] args) {


        UserDAO userDAO = new UserDAO();

        userDAO.updateUser("Aruzhan", 21, 56.0);

        userDAO.getAllUsers();

        userDAO.deleteUser("Dias");

        userDAO.getAllUsers();


    }

}




