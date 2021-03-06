/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.MusicDAO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Music;

/**
 *
 * @author hiepx
 */
@MultipartConfig
@WebServlet(name = "createMusicServlet", urlPatterns = {"/createmusic"})
public class createMusicServlet extends HttpServlet {

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
            out.println("<title>Servlet createMusicServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet createMusicServlet at " + request.getContextPath() + "</h1>");
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
        MusicDAO m = new MusicDAO();
        request.setAttribute("display", "display");
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
       PrintWriter out = response.getWriter();
        //Upload file
        Part part = request.getPart("file");
        String realPath = request.getServletContext().getRealPath("/assets/Music");
        String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
        
        if (filename != "") {
            String uploadPath = realPath +"\\"+ filename;
            uploadPath = uploadPath.replace("\\", "/");
            uploadPath = uploadPath.replace("build/", "");
            out.println("<h1>" + realPath + "</h1>");
            out.println("<h1>" + uploadPath + "</h1>");
            
            try (FileOutputStream fos = new FileOutputStream(uploadPath)) {
                InputStream is = part.getInputStream();
                byte[] data = new byte[is.available()];
                is.read(data);
                fos.write(data);
            }
                
        }
            
        String byteSinger = request.getParameter("singer");
        String path = "assets/Music/"+filename;

        String byteName = request.getParameter("name");
        byte ptext[] = byteName.getBytes("ISO-8859-1");
        String name = new String(ptext, "UTF-8");
        byte xptext[] = byteSinger.getBytes("ISO-8859-1");
        String singer = new String(xptext, "UTF-8");

        Music m = new Music( name, singer, path);
        MusicDAO md = new MusicDAO();
        md.insertMusic(m);

        response.sendRedirect("./all");
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
