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
 * 注册控制器
 */
@Path("/register")
public class RegisterController implements PageController {

    @GET
    @Path("/page")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return "register-form.jsp";
    }

    @POST
    @Path("/do")
    public String register(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        UserService userService = new UserServiceImpl();
        User user = new User();
        user.setName(request.getParameter("userName"));
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("eamil"));
        user.setPhoneNumber(request.getParameter("phone"));
        userService.register(user);
        return "register-success.jsp";
    }

}
