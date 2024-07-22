package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "showtime")
public class Showtime {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long showtimeId;

	    private String movie;
	    private String showtime;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "theater_id")
	    private Theater theater;

		public Long getShowtimeId() {
			return showtimeId;
		}

		public void setShowtimeId(Long showtimeId) {
			this.showtimeId = showtimeId;
		}

		public String getMovie() {
			return movie;
		}

		public void setMovie(String movie) {
			this.movie = movie;
		}

		public String getShowtime() {
			return showtime;
		}

		public void setShowtime(String showtime) {
			this.showtime = showtime;
		}

		public Theater getTheater() {
			return theater;
		}

		public void setTheater(Theater theater) {
			this.theater = theater;
		}

		@Override
		public String toString() {
			return "Showtime [showtimeId=" + showtimeId + ", movie=" + movie + ", showtime=" + showtime + ", theater="
					+ theater + ", getShowtimeId()=" + getShowtimeId() + ", getMovie()=" + getMovie()
					+ ", getShowtime()=" + getShowtime() + ", getTheater()=" + getTheater() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

		public Showtime(Long showtimeId, String movie, String showtime, Theater theater) {
			super();
			this.showtimeId = showtimeId;
			this.movie = movie;
			this.showtime = showtime;
			this.theater = theater;
		}

		public Showtime() {
			super();
			// TODO Auto-generated constructor stub
		}

	    
}
