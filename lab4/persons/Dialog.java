package lab3.persons;

import lab3.exceptions.InvalidLocationException;

public class Dialog {
    private Charachters speaker;
    private String message;
    public Dialog(Charachters speaker) {
        this.speaker = speaker;
    }
    public Charachters getSpeaker() {
        return this.speaker;
    }

    public String getMessage() {
        return this.message;
    }

    public void said(String message) {
        class Speaker {
            private String speakerName;
            public Speaker(String speakerName) {
                this.speakerName = speakerName;
            }
            public String getSpeaker() {
                return this.speakerName;
            }
        }
        Speaker speaker = new Speaker("Автор");
        this.message = message;
        System.out.println(speaker.getSpeaker() + ": " + getMessage());
    }
    public void saidTo(Charachters receiver, String message) {
        if (this.speaker.getLocation() != receiver.getLocation()) {
            throw new InvalidLocationException();
        }
        this.message = message;
        System.out.println(getSpeaker().getName() + " к " + receiver.getName() + ": " + getMessage());
    }

}
