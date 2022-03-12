package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html style=\" background-image: url('assets/img/lofi1.gif');\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Lofi music</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/home_style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" />\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <!-- Nav -->\n");
      out.write("                <div class=\"nav\">\n");
      out.write("                    <ul id=\"nav\">\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"#the-band\">Playlist chill </a></li>\n");
      out.write("                        <li><a href=\"#tour\">Playlist focus</a></li>\n");
      out.write("                        <li><a href=\"#contact\">Playlist sleep</a></li>\n");
      out.write("                        <li><a href=\"#contact\">Your favarite playlist</a></li>\n");
      out.write("                        <li><a id=\"login\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- Search button -->\n");
      out.write("                <div class=\"search-btn\">\n");
      out.write("                    <i class=\"search-icon ti-search\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"list-music\">\n");
      out.write("                <h2 id=\"list-music-name\">List music</h2>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--Footer -->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"control\">\n");
      out.write("                <div class=\"btn btn-repeat\">\n");
      out.write("                    <i class=\"fas fa-redo\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn btn-prev\">\n");
      out.write("                    <i class=\"fas fa-step-backward\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn btn-toggle-play\">\n");
      out.write("                    <i class=\"fas fa-pause icon-pause\"></i>\n");
      out.write("                    <i class=\"fas fa-play icon-play\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn btn-next\">\n");
      out.write("                    <i class=\"fas fa-step-forward\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn btn-random \">\n");
      out.write("                    <i class=\"fas fa-random\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sideBar\" ><div class=\"sideBar-time\"></div></div>\n");
      out.write("                <audio id=\"audio\" src=\"\"></audio>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Login -->\n");
      out.write("        <div class=\"login_form\">\n");
      out.write("            <div class=\"login_content\">\n");
      out.write("                <form action=\"loginservlet\" method=\"post\">\n");
      out.write("                    <i class=\"fas fa-xmark\"></i>\n");
      out.write("                    <h1>Login</h1>\n");
      out.write("                    <div class=\"\"><i class=\"fas fa-user-astronaut\"></i><input class=\"input\" type=\"text\" name=\"Username\"\n");
      out.write("                            placeholder=\"Username\"></div>\n");
      out.write("                    <div><i class=\"fas fa-lock\"></i><input class=\"input\" type=\"password\" name=\"Password\"\n");
      out.write("                            placeholder=\"Password\"></div>\n");
      out.write("                    <div class=\"login-footer\">\n");
      out.write("                        <input id=\"submit\" type=\"submit\" name=\"login\" value=\"Login\">\n");
      out.write("                        <p id=\"text\">Not a member?<a id=\"signup\" href=\"#\">Signup</a></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"assets/css/home.js\"></script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"song-item\" data-id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-path=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >\n");
          out.write("                    </div> \n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
