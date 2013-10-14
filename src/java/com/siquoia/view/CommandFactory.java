/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.view;

import com.siquoia.command.Command;
import com.siquoia.command.TargetCommand;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class CommandFactory {
    private static CommandFactory instance;
    private HashMap<String, Command> commands;
    
    private CommandFactory(){
        commands = new HashMap<String, Command>();
        setupCommands();
    }
    
    public static CommandFactory getInstance(){
        if(instance == null)
            instance = new CommandFactory();
        return instance;
    }
    
    private void setupCommands(){
        commands.put(null, new TargetCommand("index.jsp"));
        commands.put("home", new TargetCommand("index.jsp"));
    }
    
    public Command findCommand(String name){
        return commands.get(name);
    }
    
}
