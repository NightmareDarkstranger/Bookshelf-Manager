package DAO;

import Model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class BookDAO {

    public boolean addBook(Book book) {

        boolean success = false;

        try {

            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO books(title, author, genre, shelf_location) "
                    + "VALUES (?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getGenre());
            ps.setString(4, book.getShelfLocation());

            int rows = ps.executeUpdate();

            success = rows > 0;

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return success;

        }

        public List<Book> getAllBooks() {

            List<Book> books = new ArrayList<Book>();

            try {

                Connection conn = DBConnection.getConnection();

                String sql = "SELECT * FROM books";

                PreparedStatement ps = conn.prepareStatement(sql);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {

                    Book book = new Book();

                    book.setBookId(rs.getInt("book_id"));
                    book.setTitle(rs.getString("title"));
                    book.setAuthor(rs.getString("author"));
                    book.setGenre(rs.getString("genre"));
                    book.setShelfLocation(rs.getString("shelf_location"));

                    books.add(book);
                }

                conn.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

            return books;
        }

    }

