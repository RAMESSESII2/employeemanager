package tech.getarrays.employeemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.getarrays.employeemanager.model.User;
import tech.getarrays.employeemanager.repository.UserRepo;

@Service
@Transactional
public class UserService {
    private final UserRepo userrepo;

    @Autowired
    public UserService(UserRepo userrep){
        this.userrepo = userrep;
    }

    public User addUser(User user){
        return userrepo.save(user);
    }

    public List<User> findAllUsers(){
        return userrepo.findAll();
    }

}
