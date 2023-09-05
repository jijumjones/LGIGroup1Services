package com.engineering.microservice.awsdynamodb;

import com.engineering.microservice.awsdynamodb.utils.EmployeeUtils;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.time.LocalDate;


public class EmployeeUtilsTest {

    @Test
    public void test_isDateGreaterThanToday(){

        Assert.isTrue(
                EmployeeUtils.isDateGreaterThanToday(LocalDate.now().plusDays(1L)));

        Assert.isTrue(
                !EmployeeUtils.isDateGreaterThanToday(LocalDate.now().minusDays(1L)));

        Assert.isTrue(
                !EmployeeUtils.isDateGreaterThanToday(LocalDate.now()));

    }



}
