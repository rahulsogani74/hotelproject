package com.hotel.hotelproject.hotel.controller;
import com.hotel.hotelproject.hotel.*;
import com.hotel.hotelproject.hotel.pojo.*;
import com.hotel.hotelproject.hotel.repo.RoomTypeRepo;
import com.hotel.hotelproject.hotel.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GeneralController extends HotelRegister {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private HotelPojoService hotelPojoService;

    @Autowired
    private Service service;

    @Autowired
    private HotelBookingService hotelBookingService;

    @Autowired
    private HotelRoomService hotelRoomService;

    @Autowired
    private RoomTypeService roomTypeService;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private HotelOwnerService hotelOwnerService;

    @Autowired
    private HotelManagerService hotelManagerService;

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private UserService userService;
    public GeneralController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping("/register")
    public void registerHotel(@RequestBody Hotel hotel) {
        hotelService.register(hotel);
    }

    @PostMapping("/user")
    public void signup(@RequestBody UserInfo userInfo) {
        userService.signup(userInfo);
    }

    @GetMapping("/user")
    public Iterable<UserInfo> listUser() {
        //List<UserInfo> userInfo = new ArrayList<>();
        Iterable<UserInfo> allUser = userService.getAllUser();
        return allUser;
    }

    @GetMapping("/hotels")
    public ResponseEntity<List<Hotel>> getAllHotel () {
        return new ResponseEntity<>(hotelService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/hotel/{branch}")
    public List<Hotel> getHotelByBranch(@PathVariable("branch") String k) {
        return hotelService.getHotelByBranch(k);
    }

    @PostMapping("/register/hotelOwner")
    public void registerHotelOwner(@RequestBody  HotelOwner hotelOwner) {
        hotelOwnerService.register(hotelOwner);
    }

    @PostMapping("/register/hotelManager")
    public void registerHotelManager(@RequestBody HotelManager hotelManager) {
        hotelManagerService.register(hotelManager);
    }

    @PostMapping("/register/consumer")
    public void registerConsumer(@RequestBody Consumer consumer) {
        consumerService.register(consumer);
    }

    @PostMapping("/register/hotelRoom")
    public void registerHotelRoom(@RequestBody HotelRoom hotelRoom) {
        hotelRoomService.register(hotelRoom);
    }

    @PostMapping("/register/roomType")
    public void registerRoomType(@RequestBody RoomType roomType) {
        roomTypeService.register(roomType);
    }

    @PostMapping("/booking")
    public void registerHotelBooking(@RequestBody HotelBooking hotelBooking) {
        hotelBookingService.register(hotelBooking);
    }

    @PostMapping("/users/register")
    public ResponseEntity<String> registerUser(@RequestBody User user){
        service.register(user);
        ResponseEntity<String> response = service.register(user);
        String responseBody = response.getBody();
        System.out.println(responseBody);
        return response;
    }

    @PostMapping("/hotel/register")
    public ResponseEntity<String> registerHotel(@RequestBody HotelPojo hotelPojo){
        hotelPojoService.register(hotelPojo);
        ResponseEntity<String> response = hotelPojoService.register(hotelPojo);
        String responseBody = response.getBody();
        System.out.println(responseBody);
        return response;
    }



    @PostMapping("/booking/register")
    public ResponseEntity<String> registerBooking(@RequestBody Booking booking){
        bookingService.register(booking);
        ResponseEntity<String> response = bookingService.register(booking);
        String responseBody = response.getBody();
        System.out.println(responseBody);
        return response;
    }

    @Autowired
    QueryService queryService;

    @GetMapping("/hotelSearch")
    public List<Hotel> searchHotels(@RequestParam("branch") String branch, @RequestParam("priceRate") long priceRate) {
        return queryService.searchHotels(branch, priceRate);
    }

//    @GetMapping("/users")
//    public ResponseEntity<List<User>> getUsers() {
//        // Server-side logic to retrieve user details
//        boolean isConsumer = true;
//        boolean isHotelManager = true;
//        boolean isHotelOwner = true;
//        String message = isConsumer ? "User is a consumer" : "User is a hotel owner";
//        return new ResponseEntity<>(service.(HttpStatus.OK).body(message);
//    }


  /*  public List<Hotel> getHotelByHotelId(String id){
        return hotelService.getHotelByHotelId(id);
    }*/

/*
    public boolean deRegisterHotel(String id){
        return hotelService.removeHotel(id);
    }
*/
}
