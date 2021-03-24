package View;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author William
 */
public class HtmlContent {

    private final String file;

    public HtmlContent() {
        this.file = getPath();
    }

    private String getPath() {
        String f = new File("src\\Images\\").getAbsoluteFile().toURI().toString();
        return f;
    }

    public String htmlMsg(String color, String floatMsg, String message, String nomeArquivo, String nomeHashArquivo, String date) {
        String html = "<div style=\"width:100%;color:white;background-color:#color;margin:5px;padding:5px 5px 5px 5px;border:1px solid #48545E;margin-#float:120px;font-size:12px;right:0px;\" > #anexo #message <p style=\"margin-top:-10px;\" align=\"right\"> #date </p> </div>";
        html = html.replace("#color", color);
        html = html.replace("#float", floatMsg);
        html = html.replace("#anexo", ((!nomeArquivo.equals("")) ? htmlAnexo(nomeArquivo, nomeHashArquivo) : ""));
        html = html.replace("#message", message);
        html = html.replace("#date", date);
        return html;
    }

    private boolean isImage(String format) {
        return format.toLowerCase().equals("png") || format.toLowerCase().equals("jpg") || format.toLowerCase().equals("jpge") || format.toLowerCase().equals("gif");
    }

    private boolean isAudio(String format) {
        return format.toLowerCase().equals("ogg") || format.toLowerCase().equals("wav") || format.toLowerCase().equals("mp3");
    }

    private boolean isFile(String name, String format) {
        boolean isFile = new File("Files\\Received\\" + format + "\\" + name).isFile();
        return isFile;
    }

    private String midiaAttachment(String html, String name, String format) {
        String icon = "/filesIcon.png";
        boolean isAudio = format.toLowerCase().equals("ogg") || format.toLowerCase().equals("wav") || format.toLowerCase().equals("mp3");
        boolean isImage = format.toLowerCase().equals("png") || format.toLowerCase().equals("jpg") || format.toLowerCase().equals("jpge") || format.toLowerCase().equals("gif");
        if (isAudio) {
            icon = "/audioIcon.png";
        } else if (isImage) {
            icon = "/ImageIcon.png";
        }
        html = html.replace("#fileName", ((name.length() > 20) ? name.substring(0, 20) + "..." : name));
        html = html.replace("#img", "<img src=\"" + file + "" + icon + "\" height=\"16\" />");
        return html;
    }

    public String htmlAnexo(String nomeArquivo, String nomeHashArquivo)  {
        String html = "<div style=\"background-color:rgb(90,90,127);padding:10px 5px 10px 7px;border:1px solid white;\"> #img <a href=\"file:/#name/#hashName\" style=\"color:white;font-size:12px;text-decoration:none;\" > #fileName </a> </div>";
        String hashName = nomeHashArquivo;
        String format = hashName.split("[.]")[1];
        String name = nomeArquivo + "." + format;
        html = html.replace("#name", name);
        html = html.replace("#hashName", hashName);

        String filePath = new File("Files\\Received\\" + format + "\\").getAbsoluteFile().toURI().toString();
        if (isFile(name, format) && isImage(format)) {
            html = "<div style=\"background-color:rgb(90,90,127);border:1px solid white;\"> <img src='" + filePath + "/" + name + "' width=\"240\" /> </div>";
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(HtmlContent.class.getName()).log(Level.SEVERE, null, ex);
            }
            html = midiaAttachment(html, name, format);
        }
        return html;
    }

}
