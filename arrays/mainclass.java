import java.util.Scanner;
class Theater{
    private Movie[] movie;
    int num;
    Theater(int capacity){
        movie = new Movie[capacity];
        num = 0;
    }
    void addMovie(String MovieName,String Genre,double Ticket,double rating){
        if(num<movie.length){
            movie[num] = new Movie(MovieName,Genre,Ticket,rating);
            num++;
        }
        else{
            System.out.println("cannot enter more movies.");
        }
    }
    void display(){
        for(int i=0;i<num;i++){
            System.out.println(movie[i].getMovieName());
            movie[i].displayMovie();
        }
    }
    void Search(String nameofmovie){
        for(int i=0;i<num;i++){
            if(nameofmovie.equals(movie[i].getMovieName())){
                System.out.println("movie found");
            }
        }
    }
    void sortMove(){
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-i-1;j++){
                if(movie[j].Rating()>movie[j+1].Rating()){
                    Movie temp = movie[j];
                    movie[j]= movie[j+1];
                    movie[j+1]= temp;
                }
            }
        }
        for(int i=0;i<movie.length;i++){
            System.out.println(movie[i].getMovieName()+"-Rating:"+movie[i].Rating());
        }
    }
    class Movie{
        private String MovieName;
        private String Genre;
        private double Ticket;
        private double rating;
        Movie(String MovieName,String Genre,double Ticket,double rating){
            this.MovieName = MovieName;
            this.Genre = Genre;
            this.Ticket = Ticket;
            this.rating = rating;
        }
        void displayMovie(){
            System.out.println("movie is:"+MovieName);
            System.out.println("Genre:"+Genre);
            System.out.println("Ticket:"+Ticket);
            System.out.println("Rating:"+rating);
        }
        double UpdateMovieRating(double rate){
            rating = rate;
            return rating;
        }
        String getMovieName(){
            return MovieName;
        }
        double Rating(){
            return rating;
        }
    }
}
public class mainclass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Theater M = new Theater(5);
        M.addMovie("ActionMovie", "Action", 200.0, 4.5);
        M.addMovie("DramaMovie", "Drama", 150.0, 3.8);
        M.addMovie("ComedyMovie", "Comedy", 100.0, 4.2);
        M.display();
        M.sortMove();
    }
}
