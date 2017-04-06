<%-- 
    Document   : cevap
    Created on : Mar 8, 2017, 12:06:23 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="ilkCekirdek" scope="session" class="veri.Kisi" />
        <jsp:setProperty name="ilkCekirdek" property="isim"/>
        <jsp:setProperty name="ilkCekirdek" property="sifre"/>
        <h1>Merhaba
        <!--<jsp:getProperty name="ilkCekirdek" property="isim" />-->
        <!--<jsp:getProperty name="ilkCekirdek" property="sifre" /> -->
        <% if(ilkCekirdek.sifreKontrol()){
        out.println("Sisteme Hosgeldiniz");}
        else{out.println("Sifreniz Hatali");}%></h1>
    </body>
</html>
