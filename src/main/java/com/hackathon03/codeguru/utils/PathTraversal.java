package com.hackathon03.codeguru.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

public class PathTraversal {

    public void createFileNoncompliant(HttpServletRequest request, HttpServletResponse response) {
        String basePath = "/var/data/images/";
        String desiredCategory = request.getParameter("category");
        // Noncompliant: user-supplied relative path is not sanitized and could contain malicious characters.
        File fileTarget = new File(basePath + desiredCategory);
    }

    public void createFileCompliant(HttpServletRequest request) {
        String basePath = "/var/data/images/";
        String desiredCategory = request.getParameter("category");
        // Compliant: user-supplied relative path is sanitized before use.
        if (desiredCategory.matches("[a-z]+")) {
            File fileTarget = new File(basePath + desiredCategory);
        } else {
            throw new IllegalArgumentException("Invalid category name");
        }
    }
}
