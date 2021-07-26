package tech.getarrays.employeemanager.service;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import tech.getarrays.employeemanager.model.Result;
import tech.getarrays.employeemanager.model.Root;
import tech.getarrays.employeemanager.model.User;

@CrossOrigin
@RestController
@RequestMapping("/cf")
public class UserController {

    private final UserService userService;

    public UserController(UserService userservice){
        this.userService = userservice;
    }

    @GetMapping("/find/{handle}")
    public ResponseEntity<User> getUserDetails(@PathVariable("handle") String handle){
        String uri = "https://codeforces.com/api/user.info?handles="+handle;
        RestTemplate restTemplate = new RestTemplate();
        Root res = restTemplate.getForObject(uri, Root.class);      
        User r = res.getUser();
        // User user = new  User(r.getId(), r.getLastName(), r.getCountry(), r.getLastOnlineTimeSeconds(), r.getCity(), r.getRating(), r.getFriendOfCount(), r.getTitlePhoto(), r.getHandle(), r.getAvatar(), r.getFirstName(), r.getContribution(), r.getOrganization(), r.getRank(), r.getMaxRating(), r.getRegistrationTimeSeconds(), r.getMaxRank());
        User cur = userService.addUser(r);
        return new ResponseEntity<User>(cur, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.findAllUsers();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
}
