<!DOCTYPE html>
<%@ page import="org.apache.shiro.SecurityUtils" %>
<html>
    <head>
        <title><g:layoutTitle default="Mental Health Liberia" /></title>
        <link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />
        <link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />
    </head>
    <body>
        <div id="spinner" class="spinner" style="display:none;">
            <img src="${resource(dir:'images',file:'spinner.gif')}" alt="${message(code:'spinner.alt',default:'Loading...')}" />
        </div>
        <div class="topBar">
        	<div class="header"><a href="http://www.cartercenter.org"><img src="${resource(dir:'images',file:'header.jpg')}" alt="Carter Center" border="0" /></a></div>
        </div>
        	<g:if test="${SecurityUtils.subject.isAuthenticated()}">
        		<div class="loginCallout"><span>You are logged in as </span><span class="bold">${SecurityUtils.subject.principal}</span><span> with role: <span class="bold"><%
				if (SecurityUtils.subject.hasRole("admin")) {
				  print "Administrator";
				} else {
				  print "Unknown";
				}%></span> - <g:link controller="auth" action="signOut">Click here to Logout</g:link></span></div>
        	</g:if>
        <g:layoutBody />
    </body>
</html>