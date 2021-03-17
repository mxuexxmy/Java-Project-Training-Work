package xyz.mxue.projects.user.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author mxuexxmy
 * 字符串编码 Filter
 */
public class CharsetEncodingFilter implements Filter {

    private String encoding = null;

    private  ServletContext servletContext;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.encoding = filterConfig.getInitParameter("encoding");
        this.servletContext = filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            httpServletRequest.setCharacterEncoding(encoding);
            httpServletResponse.setCharacterEncoding(encoding);
            servletContext.log("当前编码已设置为：" + encoding);
            // CharsetEncodingFilter -> FrontControllerServlet -> forward -> index.jsp
        }

        // 执行过滤链
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
