package com.java.structural.responsibilitychain;

/**
 * Created by maskwang on 18-7-4.
 * 责任链中的处理器
 */
public abstract class Handler {

    private Handler nextHandler;

    private RequestLevel requestLevel;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public RequestLevel getRequestLevel() {
        return requestLevel;
    }

    public void setRequestLevel(RequestLevel requestLevel) {
        this.requestLevel = requestLevel;
    }


    //消息处理
    public final void handlerMessage(Request request){
        //属于自己的处理级别,就不用传递下去
        if(request.getRequestLevel().getMsg().equals(this.requestLevel.getMsg())){
            echo(request);
            Response response = new Response();
            response.echo("handle the request sucessfully");
        }else{
            //不属于自己的传递级别,就一直传递下去
            if(this.getNextHandler()!=null){
                this.getNextHandler().handlerMessage(request);
            }else{
                System.err.println("There is not a adequate handler");
            }
        }

    }

    //每个handler自己定义的逻辑
    public abstract void echo(Request request);
}
