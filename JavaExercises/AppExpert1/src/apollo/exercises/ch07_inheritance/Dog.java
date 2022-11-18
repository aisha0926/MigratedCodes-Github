package apollo.exercises.ch07_inheritance;

import apollo.exercises.ch09_advanced.Alarm;
import apollo.exercises.ch09_advanced.AlarmResponder;

public class Dog extends  Animal implements Alarm {
    private boolean isGuideDog;
    private boolean alarmEnabled;
    private AlarmResponder alarmResponder;

    public Dog(double weight, String sex, boolean isGuideDog) {
        super(weight, sex);
        this.isGuideDog = isGuideDog;
    }

    public Dog(double weight, String sex) {
        super(weight, sex);
    }

    @Override
    public void speak(){
        System.out.println("Woof");
    }

    public void setAlarmResponder(AlarmResponder responder){
        this.alarmResponder=responder;
    }

    public void detectIntruder(){
        this.alarmResponder.triggeredAlarm(this);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isGuideDog=" + super.toString() +
                '}';
    }

    public void command(String command){
        CommandParser parser = new CommandParser();
        parser.execute(command);
    }

    @Override
    public void setAlarmEnabled(Boolean enabled, String password) {
        this.alarmEnabled=enabled;
        if(this.alarmEnabled) {
            System.out.println("Dog is on alert");
        }else{
            System.out.println("Dog is resting");
        }
    }

    private class CommandParser{
        public void execute(String command){
            if(command.equals("Speak")){
                Dog.this.speak();
            } else {
                System.out.println("Incorrect command");
            }
        }
    }
}


