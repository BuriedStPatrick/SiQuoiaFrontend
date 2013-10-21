/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.dummy;

/**
 *
 * @author PC
 */
public class DBManager {
    private static DBManager instance;
    
    private DBManager(){
        
    }
    
    public static DBManager getInstance(){
        if(instance == null)
            instance = new DBManager();
        return instance;
    }
    
    /** DUMMY METHODS **/
    
}
