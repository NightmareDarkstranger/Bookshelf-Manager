package Servlet;

import DAO.BookDAO;
import Model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/ViewBookServlet")
public class ViewBookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        BookDAO dao = new BookDAO();

        List<Book> books = dao.getAllBooks();

        request.setAttribute("books", books);

        request.getRequestDispatcher("viewBooks.jsp")
                .forward(request, response);
    }
}