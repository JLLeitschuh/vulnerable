package org.jlleitschuh.vulnerable;

import org.apache.commons.fileupload2.core.DiskFileItem;
import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.core.FileItem;
import org.apache.commons.fileupload2.core.FileUploadException;
import org.apache.commons.fileupload2.jakarta.servlet6.JakartaServletFileUpload;

import java.io.File;
import java.util.List;

public class ApacheMultipartFilename {
    public void handleCommonsFileUpload(javax.servlet.http.HttpServletRequest request) throws org.apache.commons.fileupload.FileUploadException {
        org.apache.commons.fileupload.disk.DiskFileItemFactory factory = new org.apache.commons.fileupload.disk.DiskFileItemFactory();
        org.apache.commons.fileupload.servlet.ServletFileUpload servletFileUpload = new org.apache.commons.fileupload.servlet.ServletFileUpload(factory);
        List<org.apache.commons.fileupload.FileItem> items = servletFileUpload.parseRequest(request);
        for (org.apache.commons.fileupload.FileItem item : items) {
            File f = new File("uploadDir", item.getName());
        }
    }

    public void handleCommonsFileUpload2(jakarta.servlet.http.HttpServletRequest request) throws FileUploadException {
        DiskFileItemFactory factory = DiskFileItemFactory.builder().get();
        JakartaServletFileUpload<DiskFileItem, DiskFileItemFactory> servletFileUpload = new JakartaServletFileUpload<>(factory);
        List<DiskFileItem> items = servletFileUpload.parseRequest(request);
        for (DiskFileItem item : items) {
            File f = new File("uploadDir", item.getName());
        }
    }
}
