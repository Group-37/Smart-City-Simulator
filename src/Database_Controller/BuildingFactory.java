/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database_Controller;
import City_Parts.*;
/**
 *
 * @author user1
 */
public class BuildingFactory {
     public Building Build(String symbol){
      
     
         
      if(symbol.equalsIgnoreCase("h")){
         House h = new House();
		h.hoursOcc = 7;
		h.energyCost =   (float) ((Math.random() * 4.0) + 2.0);
		h.residents =   (int) ((int) (Math.random() * 4.0) + 2.0);
		h.heatingCost =  (float) ((float) (Math.random() * 2.0) + 1.0);
		h.uValue = 0.19f;
                        
                double peopleHours = h.residents * h.hoursOcc;
		 
		double dailyEnergy = h.energyCost * peopleHours;
		
		double dailyHeating = h.heatingCost * peopleHours * h.uValue;
                
        return h;
        }  
      
      else if(symbol.equalsIgnoreCase("a")){
         Apartment a = new Apartment();
		 
                a.hoursOcc = 7;
		a.energyCost =  (float) ((float) (Math.random() * 44.0) + 22.0);
		a.residents =  (int) (Math.random() * 60) + 40;
		a.heatingCost =  (float) ((float) (Math.random() * 22.0) + 17.0);
		a.uValue = 0.19f;
                        
                double peopleHours = a.residents * a.hoursOcc;
		 
		double dailyEnergy = a.energyCost* peopleHours;
		
		double dailyHeating = a.heatingCost * peopleHours * a.uValue;
   
       return a;			
      }
	 
	  if(symbol.equalsIgnoreCase("p")){
        
		PowerPlant p = new PowerPlant();
		 
                p.hoursOcc = 24;
		p.energyCost =  (float) ((float) (Math.random() * 1000.0) + 500.0);
		p.residents =  (int) (Math.random() * 60) + 30;
		p.heatingCost =  (float) ((float) (Math.random() * 200.0) + 100.0);
		p.uValue = 0.19f;
                        
                double peopleHours = p.residents * p.hoursOcc;
		 
		double dailyEnergy = p.energyCost* peopleHours;
		
		double dailyHeating = p.heatingCost * peopleHours * p.uValue;
                
                return p;
		 
      }
	 
          
          else if(symbol.equalsIgnoreCase("f")){
        Factory f = new Factory();
	
		 
                f.hoursOcc = 8;
		f.energyCost =  (float) ((float) (Math.random() * 300.0) + 200.0);
		f.residents =  (int) (Math.random() * 80) + 40;
		f.heatingCost =  (float) ((float) (Math.random() * 80.0) + 50.0);
		f.uValue = 0.19f;
                        
                double peopleHours = f.residents * f.hoursOcc;
		 
		double dailyEnergy = f.energyCost* peopleHours;
		
		double dailyHeating = f.heatingCost * peopleHours * f.uValue;	 
           
                return f;
                
             
      }
          
	  else if(symbol.equalsIgnoreCase("s")){
         School s = new School();
		 
                s.hoursOcc = 24;
		s.energyCost =  (float) ((float) (Math.random() * 120.0) + 70.0);
		s.residents =  (int) (Math.random() * 220) + 130;
		s.heatingCost =  (float) ((float) (Math.random() * 120.0) + 70.0);
		s.uValue = 0.19f;
                        
                double peopleHours = s.residents * s.hoursOcc;
		 
		double dailyEnergy = s.energyCost* peopleHours;
		
		double dailyHeating = s.heatingCost * peopleHours * s.uValue;
		 
		return s; 
      } 
	 
       else if(symbol.equalsIgnoreCase("g")){
        GardaStation g = new GardaStation();
	
		 
                g.hoursOcc = 24;
		g.energyCost =  (float) ((float) (Math.random() * 15.0) + 8.0);
		g.residents =  (int) (Math.random() * 20) + 10;
		g.heatingCost =  (float) ((float) (Math.random() * 12.0) + 7.0);
		g.uValue = 0.19f;
                        
                double peopleHours = g.residents * g.hoursOcc;
		 
		double dailyEnergy = g.energyCost* peopleHours;
		
		double dailyHeating = g.heatingCost * peopleHours * g.uValue;	 
           
                return g;
      }
	  
	  if(symbol.equalsIgnoreCase("+")){
        Hospital hos = new Hospital();
	
		 
                hos.hoursOcc = 24;
		hos.energyCost =  (float) ((float) (Math.random() * 280.0) + 140.0);
		hos.residents =  (int) (Math.random() * 450) + 300;
		hos.heatingCost =  (float) ((float) (Math.random() * 180.0) + 130.0);
		hos.uValue = 0.19f;
                        
                double peopleHours = hos.residents * hos.hoursOcc;
		 
		double dailyEnergy = hos.energyCost* peopleHours;
		
		double dailyHeating = hos.heatingCost * peopleHours * hos.uValue;
		 
		 
           return hos;
      } 
      
      return null;
   }

}


