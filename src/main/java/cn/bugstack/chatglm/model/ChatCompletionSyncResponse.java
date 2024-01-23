package cn.bugstack.chatglm.model;

import lombok.Data;

import java.util.List;

/**
 * 同步调用响应
 *
 * @author max
 * @date 2023/12/14 15:41
 */
@Data
public class ChatCompletionSyncResponse {

    private Integer code;
    private String msg;
    private Boolean success;
    private ChatGLMData data;

    // 24年1月发布模型新增字段 GLM3、GLM4
    private String task_status;
    private List<Choice> choices;

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
        this.data = new ChatGLMData();
        this.data.setChoices(choices);
    }


    @Data
    public static class ChatGLMData {
        private List<Choice> choices;
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

    @Data
    public static class Choice {

        private String role;
        private String content;

        // 24年1月发布模型新增字段 GLM3、GLM4
        private String finish_reason;
        private int index;
        private Message message;
    }

    @Data
    public static class Message {
        private String role;
        private String content;
    }

}
