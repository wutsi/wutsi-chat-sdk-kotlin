package com.wutsi.platform.chat

import com.wutsi.platform.chat.dto.SearchConversationRequest
import com.wutsi.platform.chat.dto.SearchConversationResponse
import com.wutsi.platform.chat.dto.SearchMessageRequest
import com.wutsi.platform.chat.dto.SearchMessageResponse
import com.wutsi.platform.chat.dto.SendMessageRequest
import com.wutsi.platform.chat.dto.SendMessageResponse
import feign.Headers
import feign.RequestLine

public interface WutsiVhatApi {
  @RequestLine("POST /v1/messages")
  @Headers(value=["Content-Type: application/json"])
  public fun sendMessage(request: SendMessageRequest): SendMessageResponse

  @RequestLine("POST /v1/messages/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchMessages(request: SearchMessageRequest): SearchMessageResponse

  @RequestLine("POST /v1/conversations/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchConversations(request: SearchConversationRequest): SearchConversationResponse
}
