package cn.bugstack.chatglm.executor.result;

import okhttp3.sse.EventSourceListener;

/**
 * 结果封装器
 */
public interface ResultHandler {

    EventSourceListener eventSourceListener(EventSourceListener eventSourceListener);

}
