package com.iamsireesh.moviecatalogservice.modals;

public class CatalogItem {
	private String movieName;
	private String desc;
	private int rating;

	public CatalogItem(String movieName, String desc, int rating) {
		super();
		this.movieName = movieName;
		this.desc = desc;
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
