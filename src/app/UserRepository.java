package app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    public List<User> getDataUser(){
        return Arrays.asList(
                new User(1, "Vlad", "vlad@gmail.com"),
                new User(2, "Stas", "stas@gmail.com"),
                new User(3, "Sveta", "sveta@gmail.com"),
                new User(4, "Nikola", "nikola@gmail.com"),
                new User(5, "John", "john@gmail.com")
        );
    }

   public Optional<User> findUserById(int id){
        return getDataUser().stream()
                .filter(User -> User.getId() == id)
                .findFirst();
   }

   public Optional<User> findUserByEmail(String email){
        return getDataUser().stream()
                .filter(User -> User.getEmail() == email)
                .findFirst();
   }

   public Optional<List<User>> findAllUser(){
        List<User> list = getDataUser();
        if(list.isEmpty()){
            return Optional.empty();
        }else {
            return Optional.of(list);
        }
   }

   public int numberOfUsers(){
        return getDataUser().size();
    }
}
