package xyz.mxue.web.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mxuexxmy
 * 页面控制器，负责服务器页面渲染
 * @since 1.0
 */
public interface PageController extends Controller{

    /**
     *
     * @param request HTTP 请求
     * @param response HTTP 响应
     * @return 视图渲染地址
     * @throws Throwable 异常发生时
     * @author mxuexxmy
     */
    String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable;
}
