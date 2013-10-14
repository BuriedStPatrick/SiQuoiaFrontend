package com.siquoia.exception;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class CommandException extends Exception{
    
    String origin;

    public CommandException(String origin) {
        this.origin = origin;
    }
    
    public String getErrorTarget() {
        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
