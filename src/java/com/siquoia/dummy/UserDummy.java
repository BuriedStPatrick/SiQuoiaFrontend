/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.dummy;

/**
 *
 * @author PC
 */
public class UserDummy {
    private String email;
    private String password;
    
    public UserDummy(String email, String password){
        this.email = email;
        this.password = password;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
}
