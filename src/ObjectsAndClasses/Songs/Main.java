package ObjectsAndClasses.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String[] inputData = scan.nextLine().split("_");
            String typeList = inputData[0];
            String songName = inputData[1];
            String time = inputData[2];

            Song song = new Song(typeList,songName,time);
            song.setTypeList(typeList);
            song.setName(songName);
            song.setTime(time);

            songs.add(song);

        }
        String typeListOrAll = scan.nextLine();
        if(typeListOrAll.equals("all")){
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        }else{
            for (Song song : songs) {
                if(song.getTypeList().equals(typeListOrAll)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
