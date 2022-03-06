package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Lofi music</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/home_style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css\" />\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"main\">\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <!-- Nav -->\n");
      out.write("            <div class=\"nav\">\n");
      out.write("                <ul id=\"nav\">\n");
      out.write("                    <li><a href=\"#\">Home</a></li>\n");
      out.write("                    <li><a href=\"#the-band\">Playlist chill </a></li>\n");
      out.write("                    <li><a href=\"#tour\">Playlist focus</a></li>\n");
      out.write("                    <li><a href=\"#contact\">Playlist sleep</a></li>\n");
      out.write("                    <li><a href=\"#contact\">Your favarite playlist</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            Chủ đề\n");
      out.write("                            <i class=\"nav-arrow-down ti-angle-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"subnav\">\n");
      out.write("                            <li><a href=\"#\">Nhạc phim</a></li>\n");
      out.write("                            <li><a href=\"#\">EDM</a></li>\n");
      out.write("                            <li><a href=\"#\">Dân ca</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- Search button -->\n");
      out.write("            <div class=\"search-btn\">\n");
      out.write("                <i class=\"search-icon ti-search\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"list-music\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--Footer -->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <div class=\"control\">\n");
      out.write("            <div class=\"btn btn-repeat\">\n");
      out.write("                <i class=\"fas fa-redo\"></i>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"btn btn-prev\">\n");
      out.write("                <i class=\"fas fa-step-backward\"></i>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"btn btn-toggle-play\">\n");
      out.write("                <i class=\"fas fa-pause icon-pause\"></i>\n");
      out.write("                <i class=\"fas fa-play icon-play\"></i>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"btn btn-next\">\n");
      out.write("                <i class=\"fas fa-step-forward\"></i>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"btn btn-random \">\n");
      out.write("                <i class=\"fas fa-random\"></i>\n");
      out.write("              </div>\n");
      out.write("            <input id=\"progress\" class=\"progress\" type=\"range\" value=\"0\" step=\"1\" min=\"0\" max=\"100\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
