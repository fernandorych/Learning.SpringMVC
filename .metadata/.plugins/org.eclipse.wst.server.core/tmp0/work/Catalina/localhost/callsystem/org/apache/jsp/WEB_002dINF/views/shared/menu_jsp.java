/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2015-06-08 05:31:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.shared;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=US-ASCII");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>CallSystem</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/icon.png\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/bootstrap.min.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/animate.min.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/fonts/font-awesome.min.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/simple-line-icons.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/fonts/font.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/app.min.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/js/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tif (sessionStorage[\"auth\"] == undefined) {\r\n");
      out.write("\t\twindow.location.href = \"/callsystem\"\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction logout(){\r\n");
      out.write("\t\tsessionStorage.clear();\r\n");
      out.write("\t\twindow.location.href = \"/callsystem\"\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"app app-header-fixed\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t<header id=\"header\" class=\"app-header navbar\" role=\"menu\">\r\n");
      out.write("\t\t\t<!-- navbar header -->\r\n");
      out.write("\t\t\t<div class=\"navbar-header bg-dark\">\r\n");
      out.write("\t\t\t\t<button class=\"pull-right visible-xs dk\" ui-toggle=\"show\"\r\n");
      out.write("\t\t\t\t\ttarget=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t<i class=\"glyphicon glyphicon-cog\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<button class=\"pull-right visible-xs\" ui-toggle=\"off-screen\"\r\n");
      out.write("\t\t\t\t\ttarget=\".app-aside\" ui-scroll=\"app\">\r\n");
      out.write("\t\t\t\t\t<i class=\"glyphicon glyphicon-align-justify\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<!-- brand -->\r\n");
      out.write("\t\t\t\t<a href=\"#/\" class=\"navbar-brand text-lt\"> <i class=\"fa fa-btc\"></i>\r\n");
      out.write("\t\t\t\t\t<img src=\"\" alt=\".\" class=\"hide\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"hidden-folded m-l-xs\">CallSystem</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<!-- / brand -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- / navbar header -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- navbar collapse -->\r\n");
      out.write("\t\t\t<div\r\n");
      out.write("\t\t\t\tclass=\"collapse pos-rlt navbar-collapse box-shadow bg-white-only\">\r\n");
      out.write("\t\t\t\t<!-- buttons -->\r\n");
      out.write("\t\t\t\t<div class=\"nav navbar-nav hidden-xs\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"btn no-shadow navbar-btn\"\r\n");
      out.write("\t\t\t\t\t\tui-toggle=\"app-aside-folded\" target=\".app\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-dedent fa-fw text\"></i> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-indent fa-fw text-active\"></i>\r\n");
      out.write("\t\t\t\t\t</a> <a href=\"#\" class=\"btn no-shadow navbar-btn\" ui-toggle=\"show\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"#aside-user\"> <i class=\"icon-user fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- / buttons -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- link and dropdown -->\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav hidden-sm\">\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown pos-stc\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" class=\"dropdown-toggle\"> <span>Cadastros</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-menu wrapper w-full bg-white\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"m-l-xs m-t-xs m-b-xs font-bold\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tPaginas <span class=\"badge badge-sm bg-success\">10</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"list-unstyled l-h-2x\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-fw fa-angle-right text-muted m-r-xs\"></i>Cadastrar\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tRamais</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-fw fa-angle-right text-muted m-r-xs\"></i>Cadastrar\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tUsuarios</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-fw fa-angle-right text-muted m-r-xs\"></i>Listar\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tUsuarios</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-fw fa-angle-right text-muted m-r-xs\"></i>Listar\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tRamais</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-toggle\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-fw fa-plus visible-xs-inline-block\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\ttranslate=\"header.navbar.new.NEW\">Menu</span> <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" translate=\"header.navbar.new.PROJECT\">Cadastrar Ramais</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href> <span translate=\"header.navbar.new.TASK\">Cadastrar\tUsuarios</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href translate=\"header.navbar.new.USER\">Listar\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tUsuarios</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href> <span class=\"badge bg-danger pull-right\">4</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span translate=\"header.navbar.new.EMAIL\">Listar\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tRamais</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!-- / link and dropdown -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- nabar right -->\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-toggle clear\" data-toggle=\"dropdown\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"thumb-sm avatar pull-right m-t-n-sm m-b-n-sm m-l-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/avatar.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"...\"> <i class=\"on md b-white bottom\"></i>\r\n");
      out.write("\t\t\t\t\t\t</span> <span class=\"hidden-sm hidden-md\">Erick Wendel</span> <b\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"caret\"></b>\r\n");
      out.write("\t\t\t\t\t</a> <!-- dropdown -->\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu animated fadeInRight w\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a ui-sref=\"access.signin\" onclick=\"logout()\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul> <!-- / dropdown --></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!-- / navbar right -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- / navbar collapse -->\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<!-- / header -->\r\n");
      out.write("\t\t<section>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
