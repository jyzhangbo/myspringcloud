package com.github.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.nutz.lang.Times;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import sun.misc.Request;

import java.util.Date;

/**
 * zhangbo
 */
@Component
public class PostFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        Long startTime = (Long)ctx.get("startTime");
        Long endTime=System.currentTimeMillis();
        System.out.println(org.nutz.lang.Times.D(endTime).toString());

        long between = Times.between(new Date(startTime), new Date(endTime), 1);
        System.out.println(between);

        return null;
    }
}
