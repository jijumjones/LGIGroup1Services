package com.engineering.microservice.awsdynamodb.utils;

import java.time.LocalDate;

public class EmployeeUtils {

    private EmployeeUtils(){

    }

    public static boolean isDateGreaterThanToday(LocalDate date){
        return LocalDate.now().isBefore(date);
    }

}
