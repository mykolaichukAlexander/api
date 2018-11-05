package api.server.api;

import lombok.Data;

@Data
public class ApiResponse {

    public enum  Status{
        ok,in_progress,error
    }
}
