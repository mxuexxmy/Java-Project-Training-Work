package xyz.mxue.projects.user.web.controller;

import xyz.mxue.projects.user.domain.User;
import xyz.mxue.projects.user.service.UserService;
import xyz.mxue.projects.user.service.impl.UserServiceImpl;
import xyz.mxue.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author mxuexxmy
 * 登录控制器
 */
@Path("/login")
public class LoginController implements PageController {

    @GET
    @Path("/page")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return "login-form.jsp";
    }

    @POST
    @Path("/main")
    public String login(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        UserService userService = new UserServiceImpl();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        User user = userService.queryUserByNameAndPassword(name, password);
        if (user != null) {
            return "main.jsp";
        }
       return "login-form.jsp";
    }
}
