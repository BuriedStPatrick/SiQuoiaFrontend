/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.exception;

/**
 *
 * @author PC
 */
public class AuthenticationException extends CommandException{

    public AuthenticationException(String origin) {
        super(origin);
    }
    
}
