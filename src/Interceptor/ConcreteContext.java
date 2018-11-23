/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

import static com.sun.activation.registries.LogSupport.log;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author user1
 */
public class ConcreteContext implements Context{

    Level level;
    Exception exception;
    String message;
    Date time;
    
    public ConcreteContext(Level lvl, Exception ex, String msg)
        {
            level = lvl;
            exception = ex;
            message = msg;
            time = new Date();
        }
    @Override
    public Level getLevel() {
       return level;
    }

    @Override
    public Exception getException() {
        return exception;
    }

    @Override
    public String getMessage() {
       return message;
    }
    
    @Override
    public Date getTime() {
       return time;
    }

    @Override
    public void Service() {
       Logger l = Logger.getLogger(ConcreteContext.class.getName());
       String lnSkip = "\n";
       l.log(this.getLevel(),  lnSkip + (this.getTime() + lnSkip + this.getException().getClass().getSimpleName() + lnSkip + this.getMessage()));
       
    }
    
}
