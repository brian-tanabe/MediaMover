package com.tanabe.mm.json;

import java.util.List;

/**
 * Created by Brian on 7/21/2014.
 */
public class Setup {
    private String tvDirectory;
    private List<Show> shows;

    public Setup(String tvDirectory, List<Show> shows){
        this.tvDirectory = tvDirectory;
        this.shows = shows;
    }

    public String getTvDirectory() {
        return tvDirectory;
    }

    public List<Show> getShows() {
        return shows;
    }
}
