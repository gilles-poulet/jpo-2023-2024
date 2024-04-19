package jpo.iramps.be;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
import jakarta.ws.rs.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/api/8")
public class JPOApiDefi8 extends JPOApiDefi {

    @Override
    public String defi (String input){
        return input+ "\n";
    }
}