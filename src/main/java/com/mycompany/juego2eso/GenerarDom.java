/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego2eso;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class GenerarDom {
    private Document document;
    private PanelPrincipalApp panel;
    private File file;
    private int acu = 0;

    public GenerarDom() throws Exception  {
        DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factoria.newDocumentBuilder();
        document = builder.newDocument();
        panel = new PanelPrincipalApp();
    }

    public void setFilePathToDesktop() {
        String userHome = System.getProperty("user.home");
        //String desktopPath = userHome + File.separator + "OneDrive" + File.separator + "Escritorio" + File.separator + "usuarios.xml";
        file = new File("C:\\Users\\DAM117\\Downloads\\wwwcopia\\usuarios.xml");
    }
    
    public void generarDocument(String users, String nivel){
        Element usuariosRegistrados = document.createElement("usuarios");
        document.appendChild(usuariosRegistrados);

        Element usuario = document.createElement("usuario");
        usuariosRegistrados.appendChild(usuario);
        acu++;
        usuario.setAttribute("Id", ""+acu);

        Element completo = document.createElement("Alias");
        completo.appendChild(document.createTextNode(users));
        usuario.appendChild(completo);

        Element niveles = document.createElement("Dificultad");
        niveles.appendChild(document.createTextNode(nivel));
        usuario.appendChild(niveles);
    }

    public void generarXml() throws Exception {
        TransformerFactory factoria = TransformerFactory.newInstance();
        Transformer transformer = factoria.newTransformer();

        Source source = new DOMSource(document);

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        Result result = new StreamResult(pw);

        transformer.transform(source, result);
    }

}
