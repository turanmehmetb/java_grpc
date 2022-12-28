package grpc.client;

import grpc.generate.AddRequest;
import grpc.generate.AddResponse;
import grpc.generate.CancelRequest;
import grpc.generate.CancelResponse;
import grpc.generate.CarRentalServiceGrpc;
import grpc.generate.GetRequest;
import grpc.generate.GetResponse;
import grpc.generate.ListRequest;
import grpc.generate.ListResponse;
import grpc.generate.Reservation;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class CarRentalClient {
	static CarRentalServiceGrpc.CarRentalServiceBlockingStub stub;

	public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
          .usePlaintext()
          .build();

        stub 
          = CarRentalServiceGrpc.newBlockingStub(channel);
        
        Reservation reservation = Reservation.newBuilder().setPickupTime("11:00").setPickupLocation("ankara").setDropoffTime("12:10").setDropoffLocation("istanbul").setBrand("Ford").setModel("Focus").build();

        System.out.println("Reservation Count: " + list().getReservationsCount());

        System.out.println("\nCreated Reservation id: " + (add(reservation).getReservationId()));

        System.out.println("Reservation Count: " + list().getReservationsCount());
        
        System.out.println("\nReservation Info:\n" + get(0).getReservation().toString());
        
        reservation = Reservation.newBuilder().setPickupTime("11:00").setPickupLocation("ankara").setDropoffTime("12:10").setDropoffLocation("istanbul").setBrand("Toyota").setModel("Yaris").build();
        
        System.out.println("Created Reservation id: " + (add(reservation).getReservationId()));

        System.out.println("Reservation Count: " + list().getReservationsCount());

        System.out.println("\nCancelled Reservation id: " + cancel(0).getReservationId());
        
        System.out.println("Reservation Count: " + list().getReservationsCount());

        channel.shutdown();
    }
    
    public static GetResponse get(int reservationId) {
    	return stub.get(GetRequest.newBuilder().setReservationId(reservationId).build());
    }
    
    public static ListResponse list() {
    	return stub.list(ListRequest.newBuilder().build());
    }
    
    public static AddResponse add(Reservation reservation) {
    	return stub.add(AddRequest.newBuilder().setReservation(reservation).build());
    }
    
    public static CancelResponse cancel(int reservationId) {
    	return stub.cancel(CancelRequest.newBuilder().setReservationId(reservationId).build());
    }
    
}
