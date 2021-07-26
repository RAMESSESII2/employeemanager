package tech.getarrays.employeemanager.model;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// @Entity
// @JsonIgnoreProperties(ignoreUnknown = true)
public class Result implements Serializable{
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(nullable = false, updatable = false)
    public long id;
    public String lastName;
    public String country;
    public int lastOnlineTimeSeconds;
    public String city;
    public int rating;
    public int friendOfCount;
    public String titlePhoto;
    public String handle;
    public String avatar;
    public String firstName;
    public int contribution;
    public String organization;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String rank;
    public int maxRating;
    public int registrationTimeSeconds;
    public String maxRank;

    public Result(){}

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getLastOnlineTimeSeconds() {
        return lastOnlineTimeSeconds;
    }
    public void setLastOnlineTimeSeconds(int lastOnlineTimeSeconds) {
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getFriendOfCount() {
        return friendOfCount;
    }
    public void setFriendOfCount(int friendOfCount) {
        this.friendOfCount = friendOfCount;
    }
    public String getTitlePhoto() {
        return titlePhoto;
    }
    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }
    public String getHandle() {
        return handle;
    }
    public void setHandle(String handle) {
        this.handle = handle;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getContribution() {
        return contribution;
    }
    public void setContribution(int contribution) {
        this.contribution = contribution;
    }
    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public int getMaxRating() {
        return maxRating;
    }
    public void setMaxRating(int maxRating) {
        this.maxRating = maxRating;
    }
    public int getRegistrationTimeSeconds() {
        return registrationTimeSeconds;
    }
    public void setRegistrationTimeSeconds(int registrationTimeSeconds) {
        this.registrationTimeSeconds = registrationTimeSeconds;
    }
    public String getMaxRank() {
        return maxRank;
    }
    public void setMaxRank(String maxRank) {
        this.maxRank = maxRank;
    }
}


// public class Result{

//     @JsonProperty("lastName") 
//     public String getLastName() { 
// 		 return this.lastName; } 
//     public void setLastName(String lastName) { 
// 		 this.lastName = lastName; } 
//     String lastName;
//     @JsonProperty("country") 
//     public String getCountry() { 
// 		 return this.country; } 
//     public void setCountry(String country) { 
// 		 this.country = country; } 
//     String country;
//     @JsonProperty("lastOnlineTimeSeconds") 
//     public int getLastOnlineTimeSeconds() { 
// 		 return this.lastOnlineTimeSeconds; } 
//     public void setLastOnlineTimeSeconds(int lastOnlineTimeSeconds) { 
// 		 this.lastOnlineTimeSeconds = lastOnlineTimeSeconds; } 
//     int lastOnlineTimeSeconds;
//     @JsonProperty("city") 
//     public String getCity() { 
// 		 return this.city; } 
//     public void setCity(String city) { 
// 		 this.city = city; } 
//     String city;
//     @JsonProperty("rating") 
//     public int getRating() { 
// 		 return this.rating; } 
//     public void setRating(int rating) { 
// 		 this.rating = rating; } 
//     int rating;
//     @JsonProperty("friendOfCount") 
//     public int getFriendOfCount() { 
// 		 return this.friendOfCount; } 
//     public void setFriendOfCount(int friendOfCount) { 
// 		 this.friendOfCount = friendOfCount; } 
//     int friendOfCount;
//     @JsonProperty("titlePhoto") 
//     public String getTitlePhoto() { 
// 		 return this.titlePhoto; } 
//     public void setTitlePhoto(String titlePhoto) { 
// 		 this.titlePhoto = titlePhoto; } 
//     String titlePhoto;
//     @JsonProperty("handle") 
//     public String getHandle() { 
// 		 return this.handle; } 
//     public void setHandle(String handle) { 
// 		 this.handle = handle; } 
//     String handle;
//     @JsonProperty("avatar") 
//     public String getAvatar() { 
// 		 return this.avatar; } 
//     public void setAvatar(String avatar) { 
// 		 this.avatar = avatar; } 
//     String avatar;
//     @JsonProperty("firstName") 
//     public String getFirstName() { 
// 		 return this.firstName; } 
//     public void setFirstName(String firstName) { 
// 		 this.firstName = firstName; } 
//     String firstName;
//     @JsonProperty("contribution") 
//     public int getContribution() { 
// 		 return this.contribution; } 
//     public void setContribution(int contribution) { 
// 		 this.contribution = contribution; } 
//     int contribution;
//     @JsonProperty("organization") 
//     public String getOrganization() { 
// 		 return this.organization; } 
//     public void setOrganization(String organization) { 
// 		 this.organization = organization; } 
//     String organization;
//     @JsonProperty("rank") 
//     public String getRank() { 
// 		 return this.rank; } 
//     public void setRank(String rank) { 
// 		 this.rank = rank; } 
//     String rank;
//     @JsonProperty("maxRating") 
//     public int getMaxRating() { 
// 		 return this.maxRating; } 
//     public void setMaxRating(int maxRating) { 
// 		 this.maxRating = maxRating; } 
//     int maxRating;
//     @JsonProperty("registrationTimeSeconds") 
//     public int getRegistrationTimeSeconds() { 
// 		 return this.registrationTimeSeconds; } 
//     public void setRegistrationTimeSeconds(int registrationTimeSeconds) { 
// 		 this.registrationTimeSeconds = registrationTimeSeconds; } 
//     int registrationTimeSeconds;
//     @JsonProperty("maxRank") 
//     public String getMaxRank() { 
// 		 return this.maxRank; } 
//     public void setMaxRank(String maxRank) { 
// 		 this.maxRank = maxRank; } 
//     String maxRank;
// }