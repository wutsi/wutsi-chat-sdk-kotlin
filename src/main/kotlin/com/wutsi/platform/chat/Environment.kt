package com.wutsi.platform.chat

import kotlin.String

public enum class Environment(
  public val url: String,
) {
  SANDBOX("https://wutsi-chat-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-chat-server-prod.herokuapp.com"),
  ;
}
