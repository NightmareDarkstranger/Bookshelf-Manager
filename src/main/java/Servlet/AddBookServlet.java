package Servlet;
import DAO.BookDAO;
import Model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
        throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String genre = request.getParameter("genre");
        String shelfLocation = request.getParameter("shelfLocation");

        Book book = new Book();

        book.setTitle(title);
        book.setAuthor(author);
        book.setGenre(genre);
        book.setShelfLocation(shelfLocation);

        BookDAO dao = new BookDAO();

        if (dao.addBook(book)) {
            response.sendRedirect("index.jsp");
        } else {
            response.getWriter().println("Failed to add book.");
        }
    }
}