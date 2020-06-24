package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Forgot_005fpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <style type=\"text/css\">            \n");
      out.write("            #feed\n");
      out.write("     \t    {\n");
      out.write("                display: inline-block;\n");
      out.write("                margin-top:100px;\n");
      out.write("                margin-left:270px;\n");
      out.write("                width: 53%;\n");
      out.write("                padding:10px 22px 50px 30px;\n");
      out.write("                position: fixed;\n");
      out.write("                background-color: rgba(0,0,0,0.7);\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("            \tfont-family: Arial, Helvetica, sans-serif;\n");
      out.write("                background-size: 1600px;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                    font-family: cursive;\n");
      out.write("            }\n");
      out.write("            #log\n");
      out.write("            {\n");
      out.write("                font-size: 18px;\n");
      out.write("                margin-left: 300px;\n");
      out.write("                font-family:serif;\n");
      out.write("            }\n");
      out.write("            textarea{\n");
      out.write("                resize:none;\n");
      out.write("            }\n");
      out.write("            .blinking{\n");
      out.write("                animation:blinkingText 0.5s infinite;\n");
      out.write("            }\n");
      out.write("            @keyframes blinkingText{\n");
      out.write("                0%{     color: red;    }\n");
      out.write("                20%{     color: red;    }\n");
      out.write("                30%{     color: red;    }\n");
      out.write("                88%{    color: transparent; }\n");
      out.write("                100%{   color: #ff3333;    }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"images/feed.jpg\">\n");
      out.write("            <div id=\"feed\">\n");
      out.write("             <FORM action=\"feedback_val.jsp\">\n");
      out.write(" \t\t    <h1>Give Feedback...</h1>\n");
      out.write("                    <table cellpadding=\"5px\">\n");
      out.write("            <tr>\n");
      out.write("            \t<td>\n");
      out.write(" \t\t\t\t<h3><b>Subject:<b/></h3> \n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td>\t\n");
      out.write("\t\t\t\t<textarea rows=\"4\" cols=\"60\" required name=\"subject\"></textarea>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            \t<td>\n");
      out.write("                <h3><b>Feedback:</b></h3> \n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t<textarea rows=\"8\" cols=\"60\" required name=\"feedback\"></textarea>\n");
      out.write("            \t</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td>\n");
      out.write("                    <h6><span class=\"blinking\">\n");
      out.write("              ");
 
             if(request.getAttribute("Message")!=null)
             {
                 out.println(request.getAttribute("Message"));
             }
                
      out.write("\n");
      out.write("                </span>\n");
      out.write("              </h6>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            \t<td>\n");
      out.write("            \t\t<button type='submit' class=\"btn btn-success\"> Submit </button>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                \t<button type='reset' class=\"btn btn-danger\"> Reset </button>\n");
      out.write("                <a type=\"button\" id=\"log\" class=\"btn btn-light\" href=\"logout.jsp\"><b>Logout</b></button>\n");
      out.write("        \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </FORM>  \n");
      out.write(" </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
