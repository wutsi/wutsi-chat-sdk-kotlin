package com.wutsi.platform.chat.dto

import kotlin.Long
import kotlin.String

public data class SendMessageRequest(
  public val recipientId: Long = 0,
  public val text: String = "",
  public val timestamp: Long = 0,
)
