package domain.Pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDTO {
	
	private int id;
	private String title;
	private String author;
	private String publicationDate;
	private String isbn;
	private String createdAt;
	private String updatedAt;
	
	public String getCreatedAt() {
		return createdAt;
	}
	public BookDTO setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public BookDTO setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}
	public int getId() {
		return id;
	}
	public BookDTO setId(int id) {
		this.id = id;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public BookDTO setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getAuthor() {
		return author;
	}
	public BookDTO setAuthor(String author) {
		this.author = author;
		return this;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public BookDTO setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
		return this;
	}
	public String getIsbn() {
		return isbn;
	}
	public BookDTO setIsbn(String isbn) {
		this.isbn = isbn;
		return this;
	}

}
