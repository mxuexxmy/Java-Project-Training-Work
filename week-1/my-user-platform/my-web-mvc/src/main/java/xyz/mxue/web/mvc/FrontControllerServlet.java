package xyz.mxue.web.mvc;

import xyz.mxue.web.mvc.controller.Controller;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mxuexxmy
 * @date 3/3/2021$ 6:29 PM$
 */
public class FrontControllerServlet extends HttpServlet {

    private Map<String, Controller> controllersMapping = new HashMap<>();

}
