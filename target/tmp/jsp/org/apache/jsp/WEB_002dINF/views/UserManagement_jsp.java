package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html>\n");
      out.write("  <head>  \n");
      out.write("    <title>AngularJS $http Example</title>  \n");
      out.write("    <style>\n");
      out.write("      .username.ng-valid {\n");
      out.write("          background-color: lightgreen;\n");
      out.write("      }\n");
      out.write("      .username.ng-dirty.ng-invalid-required {\n");
      out.write("          background-color: red;\n");
      out.write("      }\n");
      out.write("      .username.ng-dirty.ng-invalid-minlength {\n");
      out.write("          background-color: yellow;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .email.ng-valid {\n");
      out.write("          background-color: lightgreen;\n");
      out.write("      }\n");
      out.write("      .email.ng-dirty.ng-invalid-required {\n");
      out.write("          background-color: red;\n");
      out.write("      }\n");
      out.write("      .email.ng-dirty.ng-invalid-email {\n");
      out.write("          background-color: yellow;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("     <link href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"></link>\n");
      out.write("  </head>\n");
      out.write("  <body ng-app=\"myApp\" class=\"ng-cloak\">\n");
      out.write("      <div class=\"generic-container\" ng-controller=\"UserController as ctrl\">\n");
      out.write("          <div class=\"panel panel-default\">\n");
      out.write("              <div class=\"panel-heading\"><span class=\"lead\">User Registration Form </span></div>\n");
      out.write("              <div class=\"formcontainer\">\n");
      out.write("                  <form ng-submit=\"ctrl.submit()\" name=\"myForm\" class=\"form-horizontal\">\n");
      out.write("                      <input type=\"hidden\" ng-model=\"ctrl.user.id\" />\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                          <div class=\"form-group col-md-12\">\n");
      out.write("                              <label class=\"col-md-2 control-lable\" for=\"file\">Name</label>\n");
      out.write("                              <div class=\"col-md-7\">\n");
      out.write("                                  <input type=\"text\" ng-model=\"ctrl.user.username\" name=\"uname\" class=\"username form-control input-sm\" placeholder=\"Enter your name\" required ng-minlength=\"3\"/>\n");
      out.write("                                  <div class=\"has-error\" ng-show=\"myForm.$dirty\">\n");
      out.write("                                      <span ng-show=\"myForm.uname.$error.required\">This is a required field</span>\n");
      out.write("                                      <span ng-show=\"myForm.uname.$error.minlength\">Minimum length required is 3</span>\n");
      out.write("                                      <span ng-show=\"myForm.uname.$invalid\">This field is invalid </span>\n");
      out.write("                                  </div>\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                        \n");
      out.write("                      \n");
      out.write("                      <div class=\"row\">\n");
      out.write("                          <div class=\"form-group col-md-12\">\n");
      out.write("                              <label class=\"col-md-2 control-lable\" for=\"file\">Address</label>\n");
      out.write("                              <div class=\"col-md-7\">\n");
      out.write("                                  <input type=\"text\" ng-model=\"ctrl.user.address\" class=\"form-control input-sm\" placeholder=\"Enter your Address. [This field is validation free]\"/>\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                          <div class=\"form-group col-md-12\">\n");
      out.write("                              <label class=\"col-md-2 control-lable\" for=\"file\">Email</label>\n");
      out.write("                              <div class=\"col-md-7\">\n");
      out.write("                                  <input type=\"email\" ng-model=\"ctrl.user.email\" name=\"email\" class=\"email form-control input-sm\" placeholder=\"Enter your Email\" required/>\n");
      out.write("                                  <div class=\"has-error\" ng-show=\"myForm.$dirty\">\n");
      out.write("                                      <span ng-show=\"myForm.email.$error.required\">This is a required field</span>\n");
      out.write("                                      <span ng-show=\"myForm.email.$invalid\">This field is invalid </span>\n");
      out.write("                                  </div>\n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                          <div class=\"form-actions floatRight\">\n");
      out.write("                              <input type=\"submit\"  value=\"{{!ctrl.user.id ? 'Add' : 'Update'}}\" class=\"btn btn-primary btn-sm\" ng-disabled=\"myForm.$invalid\">\n");
      out.write("                              <button type=\"button\" ng-click=\"ctrl.reset()\" class=\"btn btn-warning btn-sm\" ng-disabled=\"myForm.$pristine\">Reset Form</button>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </form>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel panel-default\">\n");
      out.write("                <!-- Default panel contents -->\n");
      out.write("              <div class=\"panel-heading\"><span class=\"lead\">List of Users </span></div>\n");
      out.write("              <div class=\"tablecontainer\">\n");
      out.write("                  <table class=\"table table-hover\">\n");
      out.write("                      <thead>\n");
      out.write("                          <tr>\n");
      out.write("                              <th>ID.</th>\n");
      out.write("                              <th>Name</th>\n");
      out.write("                              <th>Address</th>\n");
      out.write("                              <th>Email</th>\n");
      out.write("                              <th width=\"20%\"></th>\n");
      out.write("                          </tr>\n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                          <tr ng-repeat=\"u in ctrl.users\">\n");
      out.write("                              <td><span ng-bind=\"u.id\"></span></td>\n");
      out.write("                              <td><span ng-bind=\"u.username\"></span></td>\n");
      out.write("                              <td><span ng-bind=\"u.address\"></span></td>\n");
      out.write("                              <td><span ng-bind=\"u.email\"></span></td>\n");
      out.write("                              <td>\n");
      out.write("                              <button type=\"button\" ng-click=\"ctrl.edit(u.id)\" class=\"btn btn-success custom-width\">Edit</button>  <button type=\"button\" ng-click=\"ctrl.remove(u.id)\" class=\"btn btn-danger custom-width\">Remove</button>\n");
      out.write("                              </td>\n");
      out.write("                          </tr>\n");
      out.write("                      </tbody>\n");
      out.write("                  </table>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js\"></script>\n");
      out.write("      <script src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("      <script src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("      <script src=\"");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/static/css/app.css");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/static/js/app.js");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/static/js/service/user_service.js");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/static/js/controller/user_controller.js");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }
}
