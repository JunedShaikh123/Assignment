package com.springcoreQ13;

public class Account {

int ticketCount;
	
	Movie movie;

	public int getTicketCount() {
		return ticketCount;
	}

	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	
	
	public void count()
	{
		int abc=(int) (movie.ticketPrice*ticketCount);
		System.out.println(abc);
	}

}


