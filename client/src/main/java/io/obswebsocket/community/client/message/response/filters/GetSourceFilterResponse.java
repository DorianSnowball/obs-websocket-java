package io.obswebsocket.community.client.message.response.filters;

import io.obswebsocket.community.client.message.response.RequestResponse;
import io.obswebsocket.community.client.model.Filter;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class GetSourceFilterResponse extends RequestResponse<GetSourceFilterResponse.Data> {
  public GetSourceFilterResponse() {
    super();
  }

  @Getter
  public static class Data extends Filter {
    private String sourceName;
  }
}