package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FluTrackPojo {
	
	private String user_name;
	private String tweet_text;
	private String latitude;
	private String longitude;
	private String tweet_date;
	private String aggravation;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getTweet_text() {
		return tweet_text;
	}

	public void setTweet_text(String tweet_text) {
		this.tweet_text = tweet_text;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getTweet_date() {
		return tweet_date;
	}

	public void setTweet_date(String tweet_date) {
		this.tweet_date = tweet_date;
	}

	public String getAggravation() {
		return aggravation;
	}

	public void setAggravation(String aggravation) {
		this.aggravation = aggravation;
	}
}
