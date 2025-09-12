package reviewall.CClass;

public class ClassEx1 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "헝거게임";
        movieReview1.review = "시리즈물 격투";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "메이즈러너";
        movieReview2.review = "시리즈물 달리기";

        MovieReview[] movieReviews = new MovieReview[]{movieReview1, movieReview2};


        for (MovieReview movieReview : movieReviews) {
            System.out.println(movieReview.title + " " + movieReview.review);
        }

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println(movieReviews[i].title + " " + movieReviews[i].review);
        }
    }
}
