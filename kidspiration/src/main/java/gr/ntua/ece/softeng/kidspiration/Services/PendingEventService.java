package gr.ntua.ece.softeng.kidspiration.Services;

import gr.ntua.ece.softeng.kidspiration.Dao.PendingEventDao;
import gr.ntua.ece.softeng.kidspiration.PendingEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("PendingEventService")
public class PendingEventService implements EventService<PendingEvent> {

    @Autowired
    PendingEventDao pendingEventDao;

    public void addEvent(PendingEvent event) {  //checked
        System.out.println("Entering Event Service");
        pendingEventDao.addEvent(event);
    }

    public void editEvent(PendingEvent event, int id) {

    }

    public void deleteEvent(int id) {

    }

    public PendingEvent find(int id) {
        return null;
    }

    public List<PendingEvent> findAll() {
        return null;
    }
}