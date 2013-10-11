/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.exception;

/**
 *
 * @author PC
 */
public class CommandException extends Exception{
    
    public String getErrorTarget(){
        return "/error.jsp";
    }
}
