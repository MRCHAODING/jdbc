
public class book {
private Integer bookId;
private String bookName;
private String authorName;
private Double price;


public book() {
	super();
}


public book(Integer bookId, String bookName, String authorName, Double price) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.authorName = authorName;
	this.price = price;
}


public Integer getBookId() {
	return bookId;
}


public void setBookId(Integer bookId) {
	this.bookId = bookId;
}


public String getBookName() {
	return bookName;
}


public void setBookName(String bookName) {
	this.bookName = bookName;
}


public String getAuthorName() {
	return authorName;
}


public void setAuthorName(String authorName) {
	this.authorName = authorName;
}


public Double getPrice() {
	return price;
}


public void setPrice(Double price) {
	this.price = price;
}


@Override
public String toString() {
	return "book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price
			+ "]";
}


}
