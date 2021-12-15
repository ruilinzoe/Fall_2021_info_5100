package Final;

import java.util.List;

public class Genre {
    private List<Movie> movies;
    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Genre(List<Movie> movies){
        this.movies=movies;
    }
}
