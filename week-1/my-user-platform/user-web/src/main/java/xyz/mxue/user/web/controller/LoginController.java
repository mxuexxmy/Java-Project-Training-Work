package xyz.mxue.user.web.controller;

import xyz.mxue.web.mvc.controller.Controller;
import xyz.mxue.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author mxuexxmy
 * 登录控制器
 */
@Path("/login")
public class LoginController implements PageController {

    @POST
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return "main.jsp";
    }
}
