package jpo.iramps.be;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
import jakarta.ws.rs.*;
import jakarta.servlet.annotation.WebServlet;

public class JPOApiDefi extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = req.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line+"\n");
            }
        } catch (Exception e) { 
            System.err.println(e.getMessage());
            return;
        }

        res.setContentType("text/plain");
        PrintWriter pw = res.getWriter();
        pw.print(defi(jb.toString()));
        pw.flush();
        pw.close();

    }

    public String defi (String input){
        return "";
    }
}