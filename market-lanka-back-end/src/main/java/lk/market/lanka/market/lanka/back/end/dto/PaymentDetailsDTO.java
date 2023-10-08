package lk.market.lanka.market.lanka.back.end.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PaymentDetailsDTO implements Serializable {

    private String creditCardNumber;
    private String holderName;
    private String bankName;
    private String selection;
}
