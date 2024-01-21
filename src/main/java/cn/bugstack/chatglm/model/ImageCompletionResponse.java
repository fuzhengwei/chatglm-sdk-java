package cn.bugstack.chatglm.model;

import lombok.Data;

import java.util.List;

/**
 * CogView <a href="https://open.bigmodel.cn/dev/api#cogview">根据用户的文字描述生成图像,使用同步调用方式请求接口</a>
 */
@Data
public class ImageCompletionResponse {

    /**
     * 请求创建时间，是以秒为单位的Unix时间戳。
     */
    private Long created;

    private List<Image> data;

    @Data
    public static class Image{
        private String url;
    }

}
