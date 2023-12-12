public class Constructor {

    public static class YoutubeVideo{
        String name;
        int noOfLikes;
        int noOfViews;
        
        //Constructor OverLoading--------------------------------------------------------------------------------------

        // Non-Paramaterised Constructor------------------------------------------------
        YoutubeVideo(){
            name = "Anonymous";
            noOfLikes = 0;
            noOfViews = 0;
        }

        // Parameterised Construtor------------------------------------------------------
        YoutubeVideo(String name , int noOfLikes , int noOfViews){
            this.name = name;
            // name = newname;  // can also do this-------------------------------
            this.noOfLikes = noOfLikes;
            this.noOfViews = noOfViews;
        }
        void print(){
            System.out.println(this.name);
            System.out.println(this.noOfLikes);
            System.out.println(this.noOfViews);
        }
    }
    public static void main(String[] args) {
        System.out.println();

        // Non-Paramaterised Constructor------------------------------------------------
        YoutubeVideo songVideo = new YoutubeVideo();
        songVideo.print();
        System.out.println();

        // Can do this also----------------------------
        System.out.println(songVideo.name);
        System.out.println(songVideo.noOfLikes);
        System.out.println(songVideo.noOfViews);

        System.out.println();

        // Parameterised Construtor------------------------------------------------------
        YoutubeVideo songVideo1 = new YoutubeVideo("kesariya" , 1000 , 5000);
        songVideo1.print();

        System.out.println();
    }
}
