package cn.bugstack.chatglm.model;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description 返回结果
 * @github https://github.com/fuzhengwei/chatglm-sdk-java
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Data
public class ChatCompletionResponse {

    // 旧版获得的数据方式
    private String data;
    private String meta;

    // 24年1月发布的 GLM_3_5_TURBO、GLM_4 模型时新增
    private String id;
    private Long created;
    private String model;
    private List<Choice> choices;
    private Usage usage;

    // 封装 setChoices 对 data 属性赋值，兼容旧版使用方式
    public void setChoices(List<Choice> choices) {
        this.choices = choices;
        for (Choice choice : choices) {
            if ("stop".equals(choice.finishReason)) {
                continue;
            }
            if (null == this.data) {
                this.data = "";
            }
            this.data = this.data.concat(choice.getDelta().getContent());
        }
    }

    // 封装 setChoices 对 meta 属性赋值，兼容旧版使用方式
    public void setUsage(Usage usage) {
        this.usage = usage;
        if (null != usage) {
            this.meta = JSON.toJSONString(Meta.builder().usage(usage).build());
        }
    }

    @Data
    public static class Choice {
        private Long index;
        @JsonProperty("finish_reason")
        private String finishReason;
        private Delta delta;
    }

    @Data
    public static class Delta {
        private String role;
        private String content;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Meta {
        private String task_status;
        private Usage usage;
        private String task_id;
        private String request_id;
    }

    @Data
    public static class Usage {
        private int completion_tokens;
        private int prompt_tokens;
        private int total_tokens;
    }

}
