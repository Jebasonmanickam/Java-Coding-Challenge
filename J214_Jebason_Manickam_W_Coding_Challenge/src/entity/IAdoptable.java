package entity;

import java.util.ArrayList; 
import java.util.List;

interface IAdoptable {
    void adopt();
}

// AdoptionEvent class
class AdoptionEvent {
    private List<IAdoptable> participants;

    public AdoptionEvent() {
        participants = new ArrayList<>();
    }

    // Host the adoption event
    public void hostEvent() {
        // Implement hosting of the event
    }

    // Register a participant for the event
    public void registerParticipant(IAdoptable participant) {
        participants.add(participant);
    }
}