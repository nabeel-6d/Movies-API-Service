package com.example.moviesapp.moviesinfoapi.models;

public class Movie {
    private String id;
    private String title;
    private String overview;

    
    public Movie() {
        System.out.println("in no-arg cnstr of movie");
    }


    public Movie(String id, String title, String overview) {
        this.id = id;
        this.title = title;
        this.overview = overview;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getOverview() {
        return overview;
    }


    public void setOverview(String overview) {
        this.overview = overview;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((overview == null) ? 0 : overview.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (overview == null) {
            if (other.overview != null)
                return false;
        } else if (!overview.equals(other.overview))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", overview=" + overview + "]";
    }
   
}
