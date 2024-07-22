package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "theater")
public class Theater {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer theaterId;

	    private String name;
	    private String location;
	    private int capacity;

	    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Showtime> showtime;

		public Integer getTheaterId() {
			return theaterId;
		}

		public void setTheaterId(Integer theaterId) {
			this.theaterId = theaterId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		public List<Showtime> getShowtime() {
			return showtime;
		}

		public void setShowtime(List<Showtime> showtime) {
			this.showtime = showtime;
		}

		@Override
		public String toString() {
			return "Theater [theaterId=" + theaterId + ", name=" + name + ", location=" + location + ", capacity="
					+ capacity + ", showtime=" + showtime + ", getTheaterId()=" + getTheaterId() + ", getName()="
					+ getName() + ", getLocation()=" + getLocation() + ", getCapacity()=" + getCapacity()
					+ ", getShowtime()=" + getShowtime() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}

		public Theater(Integer theaterId, String name, String location, int capacity, List<Showtime> showtime) {
			super();
			this.theaterId = theaterId;
			this.name = name;
			this.location = location;
			this.capacity = capacity;
			this.showtime = showtime;
		}

		public Theater() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
