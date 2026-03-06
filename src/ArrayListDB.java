import java.io.*;
import java.util.Scanner;

public class ArrayListDB {
    private AlbumArrayList albumList;

    public ArrayListDB() {
        albumList = new AlbumArrayList();
    }

    public void loadTransactions(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            processTransaction(line);
        }

        scanner.close();
    }

    private void processTransaction(String transaction) {
        String[] parts = transaction.split(":");
        if (parts.length < 2){
            return;
        }
        String command = parts[0];
        String details = parts[1];
        Album album = new Album(details);

        if (command.equals("ADD")) {
            albumList.add(album);
        } else if (command.equals("REMOVE")) {
            albumList.remove(album);
        }
    }

    public void startUserInteraction() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Please provide instructions: ADD, REMOVE, LIST, QUIT");
        input = scanner.nextLine();
        while (!input.equals("QUIT")){
            if (input.startsWith("ADD")) {
                System.out.println("Enter artist name:");
                String artistName = scanner.nextLine();
                // System.out.println("Enter album name:");
                // String albumName = scanner.nextLine();
                Album album = new Album(artistName);
                albumList.add(album);
                System.out.println("Album added.");
    

            } else if (input.startsWith("REMOVE")) {
                System.out.println("Enter the number of the album to be removed:");
                int albumNumber;
                if (scanner.hasNextInt()) {
                    albumNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    if (albumNumber >= 1 && albumNumber <= albumList.size()) {
                        albumList.remove(albumNumber - 1);
                        System.out.println("Album removed.");
                    } else {
                        System.out.println("Invalid album number.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine(); 
                }

            } else if (input.equals("LIST")) {
                System.out.println("--" + albumList.size() + " albums--");
                for (int i = 0; i < albumList.size(); i++) {
                    System.out.println((i + 1) + ". " + albumList.get(i));
                }
                if (albumList.size() == 0) {
                    System.out.println("No albums in the list.");
                }
    
            } else {
                System.out.println("Invalid command. Please provide instructions: ADD, REMOVE, LIST, QUIT");
            }

            System.out.println("Please provide instructions: ADD, REMOVE, LIST, QUIT");
            input = scanner.nextLine();
        }

        scanner.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 1) {
            System.out.println("Usage: java ArrayListDB <transaction_file>");
            return;
        }

        ArrayListDB db = new ArrayListDB();
        db.loadTransactions(args[0]);
        db.startUserInteraction();
    }
}
