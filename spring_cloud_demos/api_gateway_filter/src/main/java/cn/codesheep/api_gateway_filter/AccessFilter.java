package cn.codesheep.api_gateway_filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
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
        HttpServletRequest request = ctx.getRequest();

        Object accsssToken = request.getParameter("accessToken");
        if( null==accsssToken ) {
            ctx.setSendZuulResponse( false );
            ctx.setResponseStatusCode( 401 );
            return null;
        }

        return null;
    }
}
