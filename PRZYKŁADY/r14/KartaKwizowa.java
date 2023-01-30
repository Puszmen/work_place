import java.io.*;

public class KartaKwizowa implements Serializable {

     private String uniqueID;
     private String category;
     private String question;
     private String answer;
     private String hint;

     public KartaKwizowa(String q, String a) {
         question = q;
         answer = a;
    }


     public void setUniqueID(String id) {
        uniqueID = id;
     }

     public String getUniqueID() {
        return uniqueID;
     }

     public void setCategory(String c) {
        category = c;
     }

     public String getCategory() {
         return category;
     }

     public void setPytanie(String q) {
        question = q;
     }

     public String getPytanie() {
        return question;
     }

     public void setOdpowiedz(String a) {
        answer = a;
     }

     public String getOdpowiedz() {
        return answer;
     }

     public void setHint(String h) {
        hint = h;
     }

     public String getHint() {
        return hint;
     }
} 