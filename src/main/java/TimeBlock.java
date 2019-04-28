import org.apache.tools.ant.taskdefs.Local;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeBlock {
    LocalDateTime startTime;
    LocalDateTime endTime;
    long lengthInMins;

    public TimeBlock() {

    }

    public TimeBlock(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
        lengthInMins = Duration.between(startTime, endTime).toMinutes();
    }

    //Getters

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public long getLengthInMins() {
        return lengthInMins;
    }

    //Setters

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setLengthInMins(int lengthInMins) {
        this.lengthInMins = lengthInMins;
    }

}
