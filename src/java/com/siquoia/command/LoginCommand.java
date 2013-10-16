/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.command;

import com.siquoia.dummy.UserDummy;
import com.siquoia.exception.CommandException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author PC
 */
public class LoginCommand extends TargetCommand{

    public LoginCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        UserDummy person = new UserDummy("hej@hej.dk", "hej123");
        if(person.getEmail().equals(request.getParameter("email")) && person.getPassword().equals(request.getParameter("password")))
            return super.execute(request);
        else
            throw new CommandException(target);
    }
    
}
