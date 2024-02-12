package com.pers.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;

@UtilityClass
public class ExpireDateUtil {
    public static LocalDate calculateExpireDate() {
        return LocalDate.now().plusYears(5);
    }
}
