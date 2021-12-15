package Final;

import java.util.List;

public class Netflix {
    private List<Genre> genres;
    public List<Genre> getGenres() {
        return genres;
    }
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Netflix(List<Genre> genres){

        this.genres=genres;
    }
}
