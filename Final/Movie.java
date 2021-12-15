package Final;

import java.util.*;

public class Movie {
//    Movie class has Title of
//            movie, Release date, List of actors, Director
    String title;
    private String director;
    private List<String> actors;
    private Date ReleaseDate;
    public Movie(String title, Date ReleaseDate, List<String> actors, String director){
        this.title=title;
        this.ReleaseDate=ReleaseDate;
        this.actors=actors;
        this.director=director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public Date getDate() {
        return ReleaseDate;
    }

    public void setDate(Date date) {
        this.ReleaseDate = date;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", actors=" + actors +
                ", date=" + ReleaseDate +
                '}';
    }
}
