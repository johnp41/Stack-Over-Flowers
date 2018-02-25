package gr.ntua.ece.softeng.kidspiration.Dao;

import gr.ntua.ece.softeng.kidspiration.CurrentEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Qualifier("CurrentEventDao")
public class CurrentEventDao implements EventDao<CurrentEvent> {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addEvent(CurrentEvent event) {    //not checked

    }

    public void editEvent(CurrentEvent event, int event_id) {  //checking
        System.out.println("Entering CurrentEvent base for edit");
        jdbcTemplate.update("UPDATE CurrentEvents SET  title = ?, date = ?, starting_time = ?, place = ?, type = ?, ticket_cost = ?, initial_ticketsNumber = ?, available_ticketsNumber = ?, lowestAge = ?, highestAge = ?, longtitude = ?, latitude = ?, description = ? WHERE event_id = ? ",
               event.getTitle() , event.getDate(), event.getStarting_time(), event.getPlace(), event.getType(), event.getTicket_cost(), event.getInitial_ticketsNumber(), event.getAvailable_ticketsNumber(), event.getLowestAge(), event.getHighestAge(), event.getLongtitude(), event.getLatitude(), event.getDescription(), event_id);
        System.out.println("CurrentEvent Base edited!!");

        //event_id can be omitted, already included in event object
    }

    public void deleteEvent(int id) {  //not checked

    }

    public CurrentEvent find(int id) {   // checking
        System.out.println("Entering CurrentEvent Base for search");
        CurrentEvent event = jdbcTemplate.queryForObject("SELECT * FROM CurrentEvents where event_id = ? ",
                new Object[] { id }, new CurrentEventMapper());

        System.out.println("CurrentEvent Base search done");
        //probably can change to list

        return event;
    }

    public List<CurrentEvent> findAll() {    //not checked
        return null;
    }

    class CurrentEventMapper implements RowMapper<CurrentEvent> {

        public CurrentEvent mapRow(ResultSet rs, int rowNum) throws SQLException {

            int event_id = rs.getInt("event_id");
            int provider_id = rs.getInt("provider_id");
            String title = rs.getString("title");
            String date = rs.getString("date");
            String starting_time = rs.getString("starting_time");
            String place = rs.getString("place");
            String type = rs.getString("type");

            int ticket_cost = rs.getInt("ticket_cost");
            int initial_ticketsNumber = rs.getInt("initial_ticketsNumber");
            int available_ticketsNumber = rs.getInt("available_ticketsNumber");
            byte lowestAge = rs.getByte("lowestAge");
            byte highestAge = rs.getByte("highestAge");
            double longtitude = rs.getDouble("longtitude");
            double latitude = rs.getDouble("latitude");
            String description = rs.getString("description");

            CurrentEvent event = new CurrentEvent(event_id, provider_id, title, date, starting_time, place, type, ticket_cost, initial_ticketsNumber, lowestAge, highestAge, description, available_ticketsNumber, longtitude, latitude);

            return event;
        }
    }
}
