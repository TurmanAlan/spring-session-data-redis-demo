package com.spring.session.data.redis.demo.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author turman
 * @date 2021/12/20 14:55
 */
public class SessionUtil {

    private static ThreadLocal<HttpServletRequest> threadLocal = new ThreadLocal<>();

    public static void setRequest(HttpServletRequest request) {
        threadLocal.set(request);
    }

    public static HttpServletRequest getRequest() {
        return threadLocal.get();
    }

    public static HttpSession getSession() {
        return getRequest().getSession();
    }
}
