# url 支持base64和图片地址；https://bugstack.cn/images/article/project/chatgpt/chatgpt-extra-231011-01.png
curl -X POST \
        -H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsInNpZ25fdHlwZSI6IlNJR04ifQ.eyJhcGlfa2V5IjoiMzk1ODBlMzRlMTc1MDE5YzIzMGZkZDUxOTgxN2IzODEiLCJleHAiOjE3MTczNzE2MzE4MDgsInRpbWVzdGFtcCI6MTcxNzM2OTgzMTgwOH0.2lk57oALzFxx2eAo-dKojKnVpn_MvJ8VJ4NQWTMYPHQ" \
        -H "Content-Type: application/json" \
        -H "User-Agent: Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)" \
        -d '{
                "messages": [
                    {
                        "role": "user",
                        "content": [
                          {
                            "type": "text",
                            "text": "这是什么图片"
                          },
                          {
                            "type": "image_url",
                            "image_url": {
                              "url" : "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"
                            }
                          }
                        ]
                    }
                ],
                "model": "glm-4v",
                "stream": "true"
            }' \
  https://open.bigmodel.cn/api/paas/v4/chat/completions