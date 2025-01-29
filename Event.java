package Day20;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Event {

    private String name;
    private LocalDateTime datetime;
    private Duration duration;

    // Constructor
    public Event(String name, LocalDateTime datetime, Duration duration) {
        this.name = name;
        this.datetime = datetime;
        this.duration = duration;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {

        List<Event> events = List.of(
            new Event("Meeting", LocalDateTime.of(2025, 1, 28, 14, 21), Duration.ofHours(1)),
            new Event("Workshop", LocalDateTime.of(2025, 1, 29, 8, 0), Duration.ofHours(4)),
            new Event("Workshop", LocalDateTime.of(2025, 1, 29, 6, 0), Duration.ofHours(4))
        );

        LocalDate filterDate = LocalDate.of(2025, 1, 29);

        List<Event> eventsOnDate = events.stream()
            .filter(event -> event.getDatetime().toLocalDate().equals(filterDate))
            .collect(Collectors.toList());

        System.out.println("Events on " + filterDate + ":");
        if (eventsOnDate.isEmpty()) {
            System.out.println("No events found.");
        } else {
            eventsOnDate.forEach(event -> System.out.println(event.getName()));
        }
        System.out.println("Time gaps between consecutive events:");
        List<Event> sortedEvents = events.stream()
                .sorted(Comparator.comparing(Event::getDatetime))
                .collect(Collectors.toList());
        for (int i = 0; i < sortedEvents.size() - 1; i++) {
            Event current = sortedEvents.get(i);
            Event next = sortedEvents.get(i + 1);

            Duration gap = Duration.between(current.getDatetime().plus(current.getDuration()), next.getDatetime());
            System.out.println("Duration between \"" + current.getName() + "\" and \"" + next.getName() + "\": " 
                + gap.toHours() + " hours " + (gap.toMinutes() % 60) + " minutes");
        }
    }
}
