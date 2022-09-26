package com.example.graphqlspringboothb.repository;

import com.example.graphqlspringboothb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer> {

    public Room findByRoomNo(int roomNo);
}
