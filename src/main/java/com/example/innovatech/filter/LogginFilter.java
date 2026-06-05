package com.example.innovatech.filter;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class LogginFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws java.io.IOException,
                   jakarta.servlet.ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        System.out.println(
            "[GATEWAY] " +
                    req.getMethod()
                    + " "
                    + req.getRequestURI());

        chain.doFilter(request, response);
    }
}
