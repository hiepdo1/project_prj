/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.AccountDAO;
import DAL.MusicDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Music;
import org.jboss.weld.util.ApiAbstraction.Dummy;

/**
 *
 * @author hiepx
 */
public class PagingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PagingServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PagingServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MusicDAO dum = new MusicDAO();
         ArrayList<Music> list = new ArrayList<>();
        if(request.getAttribute("active").equals("all")){
            list = dum.getAll();
        }
        if(request.getAttribute("active").equals("chill")){
            list = dum.getListMusic(2);
        }
        if(request.getAttribute("active").equals("focus")){
            list = dum.getListMusic(3);
        }
        if(request.getAttribute("active").equals("sleep")){
             list = dum.getListMusic(4);
        }
        
        
        int page, numPerPage = 10;
        int num = list.size()%numPerPage==0?(list.size()/numPerPage):((list.size()/numPerPage)+1);
        String spage = request.getParameter("page");
        if (spage == null) {
            page = 1;
        } else {
            page = Integer.parseInt(spage);
        }
        int start = (page - 1) * numPerPage;
        int end = Math.min(list.size(), page * numPerPage);
        ArrayList<Music> List = dum.getListByPage(list, start, end);
        request.setAttribute("activee", "active");
        request.setAttribute("list", List);
        request.setAttribute("page", page);
        request.setAttribute("num", num);
        request.getRequestDispatcher("admin.jsp").forward(request, response);
    }
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
