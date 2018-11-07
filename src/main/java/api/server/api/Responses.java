package api.server.api;

public class Responses {
    public static <T> ApiResponse<T> okResp(T body){
        ApiResponse<T> apiResponse = new ApiResponse<>(api.server.api.ApiResponse.Status.ok);
        apiResponse.setBody(body);
        return apiResponse;
    }
}
