package app;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        Optional<User> userId = userRepository.findUserById(3);
        Optional<User> userEmail = userRepository.findUserByEmail("john@gmail.com");
        Optional<List<User>> userList = userRepository.findAllUser();
        int usersOfNumbers = userRepository.numberOfUsers();

        System.out.println(userId);
        System.out.println(userEmail);
        System.out.println("___________________________________");
        System.out.println(userList);
        System.out.println("___________________________________");
        System.out.println("Кількість користувачів: " + usersOfNumbers);
    }
}
