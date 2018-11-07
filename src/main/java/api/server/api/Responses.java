package api.server.api;

public class Responses {
    public static <T> ApiResponse<T> okResp(T body, String message){
        ApiResponse<T> apiResponse = new ApiResponse<>(ApiResponse.Status.ok);
        apiResponse.setBody(body);
        apiResponse.setMessage(message);
        return apiResponse;
    }

    public static <T> ApiResponse<T> errorResp(String message){
        ApiResponse<T> apiResponse = new ApiResponse<>(ApiResponse.Status.error);
        apiResponse.setMessage(message);
        return apiResponse;
    }
}
