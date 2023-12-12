import java.util.ArrayList;

public class  ClassesAndObject {

    public static class YoutubeVideo{
        String name;
        int noOfLikes;
        int noOfViews;
        ArrayList<String> comments;
    }

    public static void main(String[] args) {
        
        YoutubeVideo songVideo = new YoutubeVideo();

        songVideo.comments = new ArrayList<>();
        songVideo.comments.add("Nice");
        songVideo.comments.add("Mind blowing");

        songVideo.name = "Kesariya";
        songVideo.noOfLikes = 50000;
        songVideo.noOfViews = 100000;
        
        System.out.println(songVideo.name);
        System.out.println(songVideo.noOfLikes);
        System.out.println(songVideo.noOfViews);
        System.out.println(songVideo.comments);

    }
}