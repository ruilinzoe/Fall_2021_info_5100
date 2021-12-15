package Final;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Mainq4 {
    public static void main(String[] args) throws ParseException {
        Date date2000 = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date date1990 = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Movie movie1=new Movie("movie1",new GregorianCalendar(2008, Calendar.JANUARY, 1).getTime(), Arrays.asList("Actor1","Actor2"), "director1");
        Movie movie2=new Movie("movie2",new GregorianCalendar(2007, Calendar.JANUARY, 1).getTime(), Arrays.asList("Actor1","Actor2"), "director1");
        Movie movie3=new Movie("movie3",new GregorianCalendar(2005, Calendar.JANUARY, 1).getTime(), Arrays.asList("Actor1","Actor2"), "director1");
        Movie movie4=new Movie("movie4",new GregorianCalendar(1899, Calendar.JANUARY, 1).getTime(), Arrays.asList("Actor1","Actor2"), "director1");


        List<Movie> movieList1 = new ArrayList<>();
        movieList1.add(movie1);
        movieList1.add(movie2);

        List<Movie> movieList2 = new ArrayList<>();
        movieList2.add(movie3);
        movieList2.add(movie4);

        Genre Horror = new Genre(movieList1);
        Genre Happy = new Genre(movieList2);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(Horror);
        genreList.add(Happy);

        Netflix netflix = new Netflix(genreList);

//        For all movies released before 2000, add the string "(Classic)" to the title of the movie using
//        flatMap.
        netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.getDate().before(date2000))
                .forEach(movie -> movie.title = "(Classic)"+movie.title);

//        Get the latest 3 movies released using .limit() method of stream.
        List<Movie> latest3 = netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream()).sorted(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getDate().compareTo(o1.getDate());
            }
        }).limit(3).collect(Collectors.toList());


        List<Movie> listOfAllMovie = netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream()).collect(Collectors.toList());
        Predicate<Movie> dateBefore2000 = movie -> movie.getDate().before(date2000);
        Predicate<Movie> dateAfter1990 = movie -> movie.getDate().after(date1990);
        printMovieInRange((ArrayList<Movie>) listOfAllMovie, dateBefore2000, dateAfter1990);


        for(Movie movie : listOfAllMovie) addReleaseYear(movie);


        Collections.sort(listOfAllMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
    }

    private static void printMovieInRange(ArrayList<Movie> res, Predicate<Movie> condition1, Predicate<Movie> condition2){
        for (Movie movie: res) {
            if(condition1.test(movie) && condition2.test(movie)){
                System.out.println(movie.title);
            }
        }
    }

    private static void addReleaseYear(Movie movie) {
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        String year = yearFormat.format(movie.getDate());
        movie.title =year+movie.title;
    }
}