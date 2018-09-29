package lti.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class TimeFilter
 */
public class TimeFilter implements Filter {
	protected FilterConfig fConfig;
	
	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
	}

	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		long startTime = System.currentTimeMillis();
	    chain.doFilter(request, response);
	    long elapsed = System.currentTimeMillis() - startTime;
	    String name = "servlet";
	    if (request instanceof HttpServletRequest) {
	      name = ((HttpServletRequest) request).getRequestURI();
	    }

	    fConfig.getServletContext().log(name + " took " + elapsed + " ms");
	}

	

}
