package apollo.exercises.ch09_advanced;

public class SecuritySystem implements Alarm{
    private boolean alarmEnabled;
    private AlarmResponder alarmResponder;

    @Override
    public void setAlarmEnabled(Boolean enabled, String password) {
        {
            this.alarmEnabled=enabled;
            if(this.alarmEnabled) {
                System.out.println("Security system enabled");
            }else{
                System.out.println("Security system disabled");
            }
        }
    }

    public void setAlarmResponder(AlarmResponder responder){
        this.alarmResponder=responder;
    }

    public void detectIntruder(){
        this.alarmResponder.triggeredAlarm(this);
    }
}
