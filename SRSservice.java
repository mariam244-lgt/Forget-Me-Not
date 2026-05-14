
package service;

import java.time.LocalDate;
public class SRSservice {
 private final double easyFactor=2.5;
 public LocalDate calculateNextReviewDate(LocalDate now, String rating){
LocalDate today =LocalDate.now() ;

sssint daysToAdd = 0;
if(rating.equalsIgnoreCase("easy")){
daysToAdd = (int)(3*easyFactor);
}else if(rating.equalsIgnoreCase("hard")){
daysToAdd = 1;
}else{
    daysToAdd = 0;
}
return today.plusDays(daysToAdd);
 }
    public String updateCardstatus(String currentStatus,String rating){
    if(rating.equalsIgnoreCase("wrong")){
        return "Learning";
    }else if(currentStatus.equalsIgnoreCase("New")){
        return "Learning";
    }else{
        return "Review";
    }
    
    }

    String updateCardsStatus(String currentStatus, String rating) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}




 
 
 
 
 }
        
        
        
        
   
 
}
