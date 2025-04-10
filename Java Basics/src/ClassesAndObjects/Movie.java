package ClassesAndObjects;

public class Movie {

    String  title;
    String genre;
    int rate;

    // Constructor for Movie with all attributes

    public Movie(String title,String genre, int rate){
        this.title = title;
        this.genre = genre;
        this.rate = rate;

    }
    // Method for displaying details

    public void displayDetailsMovie(){
        System.out.println("Title:" + title);
        System.out.println("Genre:" + genre);
        System.out.println("Rate:" + rate);
        System.out.println();
    }

    public static void main(String[] args) {
        //Creating Movies objects

        Movie myMovie = new Movie("Expendables","action",9);
        Movie myMovie1 = new Movie("Expendables2","Thriller",4);
        Movie myMovie2 = new Movie("Sun","drama",6);

        myMovie.displayDetailsMovie();
        myMovie1.displayDetailsMovie();
        myMovie2.displayDetailsMovie();

    }

}
