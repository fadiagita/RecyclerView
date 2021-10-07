package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesRecyclerViewAdaptor adaptor;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        objMovies.add(new Movies("The Sucide Squad", "Action, Advanture, Comedy", "James Dunn", 7.3, "Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.", "6 Agustus 2021", R.drawable.poster2));
        objMovies.add(new Movies("Joker", "Crime", "Todd Philips", 8.4, "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.", "4 Oktober 2019", R.drawable.poster3));
        objMovies.add(new Movies("A Quite Place II", "Horor", "John Krasinski", 7.3, "Following the events at home, the Abbott family now face the terrors of the outside world. Forced to venture into the unknown, they realize the creatures that hunt by sound are not the only threats lurking beyond the sand path.", "28 Mei 2020", R.drawable.poster1));
        objMovies.add(new Movies("Parasite", "Comedy, Drama, Thriller", "Bong Joon Ho", 8.6, "Greed and class discrimination threaten the newly formed symbiotic relationship between the wealthy Park family and the destitut", "2019", R.drawable.poster4));
        objMovies.add(new Movies("The Conjuring III", "Horor, Mystery, Thriller", "Michael Chaves", 6.3, "The Warrens investigate a murder that may be linked to a demonic possession.", "4 June 2021", R.drawable.poster5));
        objMovies.add(new Movies("The Fault in Our Stars", "Drama, Romace", "Josh Boone", 7.7, "Two teenage cancer patients begin a life-affirming journey to visit a reclusive author in Amsterdam.", "6 June 2014", R.drawable.poster6));
        objMovies.add(new Movies("Incredibles 2", "Animation, Action, Adventure", "Brad Bird", 7.6, "The Incredibles family takes on a new mission which involves a change in family roles: Bob Parr (Mr. Incredible) must manage the house while his wife Helen (Elastigirl) goes out to save the world.", "15 June 2018", R.drawable.poster7));
        objMovies.add(new Movies("Frozen II", "Animation, Adventure, Comedy", "Chris Buck, Jennifer Lee", 6.8, "Anna, Elsa, Kristoff, Olaf and Sven leave Arendelle to travel to an ancient, autumn-bound forest of an enchanted land. They set out to find the origin of Elsa's powers in order to save their kingdom.", "22 November 2019", R.drawable.poster8));
        objMovies.add(new Movies("Aladdin", "Adventure, Comedy, Family", "Guy Ritchie", 6.9, "A kind-hearted street urchin and a power-hungry Grand Vizier vie for a magic lamp that has the power to make their deepest wishes come true.", "24 May 2019", R.drawable.poster9));

        adaptor = new MoviesRecyclerViewAdaptor(objMovies);
        recyclerView.setAdapter(adaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }
}