package CodingJava8;

import java.util.Objects;

public class BookReview {

    private String bookId;
    private String comment;
    private double rating;

    public BookReview(String bookId, String comment, double rating) {
        this.bookId = bookId;
        this.comment = comment;
        this.rating = rating;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookReview that = (BookReview) o;
        return Double.compare(rating, that.rating) == 0 && Objects.equals(bookId, that.bookId) && Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, comment, rating);
        
    }
}
