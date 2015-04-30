package run;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;
import java.util.TimeZone;

/**
 * 지역시간
 */
@Slf4j
public class LocalTimes {
    public static void main(String[] args) {

        TimeZone seoul = TimeZone.getTimeZone("Asia/Seoul");

        LocalTime rightNow = LocalTime.now(seoul.toZoneId());
        log.info("rightNow: " + rightNow);
    }
}

