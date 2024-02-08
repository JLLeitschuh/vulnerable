package org.jlleitschuh.vulnerable;

import org.apache.commons.fileupload2.core.DiskFileItem;
import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.core.FileUploadException;
import org.apache.commons.fileupload2.jakarta.servlet6.JakartaServletFileUpload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class ApacheMultipartFilenameJakarta {

    public void handleCommonsFileUploadJakarta(jakarta.servlet.http.HttpServletRequest request) throws FileUploadException, FileNotFoundException {
        DiskFileItemFactory factory = DiskFileItemFactory.builder().get();
        JakartaServletFileUpload<DiskFileItem, DiskFileItemFactory> servletFileUpload = new JakartaServletFileUpload<>(factory);
        List<DiskFileItem> items = servletFileUpload.parseRequest(request);
        for (DiskFileItem item : items) {
            File f = new File("uploadDir", item.getName());
            FileOutputStream os = new FileOutputStream(f);
        }
    }
}
