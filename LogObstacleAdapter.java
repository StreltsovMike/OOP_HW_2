package org.example.lesson2.game;

public class LogObstacleAdapter implements Obstacle {
    
    private final Log log;

    public LogObstacleAdapter(Log log) {
        this.log = log;
    }

    @Override
    public boolean overcome(Participant participant) {
        return log.overcome(participant);
    }

    @Override
    public String type() {
        return "Бревно";
    }
    
}
