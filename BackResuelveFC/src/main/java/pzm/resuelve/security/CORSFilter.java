package pzm.resuelve.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * <code>CORSFilter.java</code> 
 *
 * @author Pablo Z&uacute;niga Mata
 * @since 07/12/2019
 */
public class CORSFilter  implements Filter{
	
	@Override
    public void init(FilterConfig arg0) throws ServletException {}
 
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
            FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        HttpServletResponse response=(HttpServletResponse) resp;
 
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, HEAD");
        response.setHeader("Access-Control-Max-Age", "86400");
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, X-PINGOTHER");
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        response.setHeader("Accept","application/json;charset=UTF-8");
        response.setHeader("X-XSS-Protection", "1");        
 
        chain.doFilter(req, resp);
    }
 
    @Override
    public void destroy() {}

}
