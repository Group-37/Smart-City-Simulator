/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interceptor;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author user1
 */
public class Dispatcher  {
    
    private static Dispatcher dispatcher;
    ArrayList<Interceptor> interceptors = new ArrayList<Interceptor>();
    
    
    private void Dispatcher(){
     interceptors = new ArrayList();
    }
    
    public static Dispatcher getInstance(){
        if(dispatcher == null){
            dispatcher = new Dispatcher();
            return dispatcher;
        }
        else{
            return dispatcher;
        }
    }
    
    public synchronized void register(Interceptor i){
    interceptors.add(i);
    }
    
    public synchronized void unregister(Interceptor i){
    interceptors.remove(i);
    }
    
    public void dispatch(Context item){
     ArrayList interceptorList;

          
            synchronized(this){
            interceptorList = (ArrayList) this.interceptors.clone();
        }

            for (int j = 0; j < interceptorList.size(); j++)
            {
                Interceptor interceptor = (Interceptor) interceptorList.get(j);
                interceptor.ConsumeService(item);
            }
    }
    
}
