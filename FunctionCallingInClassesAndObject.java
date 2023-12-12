public class FunctionCallingInClassesAndObject {

    public static class YoutubeVideo{
        String name;
        int noOfLikes;
        int noOfViews;

        int noOfViews(){
            return noOfViews++;
        }
    }

    public static void main(String[] args) {
        YoutubeVideo songVideo = new YoutubeVideo();
        songVideo.name = "kesariya";
        songVideo.noOfLikes = 2000;
        songVideo.noOfViews = 999;

        songVideo.noOfViews();

        System.out.println(songVideo.noOfViews);
    }
}
