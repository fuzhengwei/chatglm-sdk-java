curl -X POST \
        -H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsInNpZ25fdHlwZSI6IlNJR04ifQ.eyJhcGlfa2V5IjoiNGUwODdlNDEzNTMwNmVmNGE2NzZmMGNjZTNjZWU1NjAiLCJleHAiOjE2OTcwNjcyOTk0MjIsInRpbWVzdGFtcCI6MTY5NzA2NTQ5OTQyMn0.wuKqloevMjt_E1LHWQ5sDYW5v52nhFQFVG4RMqp_hPc" \
        -H "Content-Type: application/json" \
        -H "User-Agent: Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)" \
        -H "Accept: text/event-stream" \
        -d '{
        "top_p": 0.7,
        "sseFormat": "data",
        "temperature": 0.9,
        "incremental": true,
        "request_id": "xfg-1696992276607",
        "prompt": [
        {
        "role": "user",
        "content": "写个java冒泡排序"
        }
        ]
        }' \
  http://open.bigmodel.cn/api/paas/v3/model-api/chatglm_lite/sse-invoke