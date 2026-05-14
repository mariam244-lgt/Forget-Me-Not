
package service;
import java.time.LocalDate;
public class ReviewService {
 private final SRSservice  srsService = new SRSservice();
 public void submitAnswer(String rating, String currentStatus){
 LocalDate nextDate = srsService.calculateNextReviewDate(LocalDate.now(), rating);
 String newStatus = srsService.updateCardsStatus(currentStatus,rating);
 System.out.println("Processing Reward:" + rating);
 System.out.println("Rating Given:" + rating);
 System.out.println("New Status:" + newStatus);
 System.out.println("Next Review :" + nextDate);
 }
 public void startReview(){
     System.out.println("Review Session Started");
 }
}
