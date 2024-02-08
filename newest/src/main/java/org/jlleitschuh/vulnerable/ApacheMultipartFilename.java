package org.jlleitschuh.vulnerable;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class ApacheMultipartFilename {
    public void handleCommonsFileUpload(HttpServletRequest request) throws FileUploadException, FileNotFoundException {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(factory);
        List<FileItem> items = servletFileUpload.parseRequest(request);
        for (FileItem item : items) {
            File f = new File("uploadDir", item.getName());
            FileOutputStream os = new FileOutputStream(f);
        }
    }
}
