package peaksoft.services;

import peaksoft.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    User getById(Long id);

    void updateUser(User user, Long id);

    void deleteUser(Long id);

    User get(Long id);
}
