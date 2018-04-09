package com.github.filter;

import com.google.common.base.Strings;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.bouncycastle.util.Times;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * zhangbo
 */
@Component
public class AccessFilter extends ZuulFilter{

    /**
     *
     * @return
     */
    @Override
    public String filterType() {
        //前置过滤器
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //数字越小，优先级越高
        return 0;
    }

    /**
     * 返回一个boolean类型来判断该过滤器是否要执行.
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        long startTime = System.currentTimeMillis();
        System.out.println(org.nutz.lang.Times.D(startTime).toString());
        ctx.set("startTime",startTime);
        HttpServletRequest request = ctx.getRequest();
        String token = request.getHeader("token");
        System.out.println(token);

        if(Strings.isNullOrEmpty(token)){
            ctx.setResponseStatusCode(401);
            //令zuul过滤该请求，不对其进行路由
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody("未认证");
            ctx.getResponse().setContentType("text/html;charset=UTF-8");
            ctx.set("isSuccess",false);
            return null;
        }else{
            ctx.setResponseStatusCode(200);
            ctx.setSendZuulResponse(true);
            ctx.set("isSuccess",true);
            return null;
        }

    }
}
