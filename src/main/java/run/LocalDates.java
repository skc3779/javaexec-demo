package run;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.TimeZone;

/**
 * Created by seokangchun on 15. 4. 30..
 */
@Slf4j
public class LocalDates {
    public static void main(String[] args) {

        TimeZone seoul = TimeZone.getTimeZone("Asia/Seoul");
        // 오늘 날짜
        LocalDate today = LocalDate.now(seoul.toZoneId());
        log.info("today: " + today);
    }
}
