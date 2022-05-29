package com.my.order.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private long userNo;
    private String userId;
    private String userGrade;
    private String userSavedMoney;

}
