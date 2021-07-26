package tech.getarrays.employeemanager.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// @Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root{
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(nullable = false, updatable = false)
    // private Long id;

    @JsonProperty("status") 
    String status;

    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }
    @JsonProperty("result") 
    ArrayList<User> User;

    public Root(){}

    public String getStatus() { 
		 return this.status; } 
    public void setStatus(String status) { 
		 this.status = status; } 

    public User getUser() { 
		 return this.User.get(0); 
    } 
    public void setUser(ArrayList<User> User) { 
		 this.User = User; 
    } 
}
