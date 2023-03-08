package midtermexam_versiona_extensioncode;

public class UserProfile {
    
    private String userID;
    private String genre;
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
    
    /**
    * The user profile for the OnlineVids system. The user has a userID
    * and a favourite genre that must be one of the choices in the
    * genres array. This code is to be used for SYST 17796 midterm exam.
    * Students are reminded to add themselves as modifiers when editing the
    * code.
    * @author shahimoh, 2023
    */
    
    public UserProfile(String givenID, String givenGenre) {
        userID = givenID;
        // Check if the provided genre is one of the available genres
        boolean validGenre = false;
        for (String g : genres) {
            if (g.equals(givenGenre)) {
                validGenre = true;
                break;
            }
        }
        if (validGenre) {
            genre = givenGenre;
        } else {
            genre = "Unknown";
        }
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        // Check if the provided genre is one of the available genres
        boolean validGenre = false;
        for (String g : genres) {
            if (g.equals(genre)) {
                validGenre = true;
                break;
            }
        }
        if (validGenre) {
            this.genre = genre;
        } else {
            System.out.println("Invalid genre. Genre must be one of: " + String.join(", ", genres));
        }
    }
}
