package com.easytwit;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TwitUtilities {

    public ZonedDateTime getCurrentDateTime() {
        return ZonedDateTime.now(ZoneId.of("ACT"));
    }

}
