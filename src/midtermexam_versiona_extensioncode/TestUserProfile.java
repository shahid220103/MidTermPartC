/*
 * Mohammad Shahid
 *  991675314  * 
 */

/**
 *
 * @author shahimoh
 */

package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Choose your favourite genre from the following options:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        int choice = scanner.nextInt();
        String genre = genres[choice - 1];
        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("Your userProfile was created!");
    }
}

