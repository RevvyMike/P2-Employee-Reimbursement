package com.project2.exceptions;

public class InvalidRequest extends RuntimeException {
    public InvalidRequest (String message){
        super(message);
    }
    public static void main(String[] args) {
        //throw new InvalidRequest("Request reason exceeds length");
    
    
    try {
        throw new InvalidRequest("Request reason exceeds length");

    } catch (InvalidRequest e) {
        System.out.println(e.getMessage());
    }
    
}

}
