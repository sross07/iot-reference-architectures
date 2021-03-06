package com.awslabs.iot.client.data;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public abstract class Notification {
    public abstract String getMessageId();

    public abstract String getUuid();
}
