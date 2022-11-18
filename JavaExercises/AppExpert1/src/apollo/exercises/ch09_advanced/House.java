package apollo.exercises.ch09_advanced;

import apollo.exercises.ch07_inheritance.Dog;

public class House {
    private Alarm[] alarms;

    public House() {
        alarms = new Alarm[2];
        Dog dog = new Dog(5.21, "Male", true);

        dog.setAlarmResponder(new AlarmResponder() {
            @Override
            public void triggeredAlarm(Alarm alarm) {
                System.out.println("Heard the dog barking");
            }
        });

        alarms[0] = dog;

        SecuritySystem securitySystem= new SecuritySystem();

        securitySystem.setAlarmResponder(new AlarmResponder() {
            @Override
            public void triggeredAlarm(Alarm alarm) {
                System.out.println("Heard the security system alarm");
            }
        });

        alarms[1] = securitySystem;
    }

    public void setAlarmsEnabled(Boolean enabled) {
        for (Alarm alarm : alarms) {

            alarm.setAlarmEnabled(enabled, null);
        }
    }

}
