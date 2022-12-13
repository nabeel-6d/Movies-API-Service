package com.example.moviesapp.moviesinfoapi.controllers;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.moviesapp.moviesinfoapi.models.Movie;
import com.example.moviesapp.moviesinfoapi.models.Movie_Item;


@RestController
@RequestMapping("/movie")
public class MovieResource {

    // @Value("${api.key}")
    // private String api_key;

    @Autowired
    private RestTemplate rest;

    @GetMapping("/{movieid}")
    public Movie getTheMovieDetails(@PathVariable(name = "movieid") String id){
        try{
            Movie_Item mv=rest.getForObject("https://api.themoviedb.org/3/movie/550?api_key=e8fe6ddd609a0cd1b1392c37100224ca", Movie_Item.class);
           // https://api.themoviedb.org/3/movie/550?api_key=e8fe6ddd609a0cd1b1392c37100224ca
            return new Movie(id,mv.getTitle(),mv.getOverview());
        }
         catch (Exception e) {
           System.out.println("---------------------------------------");
           e.printStackTrace();
           System.out.println("---------------------------------------");
        }
     return null; 
    }
}