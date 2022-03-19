package peaksoft.daos;

import peaksoft.models.User;

import java.util.List;

public interface UserDao {

        List<User> getAllUsers();

        void addUser(User user);

        User getById(Long id);

        void updateUser(User user, Long id);

        void deleteUser(Long id);

        User get(Long id);
}
