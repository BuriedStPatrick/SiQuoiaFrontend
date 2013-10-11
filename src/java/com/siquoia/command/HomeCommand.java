/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.command;

import com.siquoia.exception.CommandException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author PC
 */
public class HomeCommand extends TargetCommand{

    @Override
    public String execute(HttpServletRequest req) throws CommandException {
        return super.execute(req); //To change body of generated methods, choose Tools | Templates.
    }
    
}
