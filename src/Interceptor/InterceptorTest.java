/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

import java.util.logging.Level;

/**
 *
 * @author user1
 */
public class InterceptorTest {
   
  
public static void main(String[] args){
String msg = "Working";
   
   String[] test = new String[3];
try{
    System.out.println(test[4]);
}

catch (Exception e) {
   Interceptor in = new ConcreteInterceptor();
    Dispatcher.getInstance().register(in);
    Dispatcher.getInstance().dispatch(new ConcreteContext(Level.SEVERE, e, msg));
    //disp.dispatch(item);
    
}
}
   
}
