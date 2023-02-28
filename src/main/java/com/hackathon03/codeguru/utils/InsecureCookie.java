package com.hackathon03.codeguru.utils;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;

public class InsecureCookie {

    public static void cookieInsecureByDefaultNoncompliant(HttpServletResponse response) {
        Cookie cookie = new Cookie("name", "value");
        // Noncompliant: by default, the Cookie is not secure and not httpOnly.
        response.addCookie(cookie);
    }

    public static void cookieSecureCompliant(HttpServletResponse response) {
        Cookie cookie = new Cookie("name", "value");
        // Compliant: the Cookie is secured.
        cookie.setSecure(true);
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
    }

}
