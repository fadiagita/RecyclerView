package com.example.recyclerview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoviesRecyclerViewAdaptor extends RecyclerView.Adapter<MoviesRecyclerViewAdaptor.MovieViewHolder> {
    ArrayList<Movies> arrayListMovies;

    public MoviesRecyclerViewAdaptor(ArrayList<Movies> arrayListMovies) {
        this.arrayListMovies = arrayListMovies;
    }

    @NonNull
    @Override
    public MoviesRecyclerViewAdaptor.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesRecyclerViewAdaptor.MovieViewHolder holder, int position) {
        final Movies movies = arrayListMovies.get(position);

        holder.textViewTitle.setText(movies.getTitle());
        holder.textViewRating.setText(String.valueOf(movies.getRating()));
        holder.textViewReleaseDate.setText(movies.getReleasedate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailMovieActivity.class);
                intent.putExtra("MOVIES", movies);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListMovies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewRating, textViewReleaseDate;

        public MovieViewHolder(@NonNull View intenView) {
            super (intenView);
            textViewTitle = intenView.findViewById(R.id.tvTitle);
            textViewRating = intenView.findViewById(R.id.tvRating);
            textViewReleaseDate = intenView.findViewById(R.id.ReleaseDate);
        }
    }
}
