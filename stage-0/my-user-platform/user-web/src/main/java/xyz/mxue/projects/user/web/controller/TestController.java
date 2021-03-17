package xyz.mxue.projects.user.web.controller;

import xyz.mxue.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author mxuexxmy
 * 测试控制器
 */
@Path("/test")
public class TestController implements PageController {

    @GET
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return "main.jsp";
    }
}
