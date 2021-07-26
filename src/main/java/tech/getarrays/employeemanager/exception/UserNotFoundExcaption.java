package tech.getarrays.employeemanager.exception;

public class UserNotFoundExcaption extends RuntimeException{
    public UserNotFoundExcaption(String message){
        super(message);
    }
}
