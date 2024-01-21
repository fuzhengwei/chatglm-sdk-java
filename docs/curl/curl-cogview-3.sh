curl -X POST \
        -H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsInNpZ25fdHlwZSI6IlNJR04ifQ.eyJhcGlfa2V5IjoiNjJkZGVjMzhiMWQwYjlhN2IwZmRkYWYyNzFlNmVkOTAiLCJleHAiOjE3MDU1NTA5NjIwNjksInRpbWVzdGFtcCI6MTcwNTU0OTE2MjA2OX0.Rq_6NfmiBYVH6vs34jcMpn584ovOoY0rMB5hT-Bsr5c" \
        -H "Content-Type: application/json" \
        -H "User-Agent: Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)" \
        -d '{
          "model":"cogview-3",
          "prompt":"画一个小狗狗"
        }' \
  https://open.bigmodel.cn/api/paas/v4/images/generations