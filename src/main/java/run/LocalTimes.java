package run;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;

/**
 * 지역시간
 */
@Slf4j
public class LocalTimes {
    public static void main(String[] args) {
        LocalTime rightNow = LocalTime.now();
        log.info("rightNow: " + rightNow);
    }
}

