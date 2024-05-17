package com.example.springbootbenjaminsecurityfilters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

@Slf4j
public class Filter1 extends OncePerRequestFilter {

    private final SomeService someService;

    public Filter1(final SomeService someService) {
        this.someService = someService;
    }

    @Override
    protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response,
        final FilterChain filterChain)
        throws ServletException, IOException {

        someService.doingSomeDatabaseStuff();
        log.info("Hello from Filter1");

        filterChain.doFilter(request, response);
    }
}
