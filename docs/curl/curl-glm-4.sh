curl -X POST \
        -H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsInNpZ25fdHlwZSI6IlNJR04ifQ.eyJhcGlfa2V5IjoiNjJkZGVjMzhiMWQwYjlhN2IwZmRkYWYyNzFlNmVkOTAiLCJleHAiOjE3MDU0ODc4Mjc1NDcsInRpbWVzdGFtcCI6MTcwNTQ4NjAyNzU0N30.wDi-JBIZZ6VZ28KuQgBoVpSoe4BZBAi0224fwLNBxdQ" \
        -H "Content-Type: application/json" \
        -H "User-Agent: Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)" \
        -d '{
          "model":"glm-4",
          "stream": "true",
          "messages": [
              {
                  "role": "user",
                  "content": "写个java冒泡排序"
              }
          ]
        }' \
  https://open.bigmodel.cn/api/paas/v4/chat/completions