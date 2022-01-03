package com.example.barka;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application
{
    public static ArrayList<Post> appPosts;
    public static ArrayList<Category> appCategories;

    @Override
    public void onCreate() {
        super.onCreate();

        appCategories = new ArrayList<Category>();
        appCategories.add(new Category("Books"));
        appCategories.add(new Category("Clothes"));
        appCategories.add(new Category("Electronics"));
        appCategories.add(new Category("Furniture"));
        appCategories.add(new Category("Shoes"));
        appCategories.add(new Category("Others"));

        appPosts = new ArrayList<Post>();
        appPosts.add(new Post(
                "This computer is 2 years old. i just got a new macbook, " +
                        "so i decided to giveaway the old one.",
                "Electronics",
                "Mike",
                "Beijing,dayuncun building 10",
                true));
        appPosts.add(new Post(
                "I have some books that i read many times. " +
                        "i want to exchange with someone who is " +
                        "interested.",
                "Books",
                "Eduard",
                "Tianjin University",
                true));
        appPosts.add(new Post(
                "I am traveling back to country. I have some furniture " +
                        "in my apartment, i would like to giveaway in exchange with " +
                        "small money",
                "Furniture",
                "Mike",
                "San pedro, Rue 14, porte 413s",
                false));
        appPosts.add(new Post(
                "This jacket is not fitting me anymore, and i wore it " +
                        "only twice. it is still new. If you are interested contact me. " +
                        "it is free",
                "Clothes",
                "Angela",
                "New York city, open bar 13 Road 14 apart 5",
                true));
        appPosts.add(new Post(
                "My Dad got me a new car for my birthday. I want to " +
                        "dash someone with my motobike.",
                "Others",
                "Omar",
                "Ouaga, Rimkieta rue 14 ligne 21 porte 3453",
                true));
        appPosts.add(new Post(
                "There was a promotion yesterday,i bought one shoe and got " +
                        "one extra shoe. Obviously i can't wear both shoes. " +
                        "If someone need it, please contact me. ",
                "Shoes",
                "Karim",
                "Oscar, Road 32 bld 14 dance parc",
                true));
    }
}
