package CollectionsFramework.List.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SongsPlaylist {
    public static void main(String[] args) {
        
        LinkedList<String> playlist = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        playlist.add("Don't Look");
        playlist.add("Ghabru");
        playlist.add("At Peace");
        playlist.add("Nothing Lasts");
        playlist.add("Winning Speech");
        playlist.add("Red Eyes");

        ListIterator<String> songs =  playlist.listIterator();
        boolean forwardDirection = true;

        int option;
        do{
             System.out.println("\n---Playlist Menu ---");
            System.out.println("1. Show Playlist");
            System.out.println("2. Add Song");
            System.out.println("3. Play Next Song");
            System.out.println("4. Play Previous Song");
            System.out.println("5. Remove Current Song");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            option = s.nextInt();
            s.nextLine();

            switch(option){
                case 1 -> System.out.println("Karan Aujla PlayList"+playlist);
                case 2 -> {
                    System.out.println("Enter Karan Aujla's Song :");
                    String newSong = s.nextLine();
                    songs.add(newSong);
                }
                case 3 -> {
                    if(!forwardDirection){
                        if(songs.hasNext()) songs.next();
                        forwardDirection = true;
                    }
                    if(songs.hasNext()){
                        System.out.println("Playing: "+songs.next());
                    }
                    else{
                        System.out.println("you are already at the end of the playlist!");
                    }
                }
                case 4 -> {
                    if(forwardDirection){
                        if(songs.hasPrevious()) songs.previous();
                        forwardDirection = false;
                    }
                    if(songs.hasPrevious()){
                        System.out.println("Playing : "+songs.previous());
                    }
                    else{
                        System.out.println("You are already at the top of the Playlist !");
                    }
                }
               case 5 -> {
                    if (playlist.isEmpty()) {
                        System.out.println("Nothing to Remove ... Playlist is Empty!");
                        break;
                    }

                    if (forwardDirection) {
                        if (songs.hasPrevious()) {
                            String removedSong = songs.previous();
                            songs.remove();
                            System.out.println("Removed: " + removedSong);
                        } else {
                            System.out.println("No song to remove (Already at the start)");
                        }
                    } else {
                        if (songs.hasNext()) {
                            String removedSong = songs.next();
                            songs.remove();
                            System.out.println("Removed: " + removedSong);
                        } else {
                            System.out.println("No song to remove (Already at the end)");
                        }
                    }
                    break;
                }

                case 0 -> System.out.println("Exiting from the Playlist !");
            }
        }while(option!=0);
        s.close();
    }
}
