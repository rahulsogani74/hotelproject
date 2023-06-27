package com.hotel.hotelproject.hotel.repo;
import com.hotel.hotelproject.hotel.pojo.Consumer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepo extends CrudRepository<Consumer, Long> {

}
