package com.wutsi.platform.chat.dto

import java.time.OffsetDateTime
import kotlin.Long
import kotlin.String

public data class Message(
  public val id: Long = 0,
  public val referenceId: String = "",
  public val conversationId: String = "",
  public val senderId: Long = 0,
  public val recipientId: Long = 0,
  public val text: String = "",
  public val timestamp: Long = 0,
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val deviceId: String? = null,
  public val received: OffsetDateTime? = null,
)
