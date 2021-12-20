package com.spring.session.data.redis.demo.interceptor;

import com.spring.session.data.redis.demo.util.SessionUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author turman
 * @date 2021/12/20 15:17
 */
@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        SessionUtil.setRequest(request);
        return true;
    }
}
