package cn.bugstack.chatglm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 小傅哥，微信：fustack
 * @description 会话模型
 * @github https://github.com/fuzhengwei/chatglm-sdk-java
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Getter
@AllArgsConstructor
public enum Model {

    @Deprecated
    CHATGLM_6B_SSE("chatGLM_6b_SSE", "ChatGLM-6B 测试模型"),
    @Deprecated
    CHATGLM_LITE("chatglm_lite", "轻量版模型，适用对推理速度和成本敏感的场景"),
    @Deprecated
    CHATGLM_LITE_32K("chatglm_lite_32k", "标准版模型，适用兼顾效果和成本的场景"),
    @Deprecated
    CHATGLM_STD("chatglm_std", "适用于对知识量、推理能力、创造力要求较高的场景"),
    @Deprecated
    CHATGLM_PRO("chatglm_pro", "适用于对知识量、推理能力、创造力要求较高的场景"),
    /**
     * 智谱AI 23年06月发布
     */
    CHATGLM_TURBO("chatglm_turbo", "适用于对知识量、推理能力、创造力要求较高的场景"),
    /**
     * 智谱AI 24年01月发布
     */
    GLM_3_5_TURBO("glm-3-turbo", "适用于对知识量、推理能力、创造力要求较高的场景"),
    GLM_4("glm-4", "适用于复杂的对话交互和深度内容创作设计的场景"),
    GLM_4V("glm-4v", "根据输入的自然语言指令和图像信息完成任务，推荐使用 SSE 或同步调用方式请求接口"),
    GLM_4_Plus("glm-4-plus", "高智能旗舰: 性能全面提升，长文本和复杂任务能力显著增强"),
    GLM_4_0520("glm-4-0520", "高智能模型：适用于处理高度复杂和多样化的任务"),
    GLM_4_Lng("glm-4-long", "超长输入：专为处理超长文本和记忆型任务设计"),
    GLM_4_AirX("glm-4-airx", "极速推理：具有超快的推理速度和强大的推理效果"),
    GLM_4_Air("glm-4-air", "高性价比：推理能力和价格之间最平衡的模型"),
    GLM_4_FlashX("glm-4-flashx", "高速低价：Flash增强版本，超快推理速度。"),
    GLM_4_Flash("glm-4-flash", "免费调用：智谱AI首个免费API，零成本调用大模型。"),
    GLM_4_AllTools("glm-4-alltools", "Agent模型：自主规划和执行复杂任务"),

    COGVIEW_3("cogview-3", "根据用户的文字描述生成图像,使用同步调用方式请求接口"),
    ;

    private final String code;
    private final String info;

    public static boolean isOldModel(Model model) {
        return CHATGLM_6B_SSE.equals(model) || CHATGLM_LITE.equals(model) || CHATGLM_LITE_32K.equals(model) || CHATGLM_STD.equals(model) || CHATGLM_PRO.equals(model) || CHATGLM_TURBO.equals(model);
    }
}
