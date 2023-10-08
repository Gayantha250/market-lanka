package lk.market.lanka.market.lanka.back.end.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardResponse {
    private int code;
    private String message;
    private Object object;

    public StandardResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
