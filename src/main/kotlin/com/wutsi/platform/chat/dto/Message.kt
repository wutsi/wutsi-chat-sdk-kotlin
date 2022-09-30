package com.wutsi.platform.chat.dto

import java.time.OffsetDateTime
import kotlin.Long
import kotlin.String

public data class Message(
  public val id: Long = 0,
  public val conversationId: String = "",
  public val senderId: Long = 0,
  public val recipientId: Long = 0,
  public val text: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val deviceId: String? = null,
)
