package com.equipobeta.friendzone.events;

import com.equipobeta.friendzone.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {


    List<Event> findAllByOwner(User owner);
}
