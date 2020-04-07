package interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

public class menuInterceptors implements HandlerInterceptor {
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
}
