package jpo.iramps.be;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
import jakarta.ws.rs.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/api/7")
public class JPOApiDefi7 extends JPOApiDefi {

    @Override
    public String defi (String input){
        return input+ "\n";
    }
}